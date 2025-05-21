import java.util.Scanner;

public class MeuApp {
    public static void main(String[] args) {
    
        Scanner myObj = new Scanner(System.in);

        int A, B, soma;

        A = myObj.nextInt();
        B = myObj.nextInt();

        soma = A + B;

        System.out.println(soma);

        myObj.close();

        
    }
}
