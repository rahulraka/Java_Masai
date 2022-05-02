package Eval4.ques2;

public class Second {
	public synchronized void funB(First a1){
		System.out.println("funB of B starts");
		a1.fun1();
		System.out.println("funB of B ends");
		}
	
	
	public void fun2(){
		System.out.println("inside fun2 of B");
		}


}
