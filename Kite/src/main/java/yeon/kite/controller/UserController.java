package yeon.kite.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yeon.kite.service.UserService;
import yeon.kite.vo.UserVO;

@Controller
public class UserController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping(value="viewUserList.do")
	public ModelAndView viewUserList(String queryId) throws Exception {
		ModelAndView mv = new ModelAndView("/user");
		
		List<UserVO> list = userService.selectUserList(queryId);
		mv.addObject("list", list);
		return mv;
	}

}
