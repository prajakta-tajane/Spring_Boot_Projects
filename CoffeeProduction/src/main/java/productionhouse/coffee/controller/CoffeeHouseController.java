package productionhouse.coffee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import productionhouse.coffee.entity.Coffee;

@RestController
public class CoffeeHouseController 
{
	private List<Coffee> c = new ArrayList<>();
	
	//Adding coffee to the list
	public CoffeeHouseController() 
	{
		c.addAll(List.of(new Coffee("Americana", 800.00), new Coffee("Cortada", 550.00), 
				new Coffee("Mocha", 550.00),new Coffee("Flat White", 750.00), 
				new Coffee("Decaf", 350.00), new Coffee("Iced Coffee", 400.00)));	
	}
	
	// Display all Coffee Data in the form of  list
	@RequestMapping(value = "/Coffee", method = RequestMethod.GET)
	Iterable<Coffee> getAllLeds() 
	{
		return c;
	}
}
