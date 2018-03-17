package com.xunyou.action.hotel;

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
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
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
        HotelEntity hotelEntity = new HotelEntity();
        String hotel = JsonUtil.toJson(modelMap.get("hotel"));
        Map hotelMap = JsonUtil.JsonTomap(hotel);
        String openEndTime = hotelMap.get("openEndTime").toString();
        String openStartTime = hotelMap.get("openStartTime").toString();

        hotelMap.remove("openEndTime");
        hotelMap.remove("openStartTime");
        hotelEntity = MapEntryConvet.toBean(hotelEntity.getClass(), hotelMap);
        hotelEntity.setOpenStartTime(baseService.StringToDate(openStartTime));
        hotelEntity.setOpenEndTime(baseService.StringToDate(openEndTime));

        int result = hotelService.addHotel(hotelEntity);
        if (result == 0)
            return res.fail("添加失败", "");
        return res.success("添加成功", hotelEntity);
    }
    @ResponseBody
    @RequestMapping(value = "hotel/update")
    public ResultMsgDto updateHotel(HttpServletRequest request, HttpServletResponse response) throws Fail,
            ParseException {
        HotelEntity hotelEntity = new HotelEntity();
        String title = request.getParameter("title");
        String address = request.getParameter("address");

        String lon = request.getParameter("lon");

        String lat = request.getParameter("lat");

        String tel = request.getParameter("tel");
        Integer id = Integer.valueOf(request.getParameter("id"));
        String content = request.getParameter("content");
        if (id == null) {
            throw new Fail("请输入酒店id");
        } else {
            hotelEntity.setId(id);
            hotelEntity = hotelService.getHotelEntity(hotelEntity);
            if (hotelEntity == null) throw new Fail("查询的酒店不存在");
            if (null != title) hotelEntity.setTitle(title);
            if (null != address) hotelEntity.setAddress(address);
            if (null != lon) hotelEntity.setLon(lon);
            if (null != lat) hotelEntity.setLat(lat);
            if (null != request.getParameter("openEndTime"))  hotelEntity.setOpenEndTime(baseService.StringToDate(request.getParameter("openEndTime")));
            if (null != request.getParameter("openStartTime"))  hotelEntity.setOpenStartTime(baseService.StringToDate(request.getParameter("openStartTime")));
            if (null != tel) hotelEntity.setTel(tel);
            if (null != content) hotelEntity.setContent(content);
            int result = hotelService.updateHotel(hotelEntity);
            if (0 == result) throw new Fail("更新失败");
            return res.success("更新成功", "");
        }
    }
    public ResultMsgDto addHotelAlbum(@RequestBody ModelMap modelMap){



        return  null;
    }


}