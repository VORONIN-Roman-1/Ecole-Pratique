package function;

import java.util.stream.Stream;

public class SumChifre {
	public static int sumChifreNumber(int x) {
		int sum=0;
		while(x != 0){
		       //������������ ���� �����
		        sum += (x % 10);
		        x/=10;
		}
		return sum;
	} 
}
