package com.jian.utils.StringUtil;


public class StringUtils {

/**
 * @annotation 判断字符串是否为空
 * @author xiaojian
 * @date 2022/8/12 14:45
 * @param str
 * @return 为空返回ture
 */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
/**
 * @annotation 判断字符串是否不为空
 * @author xiaojian
 * @date 2022/8/12 14:45
 * @param str
 * @return 不为空返回true
 */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
/**
 * @annotation  按照指定字符截取字符串
 * @author xiaojian
 * @date 2022/8/12 14:54
 * @param str
 * @param regex
 * @return String[]
 */

    public String[] StrSplit(String str,String regex){
        String[] split = str.split(regex);
        return  split;
    }
}
