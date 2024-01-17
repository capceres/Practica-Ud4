package escuelaTopGun;

public class Combate extends Avion {
	
	//atributos
	private boolean esFurtivo;
	
	//constructor
	public Combate (int idAvion, String modAvion, int capAvion, Piloto responsable, boolean esFurtivo) {
		
		//llamada con super al constructor padre
		super (idAvion, modAvion, capAvion, responsable);
		
		this.esFurtivo = esFurtivo;
		
	}
	
	//métodos
	public boolean esFurtivo() {
		return esFurtivo;		
	}
	
	public String MostrarEsFurtivo() {
		return "Es furtivo: " + esFurtivo();
	}
	
}
