/**
 * 
 */
package com.testing.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.testing.beans.LoginBean;
import com.testing.beans.LoginDelegat;

/**
 * @author Sairam Rajulapati
 *
 */

@Controller
public class HelloSpring4Controller {
 
	@Autowired
	private LoginDelegat loginDelegate;
	
	@RequestMapping("/ss")  
	  public ModelAndView sayHello2() {  
	   String message = "it's for all requests";  
	   System.out.println("\n In Controller Class ");
	   return new ModelAndView("other", "message", message);  
	  }  
	
 @RequestMapping("/hello")  
  public ModelAndView sayHello() {  
   String message = "Sairam 1st Spring Practice Message ";  
   System.out.println("\n In Controller Class Hello Controller  ");
   return new ModelAndView("hello", "message", message);  
  }
 
 @RequestMapping(value="/login",method=RequestMethod.GET)
 public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response)
 {
	 System.out.println(" in login Mehod Get ");
 	ModelAndView model = new ModelAndView("login");
 	LoginBean loginBean = new LoginBean();
 	model.addObject("loginBean", loginBean);
 	return model;
 }
 @RequestMapping(value="/login",method=RequestMethod.POST)
 public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("loginBean")LoginBean loginBean)
 {
	 
	 System.out.println(" in login Mehod Post ");
 	ModelAndView model= null;
 	try
 	{
 		boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
 		if(isValidUser)
 		{
 			System.out.println("User Login Successful");
 			request.setAttribute("loggedInUser", loginBean.getUsername());
 			model = new ModelAndView("welcome");
 		}
 		else
 		{
 			model = new ModelAndView("login");
 model.addObject("loginBean", loginBean);
 			request.setAttribute("message", "Invalid credentials!!");
 		}

 	}
 	catch(Exception e)
 	{
 		e.printStackTrace();
 	}

 	return model;
 }
 @ModelAttribute("loginBean")
 public LoginBean getLoginBean(){
	 return new LoginBean();
 }
 
}