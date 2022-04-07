import java.util.*;
public class VariableInit{
	public static void main(String[] args){
		/*
		System.out.println(n);
		*/	
		/*
		int n;
		int x=5;
		if(x>0){
			n=10;
		}
		System.out.print(n);
		*/
		/*
		int n;
		int x=5;
		if(x>0){
			n=10;
		}
		System.out.print(n);
		*/

		/*OK
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else{
			n=20;
		}
		System.out.print(n);
		*/

		/*NG	
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<=0){
			n=20;
		}
		System.out.print(n);
		*/

		/*OK
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<0){
			n=20;
		}else{
			n=30;
		}
		System.out.println(n);
		*/

		/*
		int n;
		int x=5;
		if(x>0){
			n=10;
		}else if(x<0){
			//n=20;コメントアウト
		}else{
			n=30;
		}
		System.out.println(n);
		*/

		/*NG
		int n = new Random().nextInt(3);//0,1,2の乱数を生成
		String fortune;
		switch(n){
			case 0:
				fortune="大吉";
				break;
			case 1:
				fortune="吉";
				break;
			case 2:
				fortune="凶";
				break;
		}
		System.out.println(fortune);
		*/

		/*
		int n = new Random().nextInt(3);
		String fortune;
		switch(n){
		case 0:
			fortune="大吉";
			break;
		case 1:
			fortune="吉";
			break;
		default:
			fortune="凶";
		}
		System.out.println(fortune);
		*/


	}
}
