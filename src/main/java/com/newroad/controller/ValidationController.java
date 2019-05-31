package com.newroad.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newroad.entity.User;

@Controller
public class ValidationController {
	@RequestMapping("/validation")
	public String addUser(@Valid User user, Errors errors) {
		if (errors.hasErrors()) {
			System.out.println("验证失败");
			int num = errors.getErrorCount();
			System.out.println("错误个数" + num);
			return "jsp/error";
		}

		return "jsp/success";

	}

	@RequestMapping("/adduserjson")
	@ResponseBody
	public Map addUserjosn(@Valid User user, Errors error) {
		int num=4/0;
		Map<String, Object> map = new HashMap<>();
		if (error.hasErrors()) {
			map.put("success", false);
			// 获取所有错误信息
			List<ObjectError> errors = error.getAllErrors();
			StringBuilder sb = new StringBuilder();
			for (ObjectError err : errors) {
				if (err instanceof FieldError) {
					FieldError er = (FieldError) err;
					String errs = err.getDefaultMessage();
					sb.append(er.getField() + "," + errs + ",");
				}

			}
			//去掉最后的,号用空格替换
			sb.replace(sb.length() - 1, sb.length(), "");
			map.put("message", sb.toString());

		} else {
			map.put("success", true);
		}

		return map;

	}

}
