package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korea; //서브젝트라는 클래스로 분리
	Subject math;
	
	
	
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("국어");
		math = new Subject("수학");  //참조자료형으로 쓴 서브젝트 구현
		
		//과목이름은 바뀌지 않으니 생성할 때 바로 주기
	}
	
	public void setKorea(int score) {
		
		korea.setScore(score); // 그 요소들을 셋팅하는 메서드
	}
	
	public void setMath(int score) {
		
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");;
	//겟으로 정보를 꺼냄
	}
	
	
	

}
