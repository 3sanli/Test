package cn.adu.ahpu.service;

import cn.adu.ahpu.domain.User;

public interface UserService {
	//用户登录，并返回一个user对象
	User login(User u);

}
