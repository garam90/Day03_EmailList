package com.sds.icto.email.test;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sds.icto.emaillist.dao.EmailDAO;
import com.sds.icto.emaillist.vo.EmailVO;

public class TestEmailListDao {

	public static void main(String[] args) {
		try {
			//insertTest
//			testInsert();
			//ListTest
			//delete();
			delete((long) 1);
			emailList();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void testInsert() throws ClassNotFoundException, SQLException{
		EmailVO vo = new EmailVO();
		vo.setFirstName("garam");
		vo.setLastName("na");
		vo.setEmail("garam@naver.com");
		
		EmailDAO dao = new EmailDAO();
		dao.insert(vo);
	}
	
	public static void emailList() throws ClassNotFoundException, SQLException{
		EmailDAO dao = new EmailDAO();
		ArrayList<EmailVO> list = dao.selectList();
		for (EmailVO emailVO : list) {
			System.out.println(emailVO);
		}
	}
	
	public static void delete() throws ClassNotFoundException, SQLException{
		EmailDAO dao = new EmailDAO();
		dao.delete();
	}
	
	public static void delete(Long id) throws ClassNotFoundException, SQLException{
		EmailDAO dao = new EmailDAO();
		dao.delete(id);
	}
	
	
}
