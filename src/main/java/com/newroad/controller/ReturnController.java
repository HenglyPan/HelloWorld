package com.newroad.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.newroad.entity.User;

@Controller  
//重定向必须是全路径 可以重定向到任何请求资源  第一个/是项目根目录
@SessionAttributes(value= {"user"})//将指定的将user模型数据添加到session中
public class ReturnController {
	@RequestMapping("/test/redirect")
	public String redirect() {
		System.out.println("redirect方法");
		return "redirect:/jsp/login.jsp";
	}
	
	@RequestMapping("/test/mv")
	//ModelAndView用于封装模型数据以及逻辑视图的对象
	public ModelAndView mv() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("jsp/model");
		mv.addObject("user", "张三");
		mv.addObject("pwd", "12345");
	   	return mv;
	   	
	}
	@RequestMapping("/jsp/returnList")
	public List<String> reutrnList(){
		List<String> list=new ArrayList<>();
		Collections.addAll(list, "hengly","host","many");
		return list;
	
	}
	
	@RequestMapping("/jsp/returnList1")
	public void returnlist(HttpServletResponse response) throws IOException {
		response.getWriter().write("行双方都");
		response.getWriter().flush();
		response.getWriter().close();
		System.out.println("hellowpef");
       
	}
	
	@ModelAttribute("user")
	public User getUser() {
		User user=new User("zhang","21324");
		return user;
	} 
	//@ModelAttribute 中取到想对应的对象 并将请求参数绑定到参数中
	@RequestMapping("/test/modelUser")
	public String modelUser(@ModelAttribute("user")User user) {
		System.out.println(user);
		return "/jsp/index";
		}
	}
