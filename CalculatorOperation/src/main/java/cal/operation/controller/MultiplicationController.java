package cal.operation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cal.operation.entity.CalculationMain;

@RestController
public class MultiplicationController 
{	
	//It performs the Multiplication of two numbers operation and Display it into Web.
	
	@GetMapping("/Multiplication/Mult")
	public String multiplication(@RequestParam(value = "n1",required = true,defaultValue = "94")double n1,
			@RequestParam(value = "n2",required = true,defaultValue = "13" )double n2
			)
	{
	return "<h1>The Multiplication of two numbers is "+ CalculationMain.Mul(n1, n2)+"</h1>";
	}
}
