import java.util.Scanner;

public class args{
	private String value;
	private double[] value1=new double[1000];
	private int[] value2=new int[1000];
	private static int a;
	private static int b;
	private boolean operation=false,isDouble=false,isInt=false;
	
	public void input(){
		Scanner Sc=new Scanner(System.in);
		do{
			System.out.print("Enter the Positive Number :");
			value=Sc.nextLine();
			int length=value.length();
			for(int i=0;i<length;i++){
				char YesNo=value.charAt(i);
				if(YesNo=='.'){
					isDouble=true;
					isInt=false;
					break;
				}else if(YesNo=='-'){
					operation=true;
					isDouble=false;
					isInt=false;
					break;
				}else{
					isInt=true;
					isDouble=false;
				}
			}
			if(isDouble==true){
				value1[a]=Double.parseDouble(value);
				a++;
				isDouble=false;
			}else if(isInt==true){
				value2[b]=Integer.parseInt(value);
				b++;
				isInt=false;
			}
			
		}while(operation != true);
	}
	
	public void display(){
		System.out.println((b==0)?"\nThere are no integer values!":"\nInteger Numbers are");
		for(int j=0;j<b;j++){
			System.out.print(value2[j] + "\t");
		}
		System.out.println((a==0)?"\n\nThere are no double values!":"\n\nDouble Numbers are");
		for(int j=0;j<a;j++){
			System.out.print(value1[j]+"\t");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args){
		//String type=((Object)ob.value).getClass().getName();
		//System.out.println(type);
		args ob=new args();
		ob.input();
		ob.display();
	}
}