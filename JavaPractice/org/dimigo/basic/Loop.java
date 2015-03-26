package org.dimigo.basic;

public class Loop {

	/**
	 * 2015. 03. 26. THUR
	 * 2321 이명현
	 */
	
	public static void main(String[] args) {
		int max = 10;

		for(int i = 0; i <= max; i++) {
			for(int j = 0; j <= max; j++) {
				if(i == j) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			} System.out.println();
		}
	}

}
