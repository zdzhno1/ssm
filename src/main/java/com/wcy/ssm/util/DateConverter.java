package com.wcy.ssm.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {
    //private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
    /*
        SimpleDateFormat定义为局部变量还是成员变量还是静态变量？
        1.对象是否线程安全？
            线程不安全，定义局部变量
        2.对象所属外部对象是单例还是多例的？
            单例对象：定义成员变量、静态变量均可
            多例对象：定义静态变量

    */
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
