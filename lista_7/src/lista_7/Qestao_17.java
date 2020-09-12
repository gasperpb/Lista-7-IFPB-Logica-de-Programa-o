package lista_7;

//import java.util.Scanner;

public class Qestao_17 {

	public static void main(String[] args) {

		//Scanner sc = new Scanner(System.in);

		for (int tri = 300; tri < 500; tri++) {

            
			 int i =0;
			int t = 0;
			while (t < tri) {
				t = i * (i + 1) * (i + 2);
				i += 1;
			}
			if (t ==tri ) {
				System.out.println(tri);

			}
		}
	}}

