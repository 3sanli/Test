package cn.sanli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sanli.entity.User;
import cn.sanli.mapper.UserMapper;
import cn.sanli.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void add(User u) {
		userMapper.addUser(u);
	}

	@Override
	public User getByUsername(String username) {
		User user = userMapper.getByUsername(username);
		return user;
	}

	@Override
	public List<User> getAll() {
		List<User> list = userMapper.getAll();
		return list;
	}

	@Override
	public void modify(User u) {
		userMapper.modifyUser(u);
		
	}

	@Override
	public void deleteByUsername(String username) {
		userMapper.deleteUser(username);
	}

}
