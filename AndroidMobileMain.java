public class AndroidMobileMain {
	
	public static void main(String[] args) {
		AndroidPhone phone1 = new AndroidPhone(6, "navyblue", "oppo");
		AndroidPhone phone2 = new AndroidPhone(4, "black", "motorolla");
		AndroidPhone phone3 = new AndroidPhone(8, "blue", "realme");
		
		AndroidPhone[] phonearr = new AndroidPhone[4];
		phonearr[0] = phone1;
		phonearr[1] = phone2;
		phonearr[2] = phone3;
		
		for (AndroidPhone phone : phonearr) {
			System.out.println("Phone Name: " + phone.name + ", Ram: " + phone.ram + ", Color: " + phone.color);
		}
	}

}
