package mybatis.demo.dao;

import java.util.List;

import mybatis.demo.Employee;

public interface EmployeeMapper {
	public Employee getEmplById(Integer id);
	public void InsertEmpl(Employee employee);
	public void DeletEmpl(int id);
	public void UpdataEmpl(Employee employee);
	public List<Employee> getEmplByLikeName(String last_name);
}
