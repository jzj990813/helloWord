package com.jian.utils.DataUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtils {
    

    public static Date StringCastDate(String yearmonth) {
        try {
            Date date=null;
            if (yearmonth.trim().length()==10){
                 date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(yearmonth);
            }else if (yearmonth.trim().length()==8){
                StringBuffer stringBuffer = new StringBuffer(yearmonth);
                stringBuffer.insert(4, "-");
                stringBuffer.insert(7, "-");
                date = new SimpleDateFormat("yyyy-MM-dd").parse(stringBuffer.toString());
            }

            return date;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return new Date();
        }
    }
public static String DateCastString(Date date){
    String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    return format;
}


    public static void main(String[] args) {
        Date date = StringCastDate("20220102");
        System.out.println(date);
        Date dated=new Date();
        String s = DateCastString(dated);
        System.out.println(s);

    }
}