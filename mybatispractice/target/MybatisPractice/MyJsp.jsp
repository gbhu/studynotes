<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
	String newLocn = "http://localhost:8080/sd/index.html#/raise/raise-list";
	response.setHeader("Location",newLocn);
%>


