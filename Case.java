public class Case{
	public static void main(String args[]){
		String upper="SARUJAN";
		String lower="sarujan";
		
		char x=upper.charAt(1);
		x=Character.toLowerCase(x);
		
		System.out.println(Character.isUpperCase(x));
		System.out.println(Character.isLowerCase(lower.charAt(1)));
		
		System.out.println(Character.isDigit(lower.charAt(1)));
		System.out.println(Character.isLetter(lower.charAt(1)));
	}
}