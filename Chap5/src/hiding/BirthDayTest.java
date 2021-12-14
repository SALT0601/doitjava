package hiding;

class BirthDay{
	private int day;
	int month;
	int year;
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) {
			if( day < 1 || day > 28) {
				System.out.println("날짜 오류입니다.");
			}
		}
		else {
			this.day = day;
		}
	}
	
	//프라이빗 한 day는 이렇게 게터 세터로 가져오면 쓸 수 있음
	
	
	
	
	
	

}

public class BirthDayTest {
	
	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		
		day.month = 2;
		day.setDay(30);
		day.year = 2021;
		
	}
}
