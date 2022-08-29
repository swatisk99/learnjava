package learnjar;

import learningjar.Second;
import learnjarc.ThirdLib;

public class First {

	public static void main(String[] args) {
		System.out.print("Calling JAR B");
		Second.main(args);
		System.out.print("Calling JAR D");
		ThirdLib.main(args);
	}
}
