package laobo.springmvc.handlers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import laobo.springmvc.entities.User;
@RequestMapping("/springmvc")
@Controller
public class springMVCtest {
	@RequestMapping(value="testMethod", method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMEthod");
		return "success";
	}
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam(value="username") String un, @RequestParam(value="age") int age) {
		System.out.println("testRequestParam, username"+un+".age"+age);
		return "success";
		}
	@ModelAttribute
	public void getUser(@RequestParam(value="id",required=false) Integer id, Map<String,Object>map) {
		if(id!=null) {
			User user = new User(1, "Tom", "12345", 12, "dalian", "labo@qq.com");
			System.out.println("从数据库中获取:"+user);
			map.put("user", user);
		}
	}
	@RequestMapping("/testModelAttribute")
	public String testModelAttribute(User user){	
		System.out.println("修改:"+user);
		return "success";
	}
	
}
