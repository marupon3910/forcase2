package forcase1;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		for (i = 0; i < 30; i++) {
			for (j = 0; j < 20; j++) {
				if (i % 3 == 0 && j % 2 == 0) {
					System.out.println(i * j);
				}
			}
		}
	}

}
