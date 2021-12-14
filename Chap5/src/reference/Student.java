package reference;

public class Student {
	int studentID;
	String studentName;
	Subject korea; //������Ʈ��� Ŭ������ �и�
	Subject math;
	
	
	
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korea = new Subject("����");
		math = new Subject("����");  //�����ڷ������� �� ������Ʈ ����
		
		//�����̸��� �ٲ��� ������ ������ �� �ٷ� �ֱ�
	}
	
	public void setKorea(int score) {
		
		korea.setScore(score); // �� ��ҵ��� �����ϴ� �޼���
	}
	
	public void setMath(int score) {
		
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		int total = korea.getScore() + math.getScore();
		System.out.println(studentName + "�л��� ������ " + total + "�� �Դϴ�.");;
	//������ ������ ����
	}
	
	
	

}
