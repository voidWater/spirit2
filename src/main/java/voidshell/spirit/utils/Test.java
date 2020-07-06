package voidshell.spirit.utils;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.servlet.http.HttpServletRequest;

public class Test {
    public static void main(String[] args) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();


        System.out.println(HttpClientUtils.sendGetRequest("https://blog.csdn.net/BeauXie/article/details/78552919",null,null));
    }
}
