package tarea5;

import java.io.File;
import java.util.Scanner;

public class Utilidad {

	public static File pedirFichero(String accion, Scanner sc) {
		System.out.println("Dime la ruta del archivo a " + accion);
		String ruta = sc.nextLine();
		if (ruta.equalsIgnoreCase("")) {
			 ruta = "src";
		}
		File archivo = new File(ruta);
		return archivo;
	}
	
	public static final int NUMERO_ALUMNOS = 5;
	
}
