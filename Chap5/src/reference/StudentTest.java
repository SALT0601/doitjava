package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentJames = new Student(100, "James");
		//100Àº ÇÐ»ý id
		studentJames.setKorea(100);
		studentJames.setMath(90);
		
		Student studentTomas = new Student(101, "Tomas");
		studentTomas.setKorea(70);
		studentTomas.setMath(90);
		
		studentJames.showStudentInfo();
		studentTomas.showStudentInfo();

	}

}
