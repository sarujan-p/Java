public class max{
	public static void main(String[] args){
		int max;
		int num[]={23,78,54,90,45};
		max=num[0];
		max=(max>num[1])?max:num[1];
		max=(max>num[2])?max:num[2];
		max=(max>num[3])?max:num[3];
		max=(max>num[4])?max:num[4];
		
		System.out.println("Max="+max);
		
	}
}