package lab2;

import java.util.Scanner;

public class complexnumber {
	public static void main(String[] args) {
		float num1,num2,result;
		complex cal =new complex();
		Scanner o=new Scanner(System.in);
		System.out.println("enter 1st number");
		System.out.println("enter real part");
		num1=o.nextInt();
		System.out.println("enter img part");
		num2=o.nextInt();
		complex obj1 =new complex(num1,num2);
		
		
		System.out.println("enter 2st number");
		System.out.println("enter real part");
		num1=o.nextInt();
		System.out.println("enter img part");
		num2=o.nextInt();
		complex obj2=new complex(num1,num2);
		
		System.out.println("ADDITION");
		cal.add(obj1,obj2);
		System.out.println("SUBTRACTION");
		cal.sub(obj1,obj2);
		System.out.println("MULTIPLICATION");
		cal.mul(obj1,obj2);
		System.out.println("DIVISION");
		cal.div(obj1,obj2);
	}

}
class complex
{
	float real,img;
	complex(float co1,float co2)
	{
		real=co1;
		img=co2;
	}
	complex()
	{
	
	}
	
	void add(complex c1,complex c2)
	{
		this.real=(c1.real+c2.real);
		this.img=(c1.img+c2.img);
		System.out.println("answer is:("+this.real+")+("+this.img+")i");
	}
	void sub(complex c1,complex c2)
	{
		this.real=(c1.real-c2.real);
		this.img=(c1.img-c2.img);
		System.out.println("answer is:("+this.real+")+("+this.img+")i");
	}
	
	void mul(complex c1,complex c2)
	{
	
		this.real=(c1.real*c2.real-c1.img*c2.img);
		this.img=(c1.real*c2.img+c2.real*c1.img);
		System.out.println("answer is:("+this.real+")+("+this.img+")i");
	}
	void div(complex c1,complex c2)
	{
		float demo;
		demo=(c2.real*c2.real+c2.img*c2.img);
		this.real=(c1.real*c2.real+c1.img*c2.img)/demo;
		this.img=(c1.real*c2.img-c2.real*c1.img)/demo;
		System.out.println("answer is:("+this.real+")+("+this.img+")i");
	}




}
