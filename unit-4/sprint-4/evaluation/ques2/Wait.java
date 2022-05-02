package Eval4.ques2;

public class Wait implements Runnable{
	First a1=new First();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		a1.fun1();
		notify();
		
		
		
	}
	
}


