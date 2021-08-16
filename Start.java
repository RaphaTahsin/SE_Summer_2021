public class Start{
	
      public static void main(String[] args)
	  {
		  ScientificCalculator obj=new ScientificCalculator(9.00,2.00);
		  obj.value3();
		    
		  System.out.println("                      ");
		  System.out.println("result of add ="+obj.add());
		  System.out.println("result of subtract ="+obj.subtract());
		  System.out.println("result of multiply ="+obj.multiply());
		  System.out.println("result of divide ="+obj.divide());
		  System.out.println("result of power ="+obj.tothepower());
	  }
}
	