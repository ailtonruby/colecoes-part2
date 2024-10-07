import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Object Scanner;

    public static void main(String[] args) {
        exerciciolista();
    }
    public static void exerciciolista(){

        Scanner input = new Scanner(System.in);

        List<String> nome = new ArrayList<String>();
        List<String> sexo = new ArrayList<String>();

        System.out.println(" Quantas pessoas ?" );

        int valor = input.nextInt();

        for(int i=1; i<=valor; i++){

            System.out.println("Qual o seu nome ?" );
            nome.add(input.next());

            System.out.println("Qual o seu sexo ?" );
            sexo.add(input.next());
        }

        System.out.println(" O seu nome é" + nome);
        System.out.println(" O seu sexo é" + sexo);
    }
}