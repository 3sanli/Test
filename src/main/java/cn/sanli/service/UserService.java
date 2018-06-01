package cn.sanli.service;

import java.util.List;

import cn.sanli.entity.User;

public interface UserService {

	void add(User u);

	User getByUsername(String username);
	List<User> getAll();
	void modify(User u);
	void deleteByUsername(String username);
}
