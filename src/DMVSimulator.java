
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
		int n = (int) (Math.random()*100);
		if (n == 99)
		{
			System.out.println("You do have the required paperwork");
		}
		else
		{
			System.out.println("How am I supposed to help you without any of the paperwork? Quit wasting my time.");
		}
		
		
	}

}
