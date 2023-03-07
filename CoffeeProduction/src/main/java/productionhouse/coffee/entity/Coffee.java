package productionhouse.coffee.entity;

public class Coffee 
{
		// Different types of coffees
	
private String CoffeeType;
private Double Price;

// Generates Getters and Setters 
public String getCoffeeType() 
{
	return CoffeeType;
}
public void setCoffeeType(String coffeeType) 
{
	CoffeeType = coffeeType;
}
public Double getPrice() 
{
	return Price;
}
public void setPrice(Double price) 
{
	Price = price;
}

// Generate Constructor using Fields
public Coffee(String coffeeType, Double price) 
{
	super();
	CoffeeType = coffeeType;
	Price = price;
}

// Generate Constructors using super class
public Coffee() 
{
	super();
}

// Generate toString Method
@Override
public String toString() 
{
	return "Coffee [CoffeeType=" + CoffeeType + ", Price=" + Price + "]";
}		
}
