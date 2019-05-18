package laobo.springmvc.crud.test;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import laobo.springmvc.crud.dao.EmployeeDao;
import laobo.springmvc.crud.entities.Employee;

@Controller
public class SpringMVCtest {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@ResponseBody
	@RequestMapping("/testJson")
	public Collection<Employee> testJson(){
		System.out.println(employeeDao.getAll());
		return employeeDao.getAll();
	}
	
	@RequestMapping("/testFileUpload")
	public String testFileUpload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) {
		System.out.println("desc+"+desc);
		System.out.println("FileName"+file.getOriginalFilename());
		
		return "success";
	}
}
