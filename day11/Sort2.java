import java.util.*; public class Sort2{
	public static void main(String[] args){
		System.out.print("人数>>");
		int n = new Scanner(System.in).nextInt();
		int[] data=new int[n];
		for(int i=0;i<data.length;i++){
			data[i]=new Random().nextInt(101);
		}
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]<data[j]){
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
