public class twoDArray{
	public static void main(String[] args){
		String[][] table;
		table=new String[][]{{"00","01","02"},{"10","11","12"},{"20","21","22"}};
		for(int x=0;x<3;x++){
			for(int y=0;y<3;y++){
				System.out.print(table[x][y]+"\t");
			}
			System.out.println("\n");
		}
	}
}