package com.S3D1.ques3;

public class Mobile {
	public void  modelname(String Name, String...strings) {
		String[] outdatedOne={"iphone3","iphone4","iphone5","iphone6","iphone7"};
		System.out.println("Company Name :" +Name);
		for(String x :strings) {
			System.out.println("Models " +x);
		}
		for(int i=0;i<strings.length;i++) {
			for(int j=0;j<outdatedOne.length;j++) {
				if(strings[i].equals(outdatedOne)) {
					System.out.println(strings[i]+" Outdated");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile();
		String[] z= {"galaxy5","iphone5","s30","iphone6"};
		m1.modelname("Samsung", z);

	}

}
