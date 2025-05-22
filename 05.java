class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	
	
	public Student(String name,int exam1,int exam2,int exam3)throws Exception{
		this.name=name;
		try{
		  if((exam1>=0) && (exam1<=100))
		  {
			  this.exam1=exam1;
		  }
		}
		catch(Exception e){
			System.out.println("Error consider the marks"+e.getMessage());
		}
		try{
		  if((exam2>=0) && (exam2<=100))
		  {
			  this.exam2=exam2;
		  }
		}
		catch(Exception e){
			System.out.println("Error consider the marks"+e.getMessage());
		}
		try{
		  if((exam3>=0) && (exam3<=100))
		  {
			  this.exam3=exam3;
		  }
		}
		catch(Exception e){
			System.out.println("Error consider the marks"+e.getMessage());
		}
	}
		public String getname(){
			return name;
		}
		public int getexam1(){
			return exam1;
		}
		public int getexam2(){
			return exam2;
		}
		public int getexam3(){
			return exam3;
		}
		public void setname(String name){
			this.name=name;
		}
		public void setexam1(int exam1){
			this.exam1=exam1;
		}
		public void setexam2(int exam2){
			this.exam2=exam2;
		}
		public void setexam3(int exam3){
			this.exam3=exam3;
		}
		 public double calculateAverage(){
			 double x=(exam1+exam2+exam3)/3f;
			 return x;
		 }
	}
	
	
	class Main{
		public static void main(String[] args){
		
			try{
				Student s1=new Student("John",75,110,90);
				System.out.println("Name of the student is "+s1.getname()+" average marks is: "+s1.calculateAverage());
			}
			catch(Exception e){
				System.out.println("Invalid marks"+e.getMessage());
			}
							

			
			
		}
	}
	
  
