public class swap{
	public static void main(String[] args){
		int temp;
		int num[]={23,78,54,90,45};
		
		for(int i=0;i<5;i++){
			System.out.print(num[i]+"\t");
		}
		
		System.out.println("\n");
		
		temp=num[1];
		num[1]=num[2];
		num[2]=temp;
		
		for(int i=0;i<5;i++){
			System.out.print(num[i]+"\t");
		}
		
	}
}