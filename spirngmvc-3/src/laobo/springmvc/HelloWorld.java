package laobo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	public HelloWorld() {
		System.out.println("helloworld constructor");
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/HelloWorld")
	public String hello() {
		System.out.println("success");
		return "success";
	}
}
