public class User{
	private String user;
	private String pass;
	
	public User(){
		this.user=null;
		this.pass=null;
	}
	public User(String User,String Pass){
		this.user=User;
		this.pass=Pass;
	}
	public String getUsername(){
		return user;
	}
	public String getPassword(){
		return pass;
	}
	public void setUsername(String user){
		this.user=user;
	}
	public void setPassword(String pass){
		this.pass=pass;
	}
}
