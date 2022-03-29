import java.util.*;
public class For5{
	public static void main(String[] args){
		System.out.print("幅>>");
		int w = new Scanner(System.in).nextInt();
		for(int i=0;i<3;i++){
			for(int j=0;j<w;j++){
				int n = new Random().nextInt(9)+1;
				System.out.printf("%d",n);
			}
			System.out.println();
		}
	}
}
