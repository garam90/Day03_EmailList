package com.sds.icto.emaillist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sds.icto.emaillist.vo.EmailVO;

public class EmailDAO {

	public void insert(EmailVO vo){
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			conn = DriverManager.getConnection(url, "webdb", "webdb");
			String sql = "insert email_list valuse (email_list_no_pk.nextval, ?, ?, ?)";
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, vo.getFirstName());
			stmt.setString(2, vo.getLastName());
			stmt.setString(3, vo.getEmail());
			stmt.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	public ArrayList<EmailVO> selectList(){
		ArrayList<EmailVO> list = new ArrayList<EmailVO>();
		
		
		return list;
	}
	
}
