
public class ExpThrow {
	public static void main(String[] args) {
		System.out.println(methodReturningValue());

		System.out.println(methodReturningValue1());

	}

	static int methodReturningValue() {
		try {
			
			//int a=10;
			//a=a/0;
			
			return 50;
		} catch (Exception e) {
			return 60;
		} finally {
			//return 10;
			// Now, This block may or may not return a value
			// as both try and catch blocks are returning a value
		}
	}

	@SuppressWarnings("finally")
	static int methodReturningValue1() {
		try {
			// This block may or may not return a value as finally block is
			// returning a value
		} catch (Exception e) {
			// This block may or may not return a value as finally block is
			// returning a value
		} finally {
			return 20;
		}
	}
}
