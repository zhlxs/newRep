package com.demo.service;

import java.util.List;

import com.hsl.entity.Dept;

public interface IDeptService {

	public boolean saveDept(Dept dept);

	public Dept getObjectById(Long id);

	public List<Dept> list();
}
