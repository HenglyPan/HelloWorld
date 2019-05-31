package com.newroad.controller;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ExectionController implements HandlerExceptionResolver {
    @Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
    	//记录日常日志
    	HandlerMethod handlerMethod=(HandlerMethod) handler;
    	Logger logger=Logger.getLogger(handlerMethod.getBeanType());
    	logger.error(handlerMethod.getMethod().getName(),ex);
    	String xml=request.getHeader("X-Requested-with");
	    if (xml!=null && "XMLHttpRequest".equalsIgnoreCase(xml)) {
			//如果是ajax请求就响应异常信息
	    	Map<String, Object>map=new HashMap<>();
	    	map.put("success",false);
	    	map.put("message", ex.getMessage());
	    	//通过jackson 输出到前段的map
	    	ObjectMapper obj=new ObjectMapper();
	    	try {
				obj.writeValue(response.getWriter(), map);
				response.getWriter().flush();
				response.getWriter().close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			  e.printStackTrace();
			}
	    }
		ModelAndView mv = new ModelAndView();
		mv.setViewName("jsp/error");
		return mv;
	}

}
