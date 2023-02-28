package ecuacionCuadratica;

import javax.swing.JOptionPane;

public class ecuacionCuadratica {
    public static void main(String[] args) {
        
        // Declaración de variables 

        double  a , b , c , x2 , x1;
        
        
        
        // Entrada
        JOptionPane.showMessageDialog(null, "Calculadora cuadrática" );

        a = Double.parseDouble(JOptionPane.showInputDialog(("Digite el valor del coeficiente a: ")));
        b = Double.parseDouble(JOptionPane.showInputDialog(("Digite el valor del coeficiente b: ")));
        c = Double.parseDouble(JOptionPane.showInputDialog(("Digite el valor del coeficiente c: ")));
        
        // Procesamiento
        x1 = ( ( ( -b ) + Math.sqrt( Math.pow( b ,2) - ( 4*a*c ) ) ) / 2*a);
        x2 = ( ( ( -b ) - Math.sqrt( Math.pow( b ,2) - ( 4*a*c ) ) ) / 2*a);

        // Salida
        JOptionPane.showMessageDialog(null, "x1 es: " + x1);
        JOptionPane.showMessageDialog(null, "x2 es: " + x2);

    }
}
