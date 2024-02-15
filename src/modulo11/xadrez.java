package modulo11;

public class xadrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 for (int i = 0; i < 8; i++) {
	 System.out.print(i+1);
	for(int j = 0; j < 8; j++) {
	 if((i + j) % 2 == 0) {
		 System.out.print("||");
	 } else {
		 System.out.print("  ");
	 }
	 
 }
 	System.out.println();
	}
	System.out.print("  a b c d e f g h");
	}
}
