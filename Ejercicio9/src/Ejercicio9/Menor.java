package Ejercicio9;

public class Menor {

	public static void Menor(int num1, int num2, int num3) {
		if((num1<num2)&&(num1<num3)) {
			System.out.println("El numero meror es el: " + num1);
		}else {
			if((num2<num1)&&(num2<num3)) {
				System.out.println("El numero meror es el: " + num2);
			}else {
				System.out.println("El numero meror es el: " + num3);
			}
		}
	}
}
