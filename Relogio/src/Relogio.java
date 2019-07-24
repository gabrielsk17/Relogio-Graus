public class Relogio {

	private int hora, minuto;
	private double angulo;
	private String anguloFormatado;
	
	public Relogio(int hora, int minuto) {	
		this.hora = hora;
		this.minuto = minuto;
	}

	public double getAngulo() {
		return angulo;	
	}
	
	public String getAnguloFormatado(double angulo) {
		anguloFormatado = String.format("O angulo é: %.2f", angulo);
		return anguloFormatado;	
	}

	public void setAngulo(Relogio r) {
		
		double minutos = minuto, horas = hora, aux01, aux02, aux03;
		
		aux01 = ( ( 6 * ( horas * 5 ) ) + ( 30 * ( minutos / 60 ) ) );

		aux02 = ( minutos * 6 );

		if (aux01 > aux02)
			aux03 = aux01 - aux02;

		else
			aux03 = aux02 - aux01;

		if (aux03 > 180) {
			angulo = 360 - aux03;
			if(angulo < 0)
				angulo *= -1;
		}
		
		else {	
			angulo = aux03;
			if(angulo < 0)
				angulo *= -1;
		}
	
	}
	
}
