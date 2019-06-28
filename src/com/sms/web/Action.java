package com.sms.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.sms.DAO.BrandInfoDAO;
import com.sms.DAO.UserInfoDAO;
import com.sms.DAOImpl.BrandInfoDAOImpl;
import com.sms.DAOImpl.UserInfoDAOImpl;
import com.sms.beans.BrandInfo;
import com.sms.beans.UserInfo;

public class Action extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(test.class);

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置request、response字符编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		// 获取请求完整路径
		String url = request.getRequestURI();
		logger.info("访问路径为：" + url);
		// 截取请求
		String path = url.substring(url.lastIndexOf("/"), url.lastIndexOf("."));
		logger.info("请求为：" + path);
		// 创建user实例
		UserInfoDAO userInfo = new UserInfoDAOImpl();
		BrandInfoDAO brandInfo = new BrandInfoDAOImpl();
		// 判断请求
		if (path.equals("/login")) {
			// 获取文本框输入的用户名密码
			String userId = request.getParameter("userId");
			String passWord = request.getParameter("passWord");
			logger.info("用户[" + userId + "]请求登陆！");
			// 判断数据库是否存在该用户
			String findUserName = userInfo.findUserNameById(userId);
			if (findUserName != null && !"".equals(findUserName)) {
				boolean flag = userInfo.userLogin(userId, passWord);
				// 是 -> 重定向到首页；
				// 否 -> 重定向到注册页面；
				if (flag) {
					logger.info("用户[" + userId + "]登陆成功！");
					String userName = userInfo.findUserNameById(userId);
					UserInfo user = new UserInfo(userName);
					request.getSession().setAttribute("user", user);
					response.sendRedirect("homePage.jsp");
				} else {
					logger.error("用户[" + userId + "]密码错误！");
					response.sendRedirect("login.jsp");
				}
			} else {
				logger.error("用户[" + userId + "]不存在！");
				response.sendRedirect("form_validate.jsp");
			}
		} else if (path.equals("/logout")) {
			UserInfo user = (UserInfo) request.getSession().getAttribute("user");
			logger.info("用户[" + user.getUserName() + "]退出登陆！");
			request.getSession().removeAttribute("user");
			response.sendRedirect("login.jsp");
		} else if (path.equals("/userAdd")) {
			String username = request.getParameter("userName");
			String password = request.getParameter("password");
			userInfo.userAdd(username, password);
			UserInfo usName = new UserInfo(username);
			System.out.println(usName.getUserName());
			request.getSession().setAttribute("user", usName);
			response.sendRedirect("homePage.jsp");
		} else if (path.equals("/productList")) {
			List<BrandInfo> brandList = brandInfo.findAll();
			System.out.println(brandList.size());
			request.getSession().setAttribute("brandList", brandList);
			response.sendRedirect("productList.jsp");
		}
	}

}
