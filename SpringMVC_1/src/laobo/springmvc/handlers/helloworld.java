package laobo.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloworld {
	@RequestMapping("/helloworld")
	public String hello() {
		System.out.println("hello.....");
		return "success"; 
	}
}
