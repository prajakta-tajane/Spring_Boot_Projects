package cal.operation.entity;

// All Arithmetic Operation class
public class CalculationMain 
{
	
public static int Add(int n1,int n2)
	{
		return n1+n2;
	}

public static int Sub(int n1,int n2)
	{
		return n1-n2;
	}

public static double Mul(double n1,double n2)
	{
		return n1*n2;
	}

public static double Div(double n1,double n2) throws ArithmeticException
	{
		if (n2 == 0)
		{
			throw new  ArithmeticException(" Number is not Divide by zero is not possible");
		}
        return n1/n2;
	}
}
