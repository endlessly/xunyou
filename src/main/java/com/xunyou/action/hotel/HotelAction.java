package com.xunyou.action.hotel;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.mysql.jdbc.PacketTooBigException;
import com.xunyou.action.Base;
import com.xunyou.exception.Fail;
import com.xunyou.model.HotelEntity;
import com.xunyou.service.hotel.HotelService;
import com.xunyou.service.impl.BaseService;
import com.xunyou.utils.JsonUtil;
import com.xunyou.utils.MapEntryConvet;
import com.xunyou.utils.ResultMsgDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class HotelAction extends Base {
    @Autowired
    HotelService hotelService;
    @Autowired
    BaseService baseService;

    @ResponseBody
    @RequestMapping(value = "hotel/add")
    public ResultMsgDto addHotel(@RequestBody ModelMap modelMap) throws PacketTooBigException, Fail, JsonProcessingException, ParseException {
    HotelEntity  hotelEntity =new HotelEntity();
    String hotel= JsonUtil.toJson(modelMap.get("hotel"));
        Map hotelMap=JsonUtil.JsonTomap(hotel);

//        String Stringdate=JSON.
//        System.out.println(Stringdate);
//        hotelMap.put("openStartTime",baseService.StringToDate(Stringdate));
    hotelEntity= MapEntryConvet.toBean(hotelEntity.getClass(),hotelMap);
    int result=hotelService.addHotel(hotelEntity);
    if(result==0)
     return  res.fail("添加失败","");
     return  res.success("添加成功",hotelEntity);
    }




}