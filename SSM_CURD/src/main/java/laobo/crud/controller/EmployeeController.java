package laobo.crud.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import laobo.crud.bean.Employee;
import laobo.crud.bean.Msg;
import laobo.crud.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeSercice;
	
	@RequestMapping(value="/emp", method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(Employee employee) {
		employeeSercice.saveEmp(employee);
		return Msg.success();
	}
	
	@RequestMapping("/emps")
	@ResponseBody
	public Msg getEmpWithJson(@RequestParam(value="pn", defaultValue="1") Integer pn) {
		//在查询之前只需压迫调用,传入页码,以及每页的大小
		PageHelper.startPage(pn,5);
		//startpage后面紧跟的这个查询就是一个分页查询
		List<Employee> emps = employeeSercice.getAll();
		//使用pageinfo包装查询后的结果,只需要将pageinnfo交给页面就行了
		PageInfo page = new PageInfo(emps, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	
//	@RequestMapping(value="/emps")
	public String getEmps(@RequestParam(value="pn", defaultValue="1") Integer pn, Model model) {
		//在查询之前只需压迫调用,传入页码,以及每页的大小
		PageHelper.startPage(pn,5);
		//startpage后面紧跟的这个查询就是一个分页查询
		List<Employee> emps = employeeSercice.getAll();
		//使用pageinfo包装查询后的结果,只需要将pageinnfo交给页面就行了
		PageInfo page = new PageInfo(emps, 5);
		model.addAttribute("pageInfo", page);
		return "list";
	}
	
}
