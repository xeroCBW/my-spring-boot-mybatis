package com.cbw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbw.pojo.Account;
import com.cbw.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	//设置查询的数据
	@Autowired
	private AccountService accountService;
	
	//设置查询数据
	@RequestMapping("/{id}")
	@ResponseBody
	public Object getById(@PathVariable("id") Integer id) {
		
		Account account = accountService.selectByPrimaryKey(id);
		
		return account;
	}
}
