package cal.operation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cal.operation.entity.CalculationMain;

@RestController
public class DivisionController 
{
	// It performs the division of two numbers operation and Display it into Web. 
	
	@GetMapping("/Division/Div")
	public String division (@RequestParam(value = "n1",required = true,defaultValue = "15")double n1,
			@RequestParam(value = "n2",required = true,defaultValue = "48" )double n2)
	{
		 return "<h1>The Division of two numbers is "+ CalculationMain.Div(n1, n2)+"</h1>";	
    }
}
