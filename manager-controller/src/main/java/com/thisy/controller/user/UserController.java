package com.thisy.controller.user;

import com.thisy.entity.user.User;
import com.thisy.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 视图交互层
 */
@RestController
@RequestMapping("/test")
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@RequestMapping("/user")
	public User test(){
		return  userService.findUser(123796);
	}
}
