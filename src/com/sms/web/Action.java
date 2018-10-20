package com.sms.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.DAO.UserInfoDAO;
import com.sms.DAOImpl.UserInfoDAOImpl;
import com.sms.beans.UserInfo;

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
			//获取文本框输入的用户名密码
			String userName = request.getParameter("username");
			String passWord = request.getParameter("password");
			UserInfo user = new UserInfo(userName);
			//判断数据库是否存在该用户
			boolean flag = userInfo.userLogin(userName, passWord);
			//是 -> 重定向到首页；
			//否 -> 重定向到注册页面；
			if (flag == true) {
				request.getSession().setAttribute("user", user);
				response.sendRedirect("homePage.jsp");
			} else {
				response.sendRedirect("userRegister.jsp");
			}
		} else if (path.equals("/userAdd")) {
			String username = request.getParameter("userName");
			String password = request.getParameter("password");
			userInfo.userAdd(username, password);
			
			UserInfo usName = new UserInfo(username);
			System.out.println(usName.getUserName());
			request.getSession().setAttribute("user", usName);
			response.sendRedirect("homePage.jsp");
		}
	}

}
