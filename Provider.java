package PrinciplesOfOops;

import java.util.Iterator;

public class Provider extends Specifier
{
	public void areaOfCircle(int r)
	{
		double area = pi*r*r;
		System.out.println("Area of Circle is: "+area);
	}
	
	public void areaOfSquare(int side)
	{
		double area = side*side;
		System.out.println("Area of Square is: "+area);
	}
	
	public void areaOfTriangle(int base,int height)
	{
		double area = 0.5*base*height;
		System.out.println("Area of Triangle is: "+area);
	}
	
	public void areaOfRectangle(int length,int width)
	{
		double area = length*width;
		System.out.println("Area of Rectangle is: "+area);
	}
	
	public void perimeterofCircle(int r)
	{
		double perimeter = 2*pi*r;
		System.out.println("Perimter of Circle is: "+perimeter);
	}
	
	public void perimeterofSquare(int side)
	{
		double perimeter = 4*side;
		System.out.println("Perimter of Square is: "+perimeter);
	}
	
	public void perimeterofTriangle(int s1,int s2,int s3)
	{
		double perimeter = s1+s2+s3;
		System.out.println("Perimter of Triangle is: "+perimeter);
	}
	
	public void perimeterofRectangle(int length,int width)
	{
		double perimeter = 2*(length+width);
		System.out.println("Perimter of Rectangle is: "+perimeter);
	}
	
	
	public void armstrongNo(int num)
	{
		int lent=0, sum=0;
		int dup = num;
		for(int i = num; i>0; i/=10)
			lent++;

		while(num>0)
		{
			int rem = num%10;
			int pow =1;
			for(int i=1; i<=lent; i++)
				pow*=rem;
			sum+=pow;
			num/=10;
		}
		System.out.println(dup==sum?dup+" is Armstrong Number":dup+"is not Armstrong number");
		
	}

	public void emipNo(int num)
	{
		int dup = num;
		int rev =0;
		int den = 2;

        //Prime no finding
		while(den<=num/2) 
        {
			if(num%den==0)
			{
				break;
			}
			den++;
        }
		if(den>num/2)
		{
			System.out.println("is prime");//1st no prime
		}
		else
		{
			System.out.println("NOT PRIME");
		}
		while(num>0)
		    {
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		    }
		System.out.println("The rev of the "+dup+ " is "+rev);//1st no rev
			
		while(den<rev) 
        {
			if(rev%den==0)
			{
				break;
			}
			den++;
        }
		if(rev == den)
			System.out.println("IT IS EMIP NO ");//2nd no prime
		else
			System.out.println("not emip");
		
		}				
		
	
	
	public void FibonacciNo(int num,int n1,int n2)
	{
		if (num>0)
		{
			int n3 = n1+n2;
			System.out.println(n1);
			FibonacciNo(--num,n2,n3);
		}
		return ;
	}
	
	public void pronicNo(int num)
	{
		for (int i=1; ;i++ )
		{
			if (i*(i+1)==num)
			{
				System.out.println("ok");;
			}
			else if (i*(i+1)>num)
			{
				System.out.println("Not Ok");;
			}
		}
	}

	
	public void AutomorphicNo(int num)
	{
		int div=1,len=0;
		for(int i=num;i>0;i/=10)
		{
			len++;
		}
		for(int i=1;i<=len;i++)
		{
			div*=10;
		}
		if(num==(num=(num*num)%div))
		{
			System.out.println(" is a Automorphic No");
		}
		else
			System.out.println(" is not Automorphic No");
	}
}
		

