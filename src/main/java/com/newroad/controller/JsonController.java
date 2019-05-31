package com.newroad.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.newroad.entity.User;
/**
 * 关于响应json数据的案例，请求是json数据的案例
 * @author Administrator
 *
 */

@Controller
public class JsonController {
	@RequestMapping("/listjson.do")
	@ResponseBody //这个注解表示的是 当前的数据是有wrtie写出的json数据,会自动的将返回的对象转换为json对象
    public User user() {
		int num=5/0;
    	User user=new User("lili", "1234");
    	return user;
    	
    }
	
	@RequestMapping("/json_list.do")
	@ResponseBody //当前的数据是由write写出的json数据，会自动将返回的list集合转换为json数组
	public List<User>list(){
		List<User> list=new ArrayList<>();
		User user=new User("lili", "1234");
		User user1=new User("li21", "11022");
		list.add(user);
		list.add(user1);
		return list;
	}
	
	@RequestMapping("/json_str_user")
	@ResponseBody
	public User jsonUser(@RequestBody User user) {
		System.out.println(user);
		return user;
		
		
		
	}
   @ExceptionHandler
  public String handExection(HttpServletRequest request,Exception ex) {
	  request.setAttribute("ex", ex);
	  return "jsp/index";
	  
	  
  }
	
}
