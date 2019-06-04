package laobo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import laobo.crud.bean.Employee;
import laobo.crud.bean.EmployeeExample;
import laobo.crud.bean.EmployeeExample.Criteria;
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

	/*
	 * 员工保存
	 */
	public void saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.insertSelective(employee);
	}

	public boolean checkUser(String empName) {
		// TODO Auto-generated method stub
		EmployeeExample example =  new EmployeeExample();
		Criteria criteria = example.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		long count = employeeMapper.countByExample(example);
		return count==0;
	}

	

}
