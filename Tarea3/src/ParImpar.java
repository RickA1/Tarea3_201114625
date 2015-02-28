import java.util.*;
public class ParImpar {

	public static void main(String[] args) {
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Ingrese un Numero");
		n=s.nextInt();

		if(n%2==0)
		System.out.println("Es Par");
		else
			System.out.println("Es Impar");
	}
}
