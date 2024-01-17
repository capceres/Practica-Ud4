package escuelaTopGun;

public class Piloto {
	
	//atributos
	private int idPiloto;
	private String nomPiloto;
	private double horasVueloPiloto;
	private String rangoPiloto;
	
	//constructor
	public Piloto (int idPiloto, String nomPiloto, double horasVueloPiloto, String rangoPiloto) {
		this.idPiloto = idPiloto;
		this.nomPiloto = nomPiloto;
		this.horasVueloPiloto = horasVueloPiloto;
		this.rangoPiloto = rangoPiloto;
	}
	
	//métodos	
	public void setIdPiloto() {
		this.idPiloto = idPiloto;
	}
	
	public int getIdPiloto() {
		return idPiloto;
	}
	
	public void setNomPiloto() {
		this.nomPiloto = nomPiloto;
	}
	
	public String getNomPiloto() {
		return nomPiloto;
	}
	
	public void setHorasVueloPiloto() {
		this.horasVueloPiloto = horasVueloPiloto;
	}
	
	public double getHorasVueloPiloto() {
		return horasVueloPiloto;
	}
	
	public void setRangoPiloto() {
		this.rangoPiloto = rangoPiloto;
	}
	
	public String getRangoPiloto() {
		return rangoPiloto;
	}
	
	public String mostrarPiloto() {
		return "ID: " + idPiloto + " | " + "Nombre: " + nomPiloto + " | " + "Rango: " + rangoPiloto + " | " + "Horas de vuelo: " + horasVueloPiloto;
	}

}
