package cn.hih.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hih.beans.User;
import cn.hih.service.IUserService;

@Controller()
public class UserController {
	@Autowired
	private IUserService userService;
	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);  
	
	@ResponseBody
	@RequestMapping("/get")
	public List<User> get(){
		LOG.info("测试日志");
		return userService.get();
	}
}
