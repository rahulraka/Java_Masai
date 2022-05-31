package com.masai;

public class PresentationBean {
	private ServiceBean sb;

	
	
	


	public PresentationBean(ServiceBean sb) {
		super();
		this.sb = sb;
	}






	void presenting() {
		System.out.println("Presenting the Data now");
		sb.calculateMultiplication();
		System.out.println("=======================================================");
		sb.calculateSubtraction();
		System.out.println("=======================================================");
		sb.calculateSum();
		System.out.println("=======================================================");
		System.out.println("Presenting is Complete");
	}
	

}
