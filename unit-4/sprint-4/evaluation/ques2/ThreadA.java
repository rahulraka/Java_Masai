package Eval4.ques2;

public class ThreadA extends Thread{
	First a1;
	Second b1;
	public ThreadA(First a1,Second b1) {
	this.b1=b1;
	this.a1=a1;
	}
	@Override
	public void run() {
	a1.funA(b1);
	}


}
