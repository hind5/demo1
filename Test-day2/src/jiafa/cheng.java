package jiafa;

import java.util.Scanner;

public class cheng {

	public static void main(String[] args) {
		double a,b,c;
		System.out.println("请输入第一个数");
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble(); 
		System.out.println("请输入第二个数");
		Scanner sc1=new Scanner(System.in);
	    b=sc.nextDouble(); 
	    System.out.println("请输入第三个数");
		Scanner sc2=new Scanner(System.in);
	    c=sc.nextDouble();
	    System.out.println("乘法:"+mul(a,b));
        System.out.println("乘法:"+mul(a,b,c));
	}
	public static double mul(double a,double b){
		return a*b;
	}
	public static double mul(double a,double b,double c){
		return a*b*c;
	}
}
