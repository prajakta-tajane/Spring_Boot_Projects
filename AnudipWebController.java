package edu.learning.anudip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnudipWebController {
	
	@GetMapping("/web/anudip/link")
	public String web() {
		return "<a href='https://www.anudip.org/'>"
				+ "<body bgcolor='white' text='black'><center><h1>Click Here!</h1></center></body></a>";
	}
		
	}


