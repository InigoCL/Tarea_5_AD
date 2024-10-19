package tarea5;

//Realiza un programa Java que lea los datos de 5 alumnos, cree el objeto
//alumno, y guarde los alumnos en un fichero binario que solicitará por teclado.
//Cada alumno leído deberá ser guardado antes de solicitar el siguiente. Para
//cada alumno se tiene la siguiente información: NIA (entero), Nombre (String),
//Apellidos (String), Genero (Char), Fecha de Nacimiento (Fecha), Ciclo (String),
//Curso (String), Grupo (String).
//
//Crea otro programa Java que lea alumnos de un fichero de alumnos que se
//pedirá por teclado, y mostrará los alumnos por pantalla.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

// PARA TRABAJAR CON OBJECTINPUTSTREAM Y OBJECTOUTPUTSTREAM HAY QUE IMPLEMENTAR SERIALIZABLE A LA CLASE ALUMNO PARA PODER CONVERTILO A BYTES

public class CrearFicheroBinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjectOutputStream oos = null;

		try {
			oos = new ObjectOutputStream(new FileOutputStream(Utilidad.pedirFichero("guardar", sc)));
			for (int i = 0; i < Utilidad.NUMERO_ALUMNOS; i++) {
				Alumno a = new Alumno();
				a.pedirDatos(sc, i);
				oos.writeObject(a);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			sc.close();
		}
	}
}
