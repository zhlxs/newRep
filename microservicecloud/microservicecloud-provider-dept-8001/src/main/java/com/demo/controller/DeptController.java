package com.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.IDeptService;
import com.hsl.entity.Dept;

@RestController
public class DeptController {

	@Resource
	private IDeptService deptService;

	@RequestMapping(value = "/dept/save", method = RequestMethod.GET)
	public boolean add(/* @RequestBody Dept dept */String deptName, String db_source) {
		Dept dept = new Dept();
		dept.setDeptName(deptName);
		dept.setDb_source(db_source);
		return deptService.saveDept(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.getObjectById(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}
}
