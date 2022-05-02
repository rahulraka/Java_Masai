package Eval4.ques1;

import java.util.*;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	
	
	public String addMobile(String company, String model) {
		if(mobiles.containsKey(company)) {
			ArrayList s1=mobiles.get(company);
			s1.add(model);
			mobiles.put(company, s1);
		}
	else {
		ArrayList<String> mode=new ArrayList<>();
		mode.add(model);
		mobiles.put(company, mode);
	}
		return "Mobile added Successfully";
		}
	
		public List<String> getModels(String company)throws InvalidMobileException{
			
			try{
				Set<Map.Entry<String, ArrayList<String>>> ls=mobiles.entrySet();
			for(Map.Entry<String, ArrayList<String>> key:ls) {
				if(key.getKey().equalsIgnoreCase(company)) {
					return key.getValue();
				}
			}
			}
			catch(Exception e) {
				throw new InvalidMobileException("Invalid Company name");
				
			}
			return null;
			
		}
		
		public static void main(String[] args) {
			Mobile mob = new Mobile();
			mob.addMobile("apple", "iPhone 12");
			mob.addMobile("apple", "iPhone 11");
			mob.addMobile("samsung", "Galaxy M2");
			mob.addMobile("moto", "Moto G4");
			mob.addMobile("xiomi", "note 4");
			mob.addMobile("xiomi", "note 8");
			mob.addMobile("onePlus", "note 5");
			mob.addMobile("redmi", "note 8 pro 5G");
			mob.addMobile("IQ", "iq 9");
			try {
				List a1=mob.getModels("Apple");
				System.out.println(a1);
			} catch (InvalidMobileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


}
