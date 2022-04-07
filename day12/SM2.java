import java.util.*;
public class SM2{
	public static void main(String[] args){
		System.out.print("整数をカンマ区切りで入力");
		String str = new Scanner(System.in).nextLine();
		//カンマで区切られたデータの配列を作成
		String[] data=str.split(",");
		//合計の変数を設定
		int sum=0;
		//データがある回数分まで足していく
		for(int i=0;i<data.length;i++){
			int num = Integer.parseInt(data[i]);//文字列を数値にp90
			sum += num;
		}
		//出力
		System.out.printf("合計は%dです。%n",sum);
	}
}
