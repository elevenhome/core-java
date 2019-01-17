package com.ele.String;

import java.net.URLEncoder;

/**
 * @ClassName StringFormat
 * @Description TODO
 * @Author zzw
 * @Date
 */

//String url = "http://open.ikanshu.cn/qxt/smspush.aspx?usercode=1004&code=8a7f91ebe3955347dd8af73fe437facb&phonenumber=" + phoneNumber + "&msg=" + URLEncoder.encode(msg, "UTF-8");

public class StringFormat {

    public static void main(String[] args) throws Exception{

        String templet = "【中文书城】您的验证码为：%s，请勿泄露。如非本人操作，请忽略此短信，谢谢！";
        String checkNum = "123456";
        String msg = String.format(templet, checkNum);
        System.out.println(msg);
        msg = URLEncoder.encode("您好", "UTF-8");
        System.out.println(msg);

        String phone = "15810490536";
        String url = "http://open.ikanshu.cn/qxt/smspush.aspx?usercode=1004&code=8a7f91ebe3955347dd8af73fe437facb&phonenumber=%s&msg=%s";

        System.out.println(String.format(url,phone,msg));
    }
}
