
public class ReportEight {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			String num = Integer.toString(i);
			
			int index = 0;
			
			if (num.length() < 2) {
				int tmp = i % 10;
				if(tmp == 3 || tmp == 6 || tmp == 9) {
					index += 1;
				}
			} else {
				int tmp = i / 10;
				int tmp_r = (i % 10);
				
				if(tmp == 3 || tmp == 6 || tmp == 9) {
					index += 1;
				}
				if(tmp_r == 3 || tmp_r == 6 || tmp_r == 9) {
					index += 1;
				}
				

			}
			
			
			if (index != 0 && index == 1) {
				System.out.println(i+" 박수한번");
			} else if(index != 0 && index == 2) {
				System.out.println(i+" 박수두번");
			}			
			
		}
		
	}

}
