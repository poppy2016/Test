package cn.hih.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hih.beans.User;
import cn.hih.bll.IUserBLL;
import cn.hih.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserBLL userBLL;
	
	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return userBLL.get();
	}

}
