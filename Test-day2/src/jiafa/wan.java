package jiafa;

//import java.util.Scanner;

public class wan {

	public static void main(String[] args) {
		Instrument i=new Instrument();
		i.play();
		wind d=new wind();
		d.play2();
		Brass b=new Brass();
		b.play2();
	}
}
class Instrument{
	public void play(){
		System.out.println("��������");
	}
	public Instrument(){
		System.out.println("����һ�����๹�췽��");
	}
}
class wind extends Instrument{
	public void play(){
		System.out.println("��������");
	}
	public void play2(){
		this.play();
	}
	public wind(){
		super();
	}
}
class Brass extends Instrument{
	public void brass(){
		System.out.println("�����");
	}
	public void play2(){
		this.brass();
	}
	public Brass(){
		super();
	}
}