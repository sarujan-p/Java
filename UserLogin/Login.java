import java.util.Scanner;

public class Login{
	public static void getLoginDetails(){
		String username;
		String password;
		boolean result;
		Scanner Sc=new Scanner(System.in);
		
		System.out.print("Enter the Username:");
		username=Sc.next();
		System.out.print("Enter the Password:");
		password=Sc.next();
		
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		LoginDAO dao=new LoginDAO();
		result=dao.authenticate(u);
		
		if(result == true){
			System.out.println("You are Successfully Login!");
		}else{
			System.out.println("Username or Password is Incorrect!");
		}
	}
}
