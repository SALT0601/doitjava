package loopexample;

public class Q4 {

	public static void main(String[] args) {
		int lineCount = 4;
		int starCount = 1;
		int spaceCount = lineCount/2 + 1;
		for(int i = 0; i < lineCount; i++) {
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
				
			}
			for(int j = 0; j < starCount; j++) { 
				// 지역변수라 
				// for문이 끝나면 다시 변수지정가능
				//만약 for문 밖인 public에 들어가 있으면 
				//j라는 변수는 하나밖에 지정 못함
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; i++) {
				System.out.print(" ");
				
			}
			spaceCount -= 1;
			starCount += 2;
			System.out.println();
		}

	}

}
