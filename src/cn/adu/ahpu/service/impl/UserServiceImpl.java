package cn.adu.ahpu.service.impl;

import cn.adu.ahpu.dao.UserDao;
import cn.adu.ahpu.dao.impl.UserDaoImpl;
import cn.adu.ahpu.domain.User;
import cn.adu.ahpu.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao ud = new UserDaoImpl();

	@Override
	public User login(User u) {
		User user = null;
		Boolean islogin = ud .getByPassword(u.getUser_password());
		if(!islogin){
			throw new RuntimeException("密码错误！");
		}
		else if(!u.getUser_name().startsWith("ahpu_")){
			throw new RuntimeException("用户名不符合规定！");
		}
		return u;
	}

}
