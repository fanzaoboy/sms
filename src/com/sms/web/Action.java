package com.sms.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.DAO.UserInfoDAO;
import com.sms.DAOImpl.UserInfoDAOImpl;

public class Action extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置request、response字符编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 获取请求完整路径
		String url = request.getRequestURI();
		System.out.println(url);
		// 截取请求
		String path = url.substring(url.lastIndexOf("/"), url.lastIndexOf("."));
		System.out.println("path:" + path);
		// 创建user实例
		UserInfoDAO userInfo = new UserInfoDAOImpl();
		// 判断请求
		if (path.equals("/login")) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			System.out.println(username + " " + password);
			boolean flag = userInfo.userLogin(username, password);
			if (flag == true) {
				response.sendRedirect("homePage.jsp");
			} else {
				response.sendRedirect("userRegister.jsp");
			}
		} else if (path.equals("/userAdd")) {
			String username = request.getParameter("userName");
			String password = request.getParameter("password");
			System.out.println(username + " " + password);
			userInfo.userAdd(username, password);
			response.sendRedirect("homePage.jsp");
		}
	}

}
