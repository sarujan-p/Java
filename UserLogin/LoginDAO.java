public class LoginDAO{
	public boolean authenticate(User u) {
		String un = "Admin";
		String pw = "1234";
		boolean found = false;
		
		if (u.getUsername().equals(un) && u.getPassword().equals(pw)) {
			found = true;
		}
		
		return found;
	}
}