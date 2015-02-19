package cod;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 * @author dpazolopez
 */
public class EntradaDatos {
/**
 * Introducir numero
 * @param num; SI num=0 introduce por pantalla, si num=1 introduce por dialogo.
 * @return op
 */
    public static int introducir(int num) {
        Scanner dato = new Scanner(System.in);
        int op = 0;

        switch (num) {
            case 0:
                op = dato.nextInt();
                System.out.println(op);
            case 1:
                op = Integer.parseInt(JOptionPane.showInputDialog("Introduce dato"));
                JOptionPane.showMessageDialog(null, op);
            default:
                op = 0;
        }
        return op;

    }

}
