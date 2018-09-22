package com.thisy.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author xiechenjie
 * @version 1.0
 * @ProjectName manager
 * @ClassName UserDataController
 * @create 2018-09-22 15:42
 **/
@Controller
@RequestMapping("/view")
public class UserDataController {
   @RequestMapping("/test")
    public String test(){
        return "index";
    }

}
