
public class App {

	public static void main(String[] args) {
	 
		// This is inefficient because Strings in Java are immutable. 
		String info = "";
		info += "My name is Bob";
		info += " ";
		info += "I am a builder. ";
		
		System.out.println(info);
		
		
		// More efficient (memory). 
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Rob");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		
		System.out.println(sb.toString());

		
		// Method chaining	
		StringBuilder s = new StringBuilder();
		s.append("My name is Bill.")
		.append(" ")
		.append("I am a skydiver.");
		
		System.out.println(s.toString());
		
		// String buffer is a Thread Safe version of StringBuilder
		
		
		
		///// Formatting 
		
		System.out.print("Here is some text. \tThat was a tab \nThat was a newline");
		System.out.println(" More text.");
		
		
		System.out.printf("Total cost %-10d quantity is %d\n", 5, 120);
		
		
	    // Helps align numbers 
		for (int i = 0; i < 20; i++) {
			//System.out.printf("%2d: some text here\n", i);
			System.out.printf("%-2d: %s\n", i, "some text here", i);
			
		}
		
		
		System.out.printf("Total value: %.2f\n", 5.66874);
		System.out.printf("Total value: %6.1f\n", 5.66874);
		
		 
	}

}
