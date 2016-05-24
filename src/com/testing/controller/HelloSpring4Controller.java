/**
 * 
 */
package com.testing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * @author Sairam Rajulapati
 *
 */

@Controller
public class HelloSpring4Controller {
 
 @RequestMapping("/hello")  
  public ModelAndView sayHello() {  
   String message = "Sairam 1st Spring Practice Message ";  
   System.out.println("\n In Controller Class ");
   return new ModelAndView("hello", "message", message);  
  }  
}