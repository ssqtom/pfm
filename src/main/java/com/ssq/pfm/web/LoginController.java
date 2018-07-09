package com.ssq.pfm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName:LoginController 登录控制器 <br/>
 * Function: <br/>
 * date: 2018/7/9 下午4:58<br/>
 *
 * @author sushiqi<br />
 * @since JDK 1.8
 */
@Controller

public class LoginController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
