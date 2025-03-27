package com.pradeep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String doGet() {
		System.out.println("This is login method");
		return "login";
		
//		String username=request.getParameter("username");
//		String password=request.getParameter("password");
//		
//		UserDetailsDAO userDAO=new UserDetailsDAO();
//		int userId=userDAO.authenticateUser(username, password);
//		
//		if(userId>0) {
//			HttpSession session=request.getSession();
//			session.setAttribute("userId", userId);
//			
//			response.sendRedirect("UserProfile.jsp");
//		}else {
//			response.sendRedirect("login.jsp");
//		}
	}
}
