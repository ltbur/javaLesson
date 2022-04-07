import java.util.*;
public class Dice{
	public static void main(String[] args){
		int num = new Random().nextInt(6)+1;
				/*
				String result;
				if(num % 2 == 0){
					result="偶数";
				}else{
					result="奇数";
				}
				*/
				//条件演算子(三項演算子)
				String result = (num % 2 == 0) ? "偶数":"奇数";
				System.out.printf("%dは%sです%n",num,result);
	}
}
