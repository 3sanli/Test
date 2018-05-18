package cn.adu.ahpu.service.impl;

import cn.adu.ahpu.dao.UserDao;
import cn.adu.ahpu.dao.impl.UserDaoImpl;
import cn.adu.ahpu.domain.User;
import cn.adu.ahpu.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao ud = new UserDaoImpl();

	@Override
	public User login(User u) {
		User user = ud .getByUserName(u.getUser_name());
		if(user == null){
			throw new RuntimeException("没有该用户!");
		}
		else if(!user.getUser_password().equals(u.getUser_password())){
			throw new RuntimeException("密码错误!");
		}
		return user;
	}

}
