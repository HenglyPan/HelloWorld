package com.newroad.controller;
import java.util.Date;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.newroad.entity.User;
@Controller
@RequestMapping("/test")
public class HelloController {
	
@RequestMapping(value="/first",method=RequestMethod.GET,params= {"username","title"})
 public String hello() {
	   return "jsp/index";	   
   }

@RequestMapping("/map")
public 	String map(Map<String, Object> map) {
	
	map.put("username", "刘鑫");
	return "jsp/index";
}

@RequestMapping("/modelMap")
public String modelMap(ModelMap modelMap) {
	modelMap.put("xingming", "张三");
	
	return "jsp/index";
}
/*
 * springMVC会自动的将请求中的参数与方法中的参数进行映射，并自动进行数据类型转换(springMVC中有大量的类型转换器)，
 * 前提是请求中的参数名和方法中的参数名一致
 * 如果前台的参数名与后台的参数名不一致时，使用@RequestParam(value="") 来将请求中的参数与方法中的参数进行对应
 * value是请求参数中的参数名  name和value是一个意思，都是指请求中的参数名
 * required 表示这个参数是否是必须的 true表示是必须参数
 * defaultValue 是默认值，当前台没有传递该参数时，默认赋值
 */
@RequestMapping(value="/servlet1" ,params= {"username"})
public String select(HttpServletRequest request) {

	System.out.println(request);
	String user=request.getParameter("username");
	request.setAttribute("user", user);
	return "jsp/index";
	
}

@RequestMapping(value="/login")
public String login(@RequestParam("username")String username,@RequestParam("password")String passwrod) {
	System.out.println("用户名"+username+"密码"+passwrod);
	return "jsp/index";
}

@RequestMapping("/login02")
public String login(User user) {
	System.out.println("user"+user);
	return "jsp/index";
	
	
}


@RequestMapping("/login03")
public String data(@DateTimeFormat(pattern="yyyy-HH-dd") Date time){
	System.out.println(time);
	return "jsp/index";
	
}
//通过PathVariable 进行传参数
@RequestMapping("/login04/{id}")
public String pathVariable(@PathVariable("id")Integer id) {
	System.out.println(id);
	return "jsp/index";
}
@RequestMapping("/test/redirect")
public String redirect() {
	System.out.println("redirect方法");
	return "jsp/login.jsp";
}

}
