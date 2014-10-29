package ejercicio1;

import javax.swing.JOptionPane;

public class Condicional {

    private double num1;
    private double num2;

    public Condicional() {

    }

    public Condicional(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double pedirNum() {
        String respuesta = JOptionPane.showInputDialog("Introduce Número: ");
        double valor = Double.parseDouble(respuesta);
        return valor;
    }

    public void getCondicion() {
        if (num1 > num2) {
            System.out.println(num1 + " es mayor.");
        }
    }

    public void getCondicion(double n1, double n2) {
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "El mayor es "+n1);
        }
    }
}
