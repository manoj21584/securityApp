package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {
	@GetMapping("/myNotice")
	public String getNoticeDetails() {
		return "welcome to notice controller";
	}

}
