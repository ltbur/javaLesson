import java.util.*;
public class Letter{
	public static void main(String[] args){
		System.out.print("英文>>");
		String sentence = new Scanner(System.in).nextLine();
		for(int i=0;i<letter.length();i++){
			System.out.print(letter.charAt(i));
			if((i+1)%5==0){
				System.out.println();
			}
		}
		System.out.println();
	}
}
