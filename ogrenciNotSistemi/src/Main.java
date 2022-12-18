
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course oop =new Course("Oop", "OOP101", "OOP");
        Course discrete =new Course("Discrete", "DSC101", "DSC");
        Course web =new Course("Web", "WEB101", "WEB");

        Teacher t1 = new Teacher("Fatih H ", "90550000000", "OOP");
        Teacher t2 = new Teacher("Enes H", "90550000001", "DSC");
        Teacher t3 = new Teacher("Tayfur H", "90550000002", "WEB");

        oop.addTeacher(t1);
        discrete.addTeacher(t2);
        web.addTeacher(t3);

        Student s1 = new Student("Zeynep B","226", 4,  oop, discrete, web);
        s1.addBulkExamNote(89,76,100);
        s1.isPass();

        Student s2 = new Student("Sare Y",  "48",4,  oop, discrete, web);
        s2.addBulkExamNote(87,88,100);
        s2.isPass();

        Student s3 = new Student("Kübra K", "30", 4, oop, discrete, web);
        s3.addBulkExamNote(89,92,95);
        s3.isPass();

	}

}
