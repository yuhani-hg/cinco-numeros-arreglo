package cuadroyarreglo;
import javax.swing.JOptionPane;
public class cinconumerosenunarreglo {
    public static void main(String[] args) {
        double[] num=new double[5];
        double law=0;
        int toto;
        String op;
        JOptionPane.showMessageDialog(null, "Suma");
        for (toto=0; toto<=4; toto++)
        {
            op=JOptionPane.showInputDialog("Ingresa un numero a sumar: ");
            num[toto]=Double.parseDouble(op);
            law=law+num[toto];
        }
        JOptionPane.showMessageDialog(null, "Suma= "+ law);
    }
    
}
