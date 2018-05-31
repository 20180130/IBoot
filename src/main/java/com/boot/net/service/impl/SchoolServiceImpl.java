package com.boot.net.service.impl;

import org.springframework.stereotype.Service;

import com.boot.net.service.SchoolService;

@Service
public class SchoolServiceImpl implements SchoolService{

	@Override
	public String selectAllSchool() {
		System.out.println("---------selectAllSchool------------");
		
		return "Hello World!";
	}

}
