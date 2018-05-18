package cn.adu.ahpu.dao.impl;

import java.util.ResourceBundle;

import cn.adu.ahpu.dao.UserDao;
import cn.adu.ahpu.domain.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User getByUserName(String user_name) {
		User user = null;
		String propertyFileName = "cn/adu/ahpu/property/user";
		ResourceBundle bundle = ResourceBundle.getBundle(propertyFileName);
		String [] usernames = bundle.getString("username").split(",");
		String [] passwords = bundle.getString("password").split(",");
		for(int i=0;i<usernames.length;i++){
			if(usernames[i].equals(user_name)){
				user = new User();
				user.setUser_name(user_name);
				user.setUser_password(passwords[i]);
			}
		}
		
		return user;
	}

}
