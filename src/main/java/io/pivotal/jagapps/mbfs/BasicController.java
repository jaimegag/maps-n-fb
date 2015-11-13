package io.pivotal.jagapps.mbfs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BasicController {
	
	@RequestMapping("/fb")
	@ResponseBody
	public String home() {
		System.out.println("Basic Controller /fb called, returning fb");
		return "fb";
	}
	
	@RequestMapping("/shortcut")
	public String shortcut() {
		System.out.println("Basic Controller /shortcut called, returning /plain.html");
		return "/plain.html";
	}

}
