package cn.adu.ahpu.dao;

import cn.adu.ahpu.domain.User;

public interface UserDao {

	User getByUserName(String user_name);
	//通过判断user密码是否为123；
	Boolean getByPassword(String user_password);

}
