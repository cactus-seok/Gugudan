import java.util.Scanner;
public class Gugudan5 {

	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i = 1 ;
		for(i = 1; i<10; i++) {
			System.out.println(number * i);
		}
		

	}

}
