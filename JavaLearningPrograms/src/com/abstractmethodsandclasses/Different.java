package com.abstractmethodsandclasses;

 abstract class MycalculateClass
{
	abstract void calculate(double x);
}
 
 class Sub1 extends MycalculateClass
 {

	@Override
	void calculate(double x) {
		// TODO Auto-generated method stub
		System.out.println("Square : "+(x*x));
		
	}
	 
 }
 
public class Different {
	public static void main(String[] args) {
		Sub1 sub1 = new Sub1();
		sub1.calculate(3);
	}

}
