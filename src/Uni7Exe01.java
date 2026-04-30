import java.util.Scanner;


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Uni7Exe01 {
    //Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20 ; i++) {
            System.out.println("Informe o " + i +"º número: ");
            int numero = sc.nextInt();

            if (numero %2==0){
                System.out.println("PAR");
            }else{
                System.out.println("ÍMPAR");
            }


        }
        sc.close();
    }
}