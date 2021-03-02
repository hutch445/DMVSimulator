
public class DMVSimulator {

	public static void main(String[] args) {
		System.out.println("Welcome to the DMV!");
		int num = (int) (Math.random() * 200);
		System.out.println("Your number is " + num);
		int i = 0;
		while (i < 200)
		{
			System.out.println("Number " + i + " please come to the counter");
			i++;
		}
		System.out.println("Number " + num + " please come to the counter");
		System.out.println("You do not have the require paperwork");
	}

}
