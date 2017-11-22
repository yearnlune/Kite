package yeon.kite.cust.service;

import java.util.List;

import yeon.kite.cust.vo.UserVO;

public interface UserService {

	public List<UserVO> selectUserList(String queryId) throws Exception;

}