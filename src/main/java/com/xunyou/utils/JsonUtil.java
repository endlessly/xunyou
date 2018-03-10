package com.xunyou.utils;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016-12-5 0005.
 */

public class JsonUtil {

//    private JsonUtil() {
//        //工具类无需对象实例化
//    }

    private static JavaType getCollectionType(Class<?> collectionClass, Class<?>... elementClasses) {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.getTypeFactory().constructParametricType(collectionClass, elementClasses);
    }

    public static String toJson(Object object, boolean isFormat) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        if (isFormat) {
            return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        } else {
            return mapper.writeValueAsString(object);
        }
    }

    public static String toJson(Object object) throws JsonProcessingException {
        return toJson(object, false);
    }

    public static <T> T toObject(String content, Class<T> c)
            throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(content, c);
    }

    public static <T> List<T> toListObject(String content, Class<T> c) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType t = getCollectionType(ArrayList.class, c);
        return (List<T>) mapper.readValue(content, t);
    }

    public static <T> Map<String, T> toMapObject(String content, Class<T> c) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        JavaType t = getCollectionType(HashMap.class, String.class, c);
        return (Map<String, T>) mapper.readValue(content, t);
    }

    public static Map JsonTomap(String json) {
        Map maps = (Map) JSON.parse(json);
        return maps;
    }

    private <T> Map<String, Object> EntToMap(Object model, Class<T> t, Map<String, Object> map) {
        try {
            Field[] fields = t.getDeclaredFields();
            if (fields.length > 0 && map == null)
                map = new HashMap<String, Object>();
            for (Field f : fields) {
                String name = f.getName();
                name = name.substring(0, 1).toUpperCase() + name.substring(1); //将属性的首字符大写，方便构造get，set方法
                Method m = model.getClass().getMethod("get" + name);
                String value = String.valueOf(m.invoke(model));
                if (map != null && value != null)
                    map.put(f.getName(), value);
                else
                    map.put(f.getName(), "");
            }
            if (t.getSuperclass() != null) {
                EntToMap(model, t.getSuperclass(), map);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    /**
     * 实体类转成Map对象
     *
     * @param model
     * @return
     */
    public <T> Map<String, Object> Entity2Map(Object model) {
        Map<String, Object> map = null;
        try {
            map = EntToMap(model, model.getClass(), map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}