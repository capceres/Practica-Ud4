package escuelaTopGun;

public abstract class Avion {

	//atributos
	private int idAvion;
	private String modAvion;
	private int capAvion;
	private Piloto responsable;
	
	//constructor
	public Avion (int idAvion, String modAvion, int capAvion, Piloto responsable) {
		this.idAvion = idAvion;
		this.modAvion = modAvion;
		this.capAvion = capAvion;
		this.responsable = responsable;
	}
	
	//métodos
	public void setIdAvion() {
		this.idAvion = idAvion;
	}
	
	public int getIdAvion() {
		return idAvion;
	}
	
	public void setModAvion() {
		this.modAvion = modAvion;
	}
	
	public String getModAvion() {
		return modAvion;
	}
	
	public void setCapAvionn() {
		this.capAvion = capAvion;
	}
	
	public int getCapAvion() {
		return capAvion;
	}
	
	public void setResponsable() {
		this.responsable = responsable;
	}
	
	public Piloto getResponsable() {
		return responsable;
	}
	
	public String mostrarAvion() {
		return  "Datos del repsonsable: " + responsable.mostrarPiloto() + " | " + "ID: " + idAvion + " | " + "Modelo: " + modAvion + " | " + "Plazas: " + capAvion;
	}
	
}
