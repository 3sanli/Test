package cn.sanli.mapper;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.sanli.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void testJDBCSelect() {
		
		String username="ll";
		User user = userMapper.getByUsername(username);
		System.out.println(user);
	}
	@Test
	public void testJDBCAdd() {
		
		User u = new User();
		u.setUsername("刘晓东");
		userMapper.addUser(u);
	}
	@Test
	public void testJDBCModify() {
		
		User u = new User();
		u.setUsername("刘晓东");
		u.setPassword("123");
		userMapper.modifyUser(u);
	}
	@Test
	public void testJDBCDelete() {
		
		User u = new User();
		u.setUsername("刘晓东");
		userMapper.deleteUser(u.getUsername());
	}

}
