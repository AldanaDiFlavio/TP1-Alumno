package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {

	int PrimerParcial;
	int SegundoParcial;
	boolean notaFinal;
	
	public void calificarPrimerParcial(int nota) {
		PrimerParcial=nota;
		
	}

	public int getPrimerParcial() {
		return PrimerParcial;
	}
	
	public void calificarSegundoParcial(int nota) {
		this.SegundoParcial=nota;
		
	}
	
	public int getSegundoParcial() {
		return SegundoParcial;
	}

	public boolean estaAprobado() {
		if((PrimerParcial >= 4 && PrimerParcial <= 10) && (SegundoParcial >= 4 && SegundoParcial <= 10))
			return notaFinal = true;
		else
			return notaFinal = false;
	}

	public boolean estaPromocionado() {
		if((PrimerParcial >= 7 && PrimerParcial <= 10) && (SegundoParcial >= 7 && SegundoParcial <= 10))
			return notaFinal = true;
		else
			return notaFinal = false;
	}


}
