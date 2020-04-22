package cn.jiyun.zjxdemo.cn.jiyun.zjxdemo.UserControoler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class user {

    @RequestMapping("index")
    public  String get1(){
        return  "以按时出勤为荣！！";
    }
     @RequestMapping("index1")
    public  String get1(){
        return  "以勤学善问为荣！！";
    }
}
