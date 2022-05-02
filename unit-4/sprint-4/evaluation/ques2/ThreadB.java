package Eval4.ques2;

public class ThreadB extends Thread{
	First a1;
	Second b1;
	public ThreadB(First a1,Second b1) {
	this.b1=b1;
	this.a1=a1;
	}
	@Override
	public void run() {
	b1.funB(a1);
	}
}
