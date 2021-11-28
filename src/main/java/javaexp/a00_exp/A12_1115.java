package javaexp.a00_exp;

public class A12_1115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int cnt=1;cnt<=50;cnt++) {
			String show=""+cnt;
			if(cnt%10!=0) {
				if(cnt%10%3==0) {
					show="짝";
					
									
				}
			}else {
				if(cnt/10==3) {
					show="짝";
				}
				if(cnt%10%3==0) {
					show+="짝";
				}				
			}
			System.out.print(show+",");
		}
	}

}
