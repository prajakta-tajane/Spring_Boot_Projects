package edu.learning.anudip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping("/anudip/web")
	public String Web() 
	{
		return "<a href='https://www.anudip.org/'>"
				+ "<body bgcolor='white' text='red'><center><h1>Click Here !</h1></center></body></a>";
	}
}
