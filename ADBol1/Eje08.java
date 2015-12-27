package Rep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Eje08 {

	public static void main(String[] args) {
		String nombre = Lector.scanGen('t', "Introduce Nombre:");
		String telefono = Lector.scanGen('t', "Introduce Telefono:");
		String direccion = Lector.scanGen('t', "Introduce Direccion:");
		int codPostal = Lector.scanGen('i', "Introduce Codigo Postal:");
		System.out.println("Introduce si debo dinero: [1]Si  [2]No");
		boolean deboDinero = Lector.scanBoolean(Lector.scanIntParam(1, 2));
		float cantidadDeber = Lector.scanGen('f', "Introduce Cantidad a Deber:");
		
		Eje08Persona persona = new Eje08Persona(nombre, telefono, direccion, codPostal, deboDinero, cantidadDeber);
		
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\eje08Fichero.dat")));
			salida.writeObject(persona);
			salida.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\eje08Fichero.dat")));
			Eje08Persona personaLeer = (Eje08Persona) entrada.readObject();
			System.out.println(personaLeer.toString());
			entrada.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
