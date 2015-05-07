<%@page import="com.sds.icto.emaillist.dao.EmailDAO"%>
<%@page import="com.sds.icto.emaillist.vo.EmailVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	//이메일을 등록
	String fn = request.getParameter("fn");	
	String ln = request.getParameter("ln");	
	String email = request.getParameter("email");
	
	EmailVO vo = new EmailVO();
	vo.setFirstName(fn);
	vo.setLastName(ln);
	vo.setEmail(email);
	
	EmailDAO dao = new EmailDAO();
	dao.insert(vo);
	
	response.sendRedirect("email");	

%>
