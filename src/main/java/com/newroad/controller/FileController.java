package com.newroad.controller;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller //单文件上传
public class FileController {
   @RequestMapping("/upload.do")
	public String upload(@RequestParam("myFile")MultipartFile file,ModelMap map) throws IllegalStateException, IOException {
		String file1=file.getName();
	 	String filename=file.getOriginalFilename();
		long size=file.getSize();
		System.out.println(file1+""+filename+""+size);
		if (file.isEmpty()) {
			map.addAttribute("mes", "失败");
		}else {
			map.addAttribute("mes", "成功");
		}
		file.transferTo(new File("E://", filename));
		return "/jsp/index";
		
		
	}
   
   @RequestMapping("/upload1.do")
   public String uploadMore(ModelMap map,@RequestParam("myFile")MultipartFile[]files) throws IllegalStateException, IOException {
	   
	   for (MultipartFile file : files) {
			String file1=file.getName();
		 	String filename=file.getOriginalFilename();
			long size=file.getSize();
			System.out.println(file1+""+filename+""+size);
			if (file.isEmpty()) {
				map.addAttribute("mes", "失败");
			}else {
				map.addAttribute("mes", "成功");
			}
			file.transferTo(new File("D://", filename));
	   }
	   
	   return "/jsp/index";
	}
   
  /* @RequestMapping("/download")
   public void downLoad(HttpServletResponse response) throws IOException {
	   File file=new File("D://端口号别站用");
	   String filename= file.getName();
	   response.addHeader("content-disposition", "attachment;filename="+URLEncoder.encode(filename, "UTF-8"));
	   //设置响应内容类型
	   response.setContentType("application/octet-stream");
	   OutputStream out=response.getOutputStream();
	   //创建文件输入流
	   InputStream in=new FileInputStream(file);
	   byte[]b=new byte[1024*3];
	   int num=0;
	   while((num=in.read(b))!=-1) {
		 out.write(b, 0, num);
	  }
	   out.close();
	   in.close();
	   
   }*/
   @RequestMapping("/download01")
	public void servletAPiDowload(HttpServletResponse response) throws IOException {
		File file = new File("D:\\测试.txt");
		//如果fileName有中文就会乱码
		//设置响应头信息
		response.addHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(file.getName(), "UTF-8"));
		//设置响应的内容类型
		response.setContentType("application/octet-stream");
		//获得响应输出流
		OutputStream out = response.getOutputStream();
		//创建fileInputStream对象读取文件
		FileInputStream in = new FileInputStream(file);
		byte[] b = new byte[1024*3];
		int num = 0;
		while((num=in.read(b))!=-1) {
			out.write(b, 0, num);
		}
		out.close();
		in.close();
	}
	

   
}
