package laobo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import laobo.crud.bean.Employee;
import laobo.crud.dao.EmployeeMapper;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeMapper employeeMapper;

	/*
	 * 查询所有员工
	 */
	public List<Employee> getAll() {
		
		// TODO Auto-generated method stub
		return employeeMapper.selectByExampleWithDept(null);
	}

	

}
