class Student{
	private int studentid;
	private String name;
	private int daysattended;
	
Student(int studentId,String name,int daysattended)	{
   this.studentId=studentId;
   this.name=name;
   this.daysattended=daysattended;
}

public int getstudentid(){
	return studentId;
}

public String getname(){
	return name;
}

public int getdaysattended(){
	return daysattended;
}

public int setstudentid(int studentid){
	this.studentId=studentId;
}

public String setname(String name ){
	this.name=name;
}

public int setdaysattended(int daysattended){
	this.daysattended=daysattended;
}
  public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended;
    }

}

class Classroom{
	Student[] students=new student[10];
	int noOfstudent=0;
	
	public void addStudent(){
		if(noOfstudent<10)
		{
			students[noOfstudent++]=student;
		}
		else
		{
			System.out.println("You reached the maximum no of students");
		}
	}
	
	public void update(int studentId,int days){
        for (int i = 0; i < noOfstudent; i++) {
            if (students[i].getstudentid() == studentId) {
                students[i].setdaysattended(days);
                return;
            }
        }
        System.out.println("Student ID " + studentId + " not found.");
    }

    public void displayStudents() {
        for (int i = 0; i <  noOfstudent; i++) {
            System.out.println(students[i]);
        }
    }
	}


class Main{
	public static void main(String [] args){
		Classroom c1=new Classroom(101,"Alice Smith",12);
		Classroom c2=new Classroom(102,"Bob jones",15);
		Classroom c3=new Classroom(103,"Carol Lee",10);
		 classroom.update(102, 16);
        classroom.update(104, 20);
        classroom.displayStudents();
		
		
	}
	
	
}