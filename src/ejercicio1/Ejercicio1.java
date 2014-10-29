package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Condicional par1 = new Condicional();
        double num1=par1.pedirNum();
        double num2=par1.pedirNum();
        par1.getCondicion(num1, num2);        
    }

}
