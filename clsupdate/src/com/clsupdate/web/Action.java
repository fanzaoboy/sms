package com.clsupdate.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.clsupdate.DAO.CustomerDAO;
import com.clsupdate.DAOImpl.CustomerDAOImpl;

public class Action extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String requestUri = request.getRequestURI();
		System.out.println(requestUri);
		System.out.println(requestUri);
		CustomerDAO cust = new CustomerDAOImpl();
		
		if(requestUri.equals("/clsupdate/updateMobile")) {
			String cust_id = request.getParameter("custid");
			String cust_mobile = request.getParameter("custMobile");
			System.out.println(cust_id+"  "+cust_mobile);
			cust.UpdateMobile(cust_id, cust_mobile);
			response.sendRedirect("/clsupdate/customer/updateMobile.jsp");
			System.out.println("ÒÑÐÞ¸Ä");
		}
	}
}
