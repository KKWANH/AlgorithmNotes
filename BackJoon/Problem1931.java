// class명 Main으로 바꾼 뒤 사용
import java.util.Scanner ;
public class Problem1931 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		int confCnt = scan.nextInt() ;
		String[] confInfo = new String[confCnt] ;
		scan.nextLine() ;
		for(int i=0; i<confCnt; i++)
			confInfo[i] = scan.nextLine() ;
		
		for(int i=0; i<confCnt; i++) {
			for(int j=i+1; j<confCnt; j++) {
				int nowStart = Integer.parseInt(confInfo[i].split(" ")[0]) ;
				int nowEnd   = Integer.parseInt(confInfo[i].split(" ")[1]) ;
				int nxtStart = Integer.parseInt(confInfo[j].split(" ")[0]) ;
				int nxtEnd   = Integer.parseInt(confInfo[j].split(" ")[1]) ;
				if((nowEnd-nowStart)>(nxtEnd-nxtStart)) {
					String temp = confInfo[i] ;
					confInfo[i] = confInfo[j] ;
					confInfo[j] = temp ;
				}
			}
		}
		
		for(int i=0; i<confCnt; i++)
			System.out.println(confInfo[i]) ;
	}
}
