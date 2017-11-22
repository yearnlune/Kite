package yeon.kite.cust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import yeon.kite.cust.dao.UserDAO;
import yeon.kite.cust.service.UserService;
import yeon.kite.cust.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="userDAO")
	private UserDAO userDAO;
	
	@Override
	public List<UserVO> selectUserList(String queryId) 
			throws Exception {
		
		return userDAO.selectUserList();
	}

}
