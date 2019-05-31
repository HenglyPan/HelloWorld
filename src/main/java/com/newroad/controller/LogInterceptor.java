package com.newroad.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class LogInterceptor implements HandlerInterceptor{
    /*
     * 在处理请求方法执行前 执行 可以进行登录校验 权限校验
     *	/**
	 * 当请求方法执行之前执行该方法
	 * 返回true 则表示不拦截 就是filter 中的 放行
	 * 返回false 表示拦截 请求不会往下执行
	 */
    
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	String ip=request.getRemoteAddr();
	String url=request.getRequestURL().toString();
	System.out.println("客户:"+ip+" 访问地址"+url+" 在处理请求方法执行前");
		return false;
	}
    
	//在处理请求方法执行后执行  请求完毕试图未渲染
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		String ip=request.getRemoteAddr();
		String url=request.getRequestURL().toString();
		System.out.println("客户:"+ip+" 访问地址"+url+" 处理请求方法执行后执行  请求完毕试图未渲染");
			
		
	}
   //请求方法执行完毕 试图渲染完毕
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		String ip=request.getRemoteAddr();
		String url=request.getRequestURL().toString();
		System.out.println("客户:"+ip+" 访问地址"+url+" 请求完毕 试图渲染成功");
		
	}

}
