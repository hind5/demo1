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
		System.out.println("弹奏乐器");
	}
	public Instrument(){
		System.out.println("这是一个父类构造方法");
	}
}
class wind extends Instrument{
	public void play(){
		System.out.println("弹奏乐器");
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
		System.out.println("黑天鹅");
	}
	public void play2(){
		this.brass();
	}
	public Brass(){
		super();
	}
}