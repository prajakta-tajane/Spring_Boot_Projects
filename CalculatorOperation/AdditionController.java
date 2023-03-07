package cal.operation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cal.operation.entity.CalculationMain;

@RestController
public class AdditionController 
{	
	// It performs the Addition of two numbers operation and Display it into Web. 
	
	@GetMapping("/Addition/Add")
	public String addition (@RequestParam(value = "n1",required = true,defaultValue = "33")int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "76" )int n2)
	{
		return "<h1>The Addition of two numbers is "+ CalculationMain.Add(n1, n2)+"</h1>";
	}
}
