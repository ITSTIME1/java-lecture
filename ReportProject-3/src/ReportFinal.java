
public class ReportFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		다음은 3x4의 2차원 배열을 만들고 
//		이곳에 0~9 범위의 정수를 랜덤 하게 저장한 후 2차원 배열과 합을 출력하는 프로그램의 실행 결과와 코드이다. 빈 곳에 적절한 코드를 삽입하라
//		
		// 3행 4열을 만들고
		// 정수를 각각 저장한뒤
		// 그 배열들의 합을 그럼 랜덤하게 저장되는것들을 합산해주면되자나.
		int[][] arr = new int[3][4];
		
		
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// 0~9 사이의 난수를 생성.
				// random_number 를배열의 삽입.
				int random_number = (int)((Math.random()*10000)%10);
					total += random_number;
					arr[i][j] = random_number;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				// 0~9 사이의 난수를 생성.
				// random_number 를배열의 삽입.
				System.out.print(arr[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("합은 " + total);
		
	}

}
