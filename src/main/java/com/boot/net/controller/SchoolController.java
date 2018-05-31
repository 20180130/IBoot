package com.boot.net.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.net.service.SchoolService;

@RestController
@RequestMapping("/school")
public class SchoolController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SchoolController.class);
	
	@Autowired
	private SchoolService schoolService;
	
	@RequestMapping("/")
	public String selectAllSchool() {
		LOGGER.info("selectAllSchoolselectAllSchoolselectAllSchoolselectAllSchool");
		return schoolService.selectAllSchool();
	}
}
