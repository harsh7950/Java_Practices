package org.Java.practices;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = new int[] { 1, 2, 3 };
		int[] array2 = new int[] { 4, 5, 9 };

		int[] total = ArrayAddition(array1, array2);
		// System.out.println(total.length);
		try {
			for (int l = 0; l <= total.length; l++) {
				System.out.println(total[l]);

			}
		} catch (ArrayIndexOutOfBoundsException e) {

		}
	}

	private static int[] ArrayAddition(int[] array1, int[] array2) {
		// TODO Auto-generated method stub

		int[] arraytotal = new int[array1.length];

		try {
			for (int i = 0; i <= array1.length; i++) {

				arraytotal[i] = array1[i] + array2[i];

			}

		} catch (ArrayIndexOutOfBoundsException e) {
		}

		return arraytotal;

	}

}
