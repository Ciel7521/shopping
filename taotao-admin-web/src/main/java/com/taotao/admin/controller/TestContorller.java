package com.taotao.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.admin.service.TestService;

/**
 * TestContorller
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年5月20日 下午12:01:55
 * @version 1.0
 */
@Controller
public class TestContorller {
	
	@Autowired
	private TestService testService;
	
	/** 查询当前时间 */
	@RequestMapping("/date")
	@ResponseBody
	public String queryCurrentDate(){
		return testService.findCurrentDate();
	}
}
