import java.util.*;
public class Ball{
	public static void main(String[] args){
		int[] balls=new int[5];
		boolean isExists;
		int now;
		for(int i=0;i<balls.length;i++){
			do{
				isExists=false;
				now=new Random().nextInt(5)+1;
				for(int ball:balls){
					if(now == ball){
						isExists = true;
					}
				}
			}while(isExists);
			balls[i]=now;
		}
		System.out.println(Arrays.toString(balls));
	}
}
