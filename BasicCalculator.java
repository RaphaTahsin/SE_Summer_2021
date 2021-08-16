 class BasicCalculator implements Calculation
{
	double value1;
	double value2,c;
	
	BasicCalculator()
	{
	}
	BasicCalculator(double v1,double v2)
	{
		 value1=v1;
	     value2=v2;
	}
	void setvalue1(double  v1)
	{
		 value1=v1;
	}
	void setvalue2(double  v2)
	{
		 value2=v2;
	}
	double getvalue1()
	{
		 return value1;
	}
	double getvalue2()
	{
		return value2;
	}
	public double add()
	{
		
		return value1+value2;
		//return c;
	}
	
	
	public double subtract()
	{
		return value1-value2;
	}
	
	public double multiply()
	{
		return value1*value2;
	}
	public double divide()
	{
		return value1/value2;
	}
	void value3()
	{
		System.out.println("value 1="+value1);
		System.out.println("value 2="+value2);
		
	}
	
	
}
	
	