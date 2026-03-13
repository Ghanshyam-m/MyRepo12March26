package oops;

public class Student2 {

	int rollno;
	String name;
	float marks;
	
	//parameterized constructor 
	
	Student2(int rollno ,String name, float marks){
	
		this.rollno= rollno;
		this.marks=marks;
		this.name=name;
		
	}
	
    void getStudentdetails() {
	    
    	System.out.println("rollNo : "+rollno);
		System.out.println("name :"+name);
		System.out.println("marks :"+marks);
		
    }
    
    public class UseofThis{
    	
    	
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 obj1=new Student2(19,"Reshma",67.89f); //parameterized constructor
		
		obj1.getStudentdetails();

	}

}
