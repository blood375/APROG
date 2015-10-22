package pl5_4;

//@author claudio
import java.util.Scanner;
public class PL5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int N, soma, num;

        System.out.println("Quantos numeros perfeitos quer?");
	N = input.nextInt();

        System.out.println("Numeros perfeitos:");
	num = 2;

	while (N > 0) {
	soma = 0;

	for (int divisores = 1; divisores < num; divisores++) {
            if (num % divisores == 0) {
                soma += divisores;
            }
	}

	if (soma == num) {
            System.out.println(num);
            N--;
            }

	num++;
		}
    }
}
    

