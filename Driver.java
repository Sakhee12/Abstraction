package PrinciplesOfOops;

public class Driver 
{
	public static void main(String[] args) 
	{
		Specifier s1 = new Provider();
		
		s1.areaOfCircle(5);
		s1.areaOfSquare(5);
		
		s1.perimeterofRectangle(5,5);
		
		s1.armstrongNo(1634);
		
		//s1.pronicNo(30);
		
		s1.FibonacciNo(5, 0, 1);
		
		s1.AutomorphicNo(9);
	}
}
