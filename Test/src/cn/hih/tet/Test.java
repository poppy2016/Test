package cn.hih.tet;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hih.beans.User;
import cn.hih.dao.IUserMapper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-mybati.xml")
//@Configuration("/spring-mybati.xml")
public class Test {
	@Autowired
	private IUserMapper mapper;
	
	@org.junit.Test
	public void test(){
		List<User> list= mapper.get();
		System.out.println(list);
		
	}
}
