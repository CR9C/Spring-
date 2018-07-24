package io.cr9c.github.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.cr9c.github.dao.IAccountDAO;
import io.cr9c.github.service.IAccountService;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {

	@Autowired
	private IAccountDAO dao;

	public void trans(Long outId, Long inId, int money) {
		dao.transOut(outId, money);
		int a = 1 / 0;//模拟程序有异常
		dao.transIn(inId, money);
	}

	@Transactional(readOnly = true)
	public void listXxx() {
	}
}
