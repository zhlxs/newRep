package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hsl.entity.Dept;

@Mapper
public interface IDeptDao {

	public boolean saveDept(Dept dept);

	public Dept getObjectById(Long id);

	public List<Dept> list();
}
