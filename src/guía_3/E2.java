package guía_3;

import java.util.Arrays;

public class E2 {

	public static void main(String[] args) {
		int size = 4;
		int[][] oneToNine = new int[size][size];
		for (int i = 0; i < oneToNine.length; i++) {
			for (int j = 0; j < oneToNine[i].length; j++) {
				oneToNine[i][j] = (int) (Math.random() * 10);
			}
		}
		System.out.println(Arrays.deepToString(oneToNine).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
	}

}
