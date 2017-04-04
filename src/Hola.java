import javax.swing.JOptionPane;

public class Hola {

	
	
	
public static void main (String[]args ) {
	
	
	String num1 = JOptionPane.showInputDialog(null,"INGRESE SU NOTA ","NOTA",
			JOptionPane.INFORMATION_MESSAGE);

String num2 = JOptionPane.showInputDialog(null,"INGRESE SU NOTA","NOTA",
		JOptionPane.INFORMATION_MESSAGE);
int numero1 , numero2,  resultado ;
numero1 = Integer.parseInt(num1);
numero2 = Integer.parseInt(num2);
resultado = (numero1+numero2)/2;
System.out.println("PROMEDIO"+resultado);
}
}