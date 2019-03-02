package com.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.IDeptDao;
import com.demo.service.IDeptService;
import com.hsl.entity.Dept;

@Service
public class DeptServiceImpl implements IDeptService {

	@Resource
	private IDeptDao deptdao;

	@Override
	public boolean saveDept(Dept dept) {
		// TODO Auto-generated method stub
		return deptdao.saveDept(dept);
	}

	@Override
	public Dept getObjectById(Long id) {
		// TODO Auto-generated method stub
		return deptdao.getObjectById(id);
	}

	@Override
	public List<Dept> list() {
		// TODO Auto-generated method stub
		return deptdao.list();
	}

}
