package polymorphismPackage;


import java.lang.reflect.Member;
import java.util.*;
/**
 * Version 0.1
 * @author htha9587
 * 4-15-16
 */

public class Morpher 
{
	private String type;
	void JunkType()
	{
		ArrayList<A> alA = new ArrayList<A>();
		ArrayList<B> alB = new ArrayList<B>();
		
		alA.add(new B());
		B b = (B)alA.get(0);
		b.setType("AB");
		System.out.println(b.type);
	}
	public static void Main(String [] args)
	{
		System.out.println("B is the child of parent A. Each of which is an ArrayList!");
	}
	
	class A
	{
		public String type;
		A()
		{
			this.type = "A";
		}
	}
	
	class B extends A
	{
		B()
		{
			this.type = "B";
		}

		public void setType(String string) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
}
