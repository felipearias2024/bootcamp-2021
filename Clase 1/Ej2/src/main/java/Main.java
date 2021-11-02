import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int aux = 0;
        int cifra;
        int inverso = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero de mas de una cifra:");
        int numero = sc.nextInt();
        while(numero < 10){
            System.out.println("Ingrese un numero entero de mas de una cifra:");
            numero = sc.nextInt();
        }
        aux = numero;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(numero == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
}
