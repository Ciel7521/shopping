package com.taotao.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.taotao.admin.mapper.TestMapper;
import com.taotao.admin.service.TestService;

/**
 * TestServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年5月20日 下午12:07:24
 * @version 1.0
 */
@Service
@Transactional(readOnly=false,rollbackFor=RuntimeException.class)
public class TestServiceImpl implements TestService {
	@Autowired
	private TestMapper testMapper;
	
	@Override
	public String findCurrentDate() {
		return testMapper.queryCurrentDate();
	}
	
	
}
