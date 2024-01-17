package escuelaTopGun;
import java.util.Scanner;

public class Gestion {
	
	public static void main(String[] args) {
		
		//se crean tres instancias de Piloto con los datos facilitados
		Piloto piloto1 = new Piloto(111, "Pete Maverick", 10000, "capitán");
		Piloto piloto2 = new Piloto(112, "Natasha Phoenix", 3000, "teniente");
		Piloto piloto3 = new Piloto(113, "Bradley Pooster", 3500, "teniente");
		
		//se pide al usuario que introduzca los datos de dos nuevos piloto y se crean los objetos con estos datos en su constructor	
		Scanner id = new Scanner(System.in);
		Scanner nombre = new Scanner(System.in);
		Scanner horas = new Scanner(System.in);
		Scanner rango = new Scanner(System.in);
		
		System.out.print("Introduzca el ID del piloto 4: ");
		int idPiloto4 = id.nextInt();		
		
		System.out.print("Introduzca el nombre del piloto 4: ");
		String nomPiloto4 = nombre.next();		
		
		System.out.print("Introduzca las horas de vuelo del piloto 4: ");
		double horasPiloto4 = horas.nextDouble();		
		
		System.out.print("Introduzca el rango del piloto 4: ");
		String rangoPiloto4 = rango.next();
		
		Piloto piloto4 = new Piloto (idPiloto4, nomPiloto4, horasPiloto4, rangoPiloto4);
		
				
		System.out.print("Introduzca el ID del piloto 5: ");
		int idPiloto5 = id.nextInt();
		
		System.out.print("Introduzca el nombre del piloto 5: ");
		String nomPiloto5 = nombre.next();
		
		System.out.print("Introduzca las horas de vuelo del piloto 5: ");
		double horasPiloto5 = horas.nextDouble();
		
		System.out.print("Introduzca el rango del piloto 5: ");
		String rangoPiloto5 = rango.next();
		
		Piloto piloto5 = new Piloto (idPiloto5, nomPiloto5, horasPiloto5, rangoPiloto5);
		
		//se muestran en consola los objetos Piloto
		System.out.println("Datos del piloto 1: " + piloto1.mostrarPiloto());
		System.out.println("Datos del piloto 3: " + piloto3.mostrarPiloto());
		System.out.println("Datos del piloto 4: " + piloto4.mostrarPiloto());
		System.out.println("Datos del piloto 5: " + piloto5.mostrarPiloto());
		
		//se crean tres instancias de Avion
		Entrenamiento avion1 = new Entrenamiento(23, "Yak-130", 6, piloto5, true);
		Entrenamiento avion2 = new Entrenamiento(29, "P-Mentor", 5, piloto3, false);
		Combate avion3 = new Combate(16, "caza", 3, piloto1, true);
		
		//se pide al usuario que introduzca los datos de dos nuevos aviones y se crean los objetos con estos datos en su constructor
		Scanner idAvion = new Scanner(System.in);
		Scanner modelo = new Scanner(System.in);
		Scanner capacidad = new Scanner(System.in);
		Scanner dobleMando = new Scanner(System.in);
		Boolean dobleMandoAvion4,dobleMandoAvion5;
		
		System.out.print("Introduzca el ID del avión 4: ");
		int idAvion4 = id.nextInt();		
		
		System.out.print("Introduzca el modelo del avión 4: ");
		String modeloAvion4 = modelo.next();		
		
		System.out.print("Introduzca el número de plazas del avión 4: ");
		int capacidadAvion4 = capacidad.nextInt();		
		
		System.out.print("Introduzca 'si' o 'no' si el avión 4 tiene doble mando: ");
		String dobleMandoAvion01 = dobleMando.next();
		if(dobleMandoAvion01.equals("si")){
			dobleMandoAvion4 = true;
		} else {
			dobleMandoAvion4 = false;
		}
		
		Entrenamiento avion4 = new Entrenamiento (idAvion4, modeloAvion4, capacidadAvion4, piloto2, dobleMandoAvion4);
		
		
		System.out.print("Introduzca el ID del avión 5: ");
		int idAvion5 = id.nextInt();		
		
		System.out.print("Introduzca el modelo del avión 5: ");
		String modeloAvion5 = modelo.next();		
		
		System.out.print("Introduzca el número de plazas del avión 4: ");
		int capacidadAvion5 = capacidad.nextInt();		
		
		System.out.print("Introduzca 'si' o 'no' si el avión 5 tiene doble mando: ");
		String dobleMandoAvion02 = dobleMando.next();
		if(dobleMandoAvion02.equals("si")){
			dobleMandoAvion5 = true;
		} else {
			dobleMandoAvion5 = false;
		}
		
		Entrenamiento avion5 = new Entrenamiento (idAvion5, modeloAvion5, capacidadAvion5, piloto1, dobleMandoAvion5);
		
		//se muestra en consola los objetos Avion
		System.out.println("Datos del avión 1: " + avion1.mostrarAvion() + " | " + avion1.MostrarTieneDobleMando());
		System.out.println("Datos del avión 2: " + avion2.mostrarAvion() + " | " + avion2.MostrarTieneDobleMando());
		System.out.println("Datos del avión 3: " + avion3.mostrarAvion() + " | " + avion3.MostrarEsFurtivo());
		System.out.println("Datos del avión 4: " + avion4.mostrarAvion() + " | " + avion4.MostrarTieneDobleMando());
		System.out.println("Datos del avión 4: " + avion5.mostrarAvion() + " | " + avion5.MostrarTieneDobleMando());
	}
	
}
