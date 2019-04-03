package com.ele.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @Description 特殊字符
 * @Author zzw
 * @Date 2019年4月3日18:31:47
 */
public class StringSpecial {

    public static void main(String[] args) {
        //带有特殊符号字符串示例
        String str = "%'?？我的名字“”\"（测试）";

//        //去除特殊字符内容 其中的“（）”为特殊字符
////        str.replaceAll("[^0-9a-zA-Z\u4e00-\u9fa5.，,。？“”]+","");
//        str.replaceAll("[%'?？“”\"]","");
//
//        //去除特殊符号后字符串内容：
//        System.out.println("" + str);

        System.out.println(StringFilter(str));
    }


    // 过滤特殊字符
    public static String StringFilter(String str) throws PatternSyntaxException {
    // 只允许字母和数字
        // String regEx ="[^a-zA-Z0-9]";
        // 清除掉所有特殊字符
        //String regEx="[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
        String regEx = "[%'?？“”\"]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
}
}
