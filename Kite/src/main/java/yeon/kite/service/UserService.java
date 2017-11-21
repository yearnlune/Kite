package yeon.kite.service;

import java.util.List;

import yeon.kite.vo.UserVO;

public interface UserService {

	public List<UserVO> selectUserList(String queryId);

}
