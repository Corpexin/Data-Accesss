package Rep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Eje07 {

	public static void main(String[] args) throws FileNotFoundException {
		String s;
		String resultado="";
		int cont = 0;
		int cont2 =0;
		//Introduccion de la clave de encriptacion
		System.out.println("Introduce clave de encriptado:");
		String clave = Lector.scanStringAllNextLine();
		
		
		//Elegir fichero entrada
		try {
			BufferedReader lectura = new BufferedReader(new FileReader(new File("C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\prueba.txt")));
			//Elegir fichero destino
			BufferedWriter escritura = new BufferedWriter(new FileWriter(new File("C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\pruebaEncrip.txt")));
			//Leer caracacter a caracter el fichero
			//A cada caracter sumarle una letra de la clave, volviendo al principio de la clave cuando termine
			while((s = lectura.readLine()) != null){
				do{
					resultado = resultado +s.charAt(cont)+clave.charAt(cont2);
					cont++;
					if(cont2==clave.length()-1)
						cont2=0;
					else
						cont2++;
				}while(cont<s.length());
				escritura.write(resultado);
			}
			
			escritura.close();
			lectura.close();
			
		} catch (IOException e) {
			System.out.println("Archivo a encriptar no encontrado");
		}
		
	}

}
