
public class ForeachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = {1, 2, 3, 4, 5};
		
		int sum = 0;
		for (int l : n) {
			sum += l;
		}
		
		String[] ar = {"사과", "배", "오렌지"};
		
		int index = 0;
		String[] ar2 = new String[3];
		
		// for - each로 잘 들어갔음
		for (String s : ar) {
			ar2[index] = s;
			index += 1;
			
		}
		
		// 2행 5열
		int ar3[][] = new int[2][5];
		int size1 = ar3[0].length;
		int size2 = ar3[1].length;
		
		int[][] arr = new int[3][];

		arr[0] = new int[2];

		arr[1] = new int[4];

		arr[2] = new int[1];
		// 첫번재는 2
		// 두번재는 4
		
		// 세번재는 3
		
		// 가변 배열은 이렇게 할 수 있겠다.
		int index1 = 2;
		int value = 0;
		for (int i=0; i < 3; i++) {
			arr[i] = new int[index1];
			for (int k= 0; k < arr[i].length; k++ ) {
				arr[i][k] = value;
				value += 1;
			}
		}
		
		
		boolean[] b = {true, false, true, true};
		for (boolean boo : b) {
			
			System.out.print(boo);
		}
		
	}
	
		
}
