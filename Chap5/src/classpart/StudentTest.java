package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "이순신");
		//studentLee.studentName = "이순신";
		//studentLee.studentID = 100; 
		//생성자가 매개변수를 받았으므로 위에 두줄은 안 써도 됨
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student(101, "김유신");
		//studentKim.studentName = "김유신";
		//studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}

}
