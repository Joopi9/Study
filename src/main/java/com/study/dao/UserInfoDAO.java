package com.study.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.study.common.DBCon;
import com.study.vo.UserInfoVO;

public class UserInfoDAO {

	public List<UserInfoVO> selectUserInfos(UserInfoVO userInfo){
		List<UserInfoVO> list = new ArrayList<>();
		try(Connection con = DBCon.getCon()){
			String sql = "select * from user_info";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getLong("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				list.add(ui);
			}
		}catch(Exception e) {
			
		}
		return list;
	}
}
