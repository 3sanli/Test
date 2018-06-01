package cn.sanli.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.sanli.entity.User;

public interface UserMapper {
	//添加用户
	void addUser(User u);
	//根据用户名查询用户
	User getByUsername(String username);
	//根据user对象修改用户只允许修改用户口令
	void modifyUser(User u);
	//根据user对象删除用户
	void deleteUser(String username);
	//查询所有用户
	List<User> getAll();
}
