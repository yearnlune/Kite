package yeon.kite.cust.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import yeon.kite.cmm.dao.AbstractDAO;
import yeon.kite.cust.vo.UserVO;

@Repository("userDAO")
public class UserDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<UserVO> selectUserList() {
		// TODO Auto-generated method stub
		return (List<UserVO>)selectList("UserDAO.selectUserList");
	}
}
