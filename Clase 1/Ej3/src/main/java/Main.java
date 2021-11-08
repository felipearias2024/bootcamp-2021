import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero a convertir en binario:");
        int numero = sc.nextInt();
        int resto;
        ArrayList binario = new ArrayList();
        while(numero > 0){
            resto = numero % 2;
            binario.add(resto);
            numero = numero / 2;
        }
        for (int i=binario.size()-1; i>=0;i--){
            System.out.print(binario.get(i));
        }
    }
}
