package com.itheima.test;

import org.junit.Test;

import com.itheima.dao.Studao;
import com.itheima.dao.impl.StudaoImpl;

public class TestStuDao {
	
	@Test
	public void testFindAll() {
		Studao dao = new StudaoImpl();
		dao.findAll();
	}
}
