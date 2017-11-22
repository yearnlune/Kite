package yeon.kite.cust.controller;


import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import yeon.kite.cust.service.UserService;
import yeon.kite.cust.vo.UserVO;

@Controller
public class UserController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value="viewUserList.do")
	public String viewUserList(Model model, String queryId) throws Exception {
		List<UserVO> list = userService.selectUserList(queryId);
		model.addAttribute("list" , list);
		return "user";
	}

}