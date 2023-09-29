package com.assignment3;

public class JaggedArray {
	public static void main(String[] args) {
		String str[][] = new String[][] {
				new String[] { "Tony", "JAVA", "C", "C++" },
				new String[] { "Thomas", "JAVA", "UNIX" },
				new String[] { "Dinil", "Linux", "Oracle" },
				new String[] {
						"Delvin", "RDBMS", "C#", "Oracle"
				}
		};
		for (String s : str[3]) {
			System.out.println(s);
		}
	}
}
