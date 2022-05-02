package Eval4.ques2;

public class ExplainingWaitandnotify {
	
	/*Wait: Wait is used to stop our Thread Unconditionally, it just says to main thread that you have to wait till I notify you,i.e,
	 * Main thread can't perform further functions till it get notified that the function who has called wait has done its part.
	 * 
	 *  Notify(): is used to notify when the Thread has done its part it just notify Main that my work has been done you can move further now
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		Wait w1=new Wait();
		Thread t1=new Thread(w1);
		t1.start();
		try {
			t1.wait();//Main thread will wait till the t1 thread notifies that its part has been done.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
