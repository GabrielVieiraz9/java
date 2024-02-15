package modulo11;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] quadr = {{2, 4, 6, 8, 10},{1, 3, 5, 7, 9}};
		
		for (int i = 1; i < quadr.length; i++) {
			for(int j = 0; j < (quadr[i].length); j++) {
				
				System.out.println(quadr[0][j]*quadr[1][j]);
			}
			
		}
	}

}
