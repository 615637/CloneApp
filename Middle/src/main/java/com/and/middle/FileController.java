package com.and.middle;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.google.gson.Gson;

@Controller
public class FileController {

	@RequestMapping(value= "/file.f", produces = "text/html;charset=utf-8")
	public String list(HttpServletRequest req) throws IllegalStateException, IOException { //req(요청에 대한 모든 정보), res
		System.out.println(req.getLocalAddr());
		System.out.println(req.getLocalPort());
		System.out.println(req.getContextPath()+"/img/이름.jpg"); //DB에 저장
		
		MultipartRequest mReq = (MultipartRequest) req;
		MultipartFile file = mReq.getFile("file");
		//파일이 있는 상태의 요청을 받았는지에 따라서 유동적으로 MultipartRequest로 캐스팅
		if(file != null) {
			file.transferTo(new File("D:\\Study_Android\\image\\20230720", "andimg.jpg"));
		}else {
			
		}
		//파일 빼오기
		//물리적으로 저장하기
		//Middle/img/파일명을 크롬으로 요청하면 열리게 하기.
		//실제 파일은 D:\Android\폴더\...
		return new Gson().toJson("");
	}
	
	public String img() {
		
		
		return "";
	}
	
	
	
	
	
}
