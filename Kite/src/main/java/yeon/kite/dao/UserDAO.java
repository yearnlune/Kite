package yeon.kite.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import yeon.kite.cmm.dao.AbstractDAO;
import yeon.kite.vo.UserVO;

@Repository("userDAO")
public class UserDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<UserVO> selectList(String queryId) {
		// TODO Auto-generated method stub
		return super.selectList("UserDAO.selectUserList");
	}
}
