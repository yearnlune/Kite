package yeon.kite.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import yeon.kite.dao.UserDAO;
import yeon.kite.service.UserService;
import yeon.kite.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="userDAO")
	private UserDAO userDAO;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<UserVO> selectUserList(String queryId) {
		return userDAO.selectList(queryId);
	}

}
