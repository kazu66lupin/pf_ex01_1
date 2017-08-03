package jizenkadai1;

public class JizenKadai1 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=100; i++){
			// 3の倍数(4の倍数は除く)
			if(i%3==0 && i%4!=0){
				System.out.print("△");
			}
			// 4の倍数(3の倍数は除く)
			else if(i%3!=0 && i%4==0){
				System.out.print("□");
			}
			// 3の倍数かつ4の倍数
			else if(i%3==0 && i%4==0){
				System.out.print("◆");
			}
			// 3の倍数でも4の倍数でもない値
			else{
				System.out.print(i);
			}
		}
	}

}
