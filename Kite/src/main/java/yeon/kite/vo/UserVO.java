package yeon.kite.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable{
	
	/*
	 * @Class Name : UserVO.java
	 * @Description : UserVO VO Class
	 * @Table : KITE_USER
	 * @Modification Information
	 * 
	 * @author Dong Hwan, Kim
	 * @since 2017-11-20
	 * @version 1.0
	 * @see
	 * 
	 * 
	 * 	== 개정이력(Modification Information) ==
	 *
	 *   수정일      	                     수정자                       수정내용
	 *  ------------   --------    ---------------------------
	 *   2017.11.20		김동환		           최초 생성
	 * 
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private int userNo;
	private String userID;
	private String userPW;
	private String userNicname;
	private int userGender;
	private int userAge;
	private String userArea;
	private Date userDate;
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPW() {
		return userPW;
	}
	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}
	public String getUserNicname() {
		return userNicname;
	}
	public void setUserNicname(String userNicname) {
		this.userNicname = userNicname;
	}
	public int getUserGender() {
		return userGender;
	}
	public void setUserGender(int userGender) {
		this.userGender = userGender;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserArea() {
		return userArea;
	}
	public void setUserArea(String userArea) {
		this.userArea = userArea;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
		
}
