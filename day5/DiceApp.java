import java.util.*;
public class DiceApp{
	public static void main(String[] args){
		/*
		 * サイコロを振ってそれが偶数か奇数かを判定する
		 (実行結果)
		 4は偶数です。
		 1は奇数です。
		 */

		int n = new Random().nextInt(6)+1;
		/*
		int m = n%2;
		*/
		if(n % 2 == 0){
			System.out.print(n + "は偶数です");
		}else{
			System.out.print(n + "は奇数です");
		}
	}
}
