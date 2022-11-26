package com.study.service;

import java.util.List;

import com.study.dao.UserInfoDAO;
import com.study.vo.UserInfoVO;

public class UserInfoService {

	private UserInfoDAO uiDAO = new UserInfoDAO();
	
	public List<UserInfoVO> getUserInfos(UserInfoVO userInfoVO){
		return uiDAO.selectUserInfos(userInfoVO);
	}
	public static void main(String[] args) {
		UserInfoDAO dao = new UserInfoDAO();
		System.out.println(dao.selectUserInfos(null));
	}
}
