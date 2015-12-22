package cn.hih.bll.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.hih.beans.User;
import cn.hih.bll.IUserBLL;
import cn.hih.dao.IUserMapper;
@Component
public class UserBLL implements IUserBLL {
	@Autowired
	private IUserMapper mapper; 
	
	@Override
	public List<User> get() {
		// TODO Auto-generated method stub
		return mapper.get();
	}

}
