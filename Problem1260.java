// class명 Main으로 바꾼 뒤 사용
import java.util.Scanner ;
public class Problem1260 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String basicInfo = scan.nextLine() ;
		
		int[] basicInfoArr = new int[3] ;
		int[][] Arr1 = new int[basicInfoArr[1]][2] ;
		int[][] Arr2 = new int[basicInfoArr[1]][2] ;
		for(int i=0; i<3; i++)
			basicInfoArr[i] = Integer.parseInt(basicInfo.split(" ")[i]) ;
		
		for(int i=0; i<basicInfoArr[1]; i++) {
			String temp = scan.nextLine() ;
			Arr1[i][0] = Integer.parseInt(temp.split(" ")[0]) ;
			Arr1[i][1] = Integer.parseInt(temp.split(" ")[1]) ;
		}
		
		for(int i=0; i<Arr1.length; i++) {
			for(int j=0; j<Arr1.length; i++) {
				
			}
		}
	}

}
