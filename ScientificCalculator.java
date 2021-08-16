public class ScientificCalculator extends BasicCalculator implements ScientificCAlculation
{

	public ScientificCalculator(double v1,double v2)
	{
		super(v1,v2);
	}
	
	public double tothepower()
	{
		for(int i=0;i<(value2-1);i++)
		{
			value1 =value1*value1;
			
		}
		return value1;
		
	}
	
}
	