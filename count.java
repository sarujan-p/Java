import jav.util.Scanner;
/**
Author:Sarujan P,
Contact:saru.contacts@gmail.com,
File Name:count.java,
Date:2021.03.22
*/
public class count{
	private double value;
	private double[] value1=new double[1000];
	private int[] value2=new int[1000];
	private static int a;
	private static int b;
	private boolean operation;
	
	public void input(){
		Scanner Sc=new Scanner(System.in);
		do{
			System.out.print("Enter the Positive Number :");
			value=Sc.nextDouble();
			if(value%1==0 && value >= 0){
				value2[b]=(int)value;
				b++;
			}else if(value < 0){
				operation=true;
			}else{
				value1[a]=value;
				a++;
			}
			
		}while(operation == false);
	}
	
	public void display(){
		System.out.println("\nNumber of integer:"+b);
		System.out.println("Number of double:"+a);
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
		count ob=new count();
		ob.input();
		ob.display();
	}
}