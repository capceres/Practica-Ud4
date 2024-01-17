package escuelaTopGun;

public class Entrenamiento extends Avion {
	
	//atributos
	private boolean tieneDobleMando;
	
	//constructor
	public Entrenamiento (int idAvion, String modAvion, int capAvion, Piloto responsable, boolean tieneDobleMando) {
		
		//llamada con super al constructor padre
		super (idAvion, modAvion, capAvion, responsable);
		
		this.tieneDobleMando = tieneDobleMando;
		
	}
	
	//métodos
	public boolean tieneDobleMando() {
		return tieneDobleMando;		
	}
	
	public String MostrarTieneDobleMando() {
		return "Tiene doble mando: " + tieneDobleMando();
	}
	
}
