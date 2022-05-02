package Eval4.ques2;

public class Deadlock {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First a1 = new First();
		Second b1 = new Second();
		ThreadA t1 = new ThreadA(a1, b1);
		ThreadB t2 = new ThreadB(a1, b1);
		t1.start();
		t2.start();

	}

}
