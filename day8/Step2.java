import java.util.*;
public class Step2{
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			for(int j=0;j<7;j++){
				System.out.print((i*j)%2==0? "X":" ");
			}
			System.out.println();
		}
	}
}
