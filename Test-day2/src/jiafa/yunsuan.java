package jiafa;

import java.util.Scanner;

public class yunsuan {

	public static void main(String[] args) {
		int a,b,i;
		System.out.println("�������һ����");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt(); 
		System.out.println("������ڶ�����");
		Scanner c=new Scanner(System.in);
	    b=sc.nextInt(); 
	    System.out.println("��ѡ�����㷽��:");
	    System.out.println("1���ӷ�");
	    System.out.println("2������");
	    System.out.println("3���˷�");
	    System.out.println("4������");
	    Scanner sc1=new Scanner(System.in);
	    i=sc1.nextInt();
	    switch(i){ 
	    case 1:
	    	System.out.println(add(a,b));
	    	break;
	    case 2:
			System.out.println(sub(a,b));
			break;
	    case 3:
	    	System.out.println(mul(a,b));
	    	break;
	    case 4:
	    	if(b==0){
				System.out.println("����������ڶ�����");
				Scanner sc2=new Scanner(System.in);
			    b=c.nextInt();
			}
	    	System.out.println(div(a,b));
	    	break;
	    }
	}
	
	public static int add(int a,int b){
		int sum;
		sum=a+b;
		return sum;	
	}
	public static int sub(int a,int b){
		int bad;
		bad=a-b;
		return bad;
	}
	public static int mul(int a,int b){
		int jet;
		jet=a*b;
		return jet;
	}
	public static float div(int a,int b){
		float con;
		con=a/b;
		return con;
	}
}
