class StudentInfo
{

	//Instance Variable
	int roll_number;
	String name;
	String area;

	StudentInfo(int roll_number)
	{
		this.roll_number = roll_number;
	
	}

	StudentInfo(int roll_number, String name)
	{

		this.roll_number = roll_number;
		this.name = name;
	}
	
	StudentInfo(int roll_number, String name, String area)
	{

		this.roll_number = roll_number;
		this.name = name;
		this.area = area;

	}
	//creating method to display the value
	void displayData()
	{

		System.out.println(roll_number + " " + name + " " + area );
	}

	public static void main(String[] args){

		//creating objects using Constructor
		StudentInfo s1 = new StudentInfo(21);
		StudentInfo s2 = new StudentInfo(6,"Gyanendra");
		StudentInfo s3 = new StudentInfo(8,"Gyanendra","Mishra");

		//Calling Method to display the value of object
		s1.displayData();
		s2.displayData();
		s3.displayData();
	}

}




