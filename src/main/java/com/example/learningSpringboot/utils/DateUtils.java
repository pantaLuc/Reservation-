package com.example.learningSpringboot.utils;


import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Component
public class DateUtils {
    public Date createDateFromString(String stringDate) throws ParseException {
        DateFormat  dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        if(StringUtils.hasText(stringDate)){
           try{
               date= (Date) dateFormat.parse(stringDate);
           } catch (ParseException e){
               date =new Date();
           }
        }else{
            date =new Date();
        }
       return  date;
    }
}
