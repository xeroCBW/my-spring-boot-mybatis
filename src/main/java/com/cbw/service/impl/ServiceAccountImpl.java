package com.cbw.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbw.dao.AccountMapper;
import com.cbw.pojo.Account;
import com.cbw.service.AccountService;

@Service
public class ServiceAccountImpl implements AccountService{
	
	
	@Autowired
	private AccountMapper accountMapper; 

	@Override
	public Account selectByPrimaryKey(Integer id) {
		
		
		//查询数据
		
		Account account = accountMapper.selectByPrimaryKey(id);
		
		return account;
	}

}
