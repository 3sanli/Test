package cn.adu.ahpu.dao;

import cn.adu.ahpu.domain.User;

public interface UserDao {

	User getByUserName(String user_name);

}
