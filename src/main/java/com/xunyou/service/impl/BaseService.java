package com.xunyou.service.impl;

import com.xunyou.exception.Fail;
import org.omg.CORBA.DATA_CONVERSION;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BaseService {
   public String  DateToString(Date date){
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       return formatter.format(date);

    }

    public Date StringToDate(String date) throws ParseException {
        if (null==date) return  null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date newDate = null;
        newDate = sdf.parse(date);
        return  newDate;
    }



}
