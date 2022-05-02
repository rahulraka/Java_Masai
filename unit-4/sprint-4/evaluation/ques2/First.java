package Eval4.ques2;

public class First {
	public synchronized void funA(Second b1){
		System.out.println("funA of A starts");
		b1.fun2();
		System.out.println("funA of A ends");
		}
		public synchronized void fun1(){
		System.out.println("inside fun1 of A");
		}


}
