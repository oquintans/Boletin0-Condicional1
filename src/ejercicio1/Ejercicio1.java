package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Condicional par1 = new Condicional();
        Condicional par2 = new Condicional();
        Condicional resultado = new Condicional();
        double num1=par1.pedirNum();
        double num2=par2.pedirNum();
        resultado.getCondicion(num1, num2);
        
    }

}
