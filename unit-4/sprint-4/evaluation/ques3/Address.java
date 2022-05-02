package Eval4.ques3;
import java.io.Serializable;

public class Address implements Serializable{
	@Override
	public String toString() {
		return "Address [state=" + state + ", pincode=" + pincode + ", city=" + city + "]";
	}
	private String state;
	private String pincode;
	private String city;
	public String getState() {
		return state;
	}
	public Address() {
		
	}
	public Address(String state, String pincode, String city) {
		super();
		this.state = state;
		this.pincode = pincode;
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}

