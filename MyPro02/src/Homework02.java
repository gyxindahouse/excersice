/**
 * ±à³ÌÇó£º¡Æ1+¡Æ2+¡­¡­+¡Æ100
 * @author ¹ùòå
 *
 */
public class Homework02 {
	public static void main(String[] args) {
		int sum01 = 0;
		int sum02 = 0;
		for(int i=1; i<=100; i++){
			for(int j=i; j>=0; j--){
				sum01 += j;
			}
			sum02 += sum01;
		}
		System.out.printf("¡Æ1+¡Æ2+¡­¡­+¡Æ100 = %d", sum02);
	}
}
