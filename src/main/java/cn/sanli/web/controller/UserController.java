package cn.sanli.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sanli.entity.User;
import cn.sanli.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 添加和修改的方法
	 * @param user
	 * @param model
	 * @return view
	 */
	@RequestMapping(value="/addUser.action")
	private String addUser(User u,Model model) {
		User tempUser = userService.getByUsername(u.getUsername());
		if(tempUser!=null) {
			userService.modify(u);
			return "redirect:/listUser.action";
		}
		userService.add(u);
		User user = userService.getByUsername(u.getUsername());
		model.addAttribute("user", user);
		return "redirect:/listUser.action";
	}
	@RequestMapping("/listUser.action")
	private String listUser(Model model) {
		List<User> list = userService.getAll();
		model.addAttribute("list", list);
		return "listUser";
	}
	@RequestMapping("/searchUser.action")
	private String searchUser(User u,Model model) {
		User user = userService.getByUsername(u.getUsername());
		model.addAttribute("list", user);
		return "listUser";
	}
	
	//deleteUser.action
	@RequestMapping("/deleteUser.action")
	private String deleteUser(String username,Model model) {
		userService.deleteByUsername(username);
		List<User> list = userService.getAll();
		model.addAttribute("list", list);
		return "listUser";
	}
}
