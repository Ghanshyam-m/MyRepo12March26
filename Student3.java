package oops;

public class Student3 {
	//data member and member function
	
		int rollno;  // instance variable
		String name;
		float marks;
		
		Student3()
		{
			System.out.println("This is default constructor");
		}
		Student3(int r , String n, float m) //parameterized constructor
		{
			//System.out.println(r+ " "+n+" "+m);
			rollno=r;
			name=n;
			marks=m;
			System.out.println(rollno+ " "+name+" "+marks);
		}
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Student obj =new Student();  // default constructor
			Student  obj1=new Student(19 , "Reshma" ,67.89f);  //parameterized constructor
			
//			obj1.rollno=12; //state
//			
//			obj1.name="Rahul";
//			
//			obj1.marks=56.78f;
			
		//	System.out.println(obj1.rollno+ " "+obj1.name+" "+obj1.marks);
			
			Student  obj2=new Student(23 , "Raju" ,69.89f);  //parameterized constructor
			Student  obj3=new Student(56 , "Sarita" ,89.56f);  //parameterized constructor
			Student  obj4=new Student(1, "Manoj" ,55.90f);  //parameterized constructor
		}

	}