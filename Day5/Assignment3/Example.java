package Day_5.Assignment3;

public class Example implements InterOne {
	int varTwo = 100;
	int varOne;

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		varTwo = varTwo + 10;
		System.out.println("Value of varTwo:" + varTwo);
		System.out.println("Good Morning");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("Good Afternoon");
	}

}
