package Loop;

public class Calculation {

	public static void main(String[] args) {
// TODO Auto-generated method stub    
		a: for (int i = 0; i <= 10; i++) {
			b: for (int j = 0; j <= 15; j++) {
				c: for (int k = 0; k <= 20; k++) {
					System.out.println(k);
					if (i == 10) {
						break a;
					}
				}
			}

		}
	}

}
