package tarea5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LeerFicheroBinario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ObjectInputStream ois = null;

		try {
			ois = new ObjectInputStream(new FileInputStream(Utilidad.pedirFichero("leer", sc)));
			for(int i = 0;i<Utilidad.NUMERO_ALUMNOS;i++) {
				Alumno a = (Alumno) ois.readObject();
				mostrarAlumno(a);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void mostrarAlumno(Alumno a) {
		System.out.println("Alumno:");
		System.out.println("NIA: " + a.getDni());
		System.out.println("Nombre: " + a.getNombre());
		System.out.println("Apellidos: " + a.getApellidos());
		System.out.println("Género: " + a.getGenero());
		System.out.println("Fecha de Nacimiento: " + a.getFechaNacimiento());
		System.out.println("Ciclo: " + a.getCiclo());
		System.out.println("Curso: " + a.getCurso());
		System.out.println("Grupo: " + a.getGrupo());
		System.out.println("-------------------------------");
	}

}
