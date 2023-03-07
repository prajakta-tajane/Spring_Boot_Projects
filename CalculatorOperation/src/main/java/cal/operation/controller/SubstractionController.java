package cal.operation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cal.operation.entity.CalculationMain;

@RestController
public class SubstractionController 
{
	//It performs the Substraction of two numbers operation and Display it into Web. 
	
	@GetMapping("/Substraction/Sub")
	public String substraction(@RequestParam(value = "n1",required = true,defaultValue = "41")int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "33" )int n2
			)
	{
	return "<h1>The Division of two numbers is "+ CalculationMain.Sub(n1, n2)+"</h1>";
	}
}
