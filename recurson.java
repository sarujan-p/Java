import java.util.Scanner;

public class recurson{
	public long factorial(int x){
		if(x>1){
			return x*factorial(x-1);
		}else{
			return 1;
		}
	}
	public static void main(String[] args){
		int n;
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the Number to Calculate Factorial :");
		n=Sc.nextInt();
		recurson r=new recurson();
		System.out.println(n+"! = "+r.factorial(n));
	}
}