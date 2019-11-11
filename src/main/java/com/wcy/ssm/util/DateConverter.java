package com.wcy.ssm.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    //private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
    @Override
    public Date convert(String source) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");//SimpleDateFormat线程不安全
        try {
            date = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
