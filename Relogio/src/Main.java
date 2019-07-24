import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		boolean aux1 = true;
		do {
			
			try {
				
				String aux;
				int hora, minuto;
				
				aux = JOptionPane.showInputDialog("Digite as horas:");
				if(aux == null) 
					System.exit(0);
				hora = Integer.parseInt(aux);
				if(hora > 24 || hora < 0)
					throw new Exception(); 
				
				aux = JOptionPane.showInputDialog("Digite os minutos:");
				if(aux == null) 
					System.exit(0);
				minuto = Integer.parseInt(aux);
				if(minuto > 60 || minuto < 0)
					throw new Exception(); 
				
				Relogio r = new Relogio(hora, minuto);
				r.setAngulo(r);
				JOptionPane.showMessageDialog(null ,r.getAnguloFormatado(r.getAngulo()));
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null , "Número inválido");
			}
			
		} while (aux1 == true);
		
	}

}