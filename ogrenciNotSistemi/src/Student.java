
public class Student {
	 String name,stuNo;
	 int classes;
	 Course oop,discrete,web;
	 double avarage;
	 boolean isPass;
	 
	 public Student(String name, String stuNo, int classes, Course oop, Course discrete, Course web) {
		super();
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.oop = oop;
		this.discrete = discrete;
		this.web = web;
		calcAvarage();
		this.isPass = false;
	}
	public void addBulkExamNote(int oop,int discrete,int web){
		if(oop>=0 && oop<=100) {
			this.oop.note=oop;
		}
		if(discrete>=0 && discrete<=100) {
			this.discrete.note=discrete;
		}
		if(web>=0 && web<=100) {
			this.web.note=web;
		}
		

}
	 public void isPass(){
		 this.isPass = isCheckPass();
         printNote();
         System.out.println("Ortalama : " + this.avarage);
         if (this.isPass) {
             System.out.println("Sınıfı Geçti. ");
         } else {
             System.out.println("Sınıfta Kaldı.");
         }
		 
	 }
	 public void calcAvarage(){
		 this.avarage=(this.oop.note + this.web.note + this.discrete.note)/3;
		
	 }
	public void printNote(){
		 System.out.println("=========================");
	        System.out.println("Öğrenci : " + this.name);
	        System.out.println("Oop Notu : " + this.oop.note);
	        System.out.println("Web Notu : " + this.web.note);
	        System.out.println("Discrete Notu : " + this.discrete.note);
		 
	 }
	 public boolean isCheckPass() {
		 calcAvarage();
	        return this.avarage > 55;
		 
}
	 }
