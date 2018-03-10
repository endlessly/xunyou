package com.xunyou.service.impl;

import org.omg.CORBA.DATA_CONVERSION;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseService {
   public String  DateToString(Date date){
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
       return formatter.format(date);

    }

}
