
public class StringReversal {

	public static String reverse(String str) {
		
		if(str == null || str.length() <= 1){
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
	public static void main(String args[]) {
		String input = "recursion";
		String output = reverse(input);
		
		System.out.println("Reversed String: " + output);
	}
}