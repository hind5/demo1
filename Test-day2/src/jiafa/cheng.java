package jiafa;

import java.util.Scanner;

public class cheng {

	public static void main(String[] args) {
		double a,b,c;
		System.out.println("�������һ����");
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble(); 
		System.out.println("������ڶ�����");
		Scanner sc1=new Scanner(System.in);
	    b=sc.nextDouble(); 
	    System.out.println("�������������");
		Scanner sc2=new Scanner(System.in);
	    c=sc.nextDouble();
	    System.out.println("�˷�:"+mul(a,b));
        System.out.println("�˷�:"+mul(a,b,c));
	}
	public static double mul(double a,double b){
		return a*b;
	}
	public static double mul(double a,double b,double c){
		return a*b*c;
	}
}
