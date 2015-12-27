package Rep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Eje05 {

	public static void main(String[] args) {
		//C:\\Users\\corpex.Corpex-Portatil\\OneDrive\\Curso desarrollo\\Segundo\\Acceso a Datos\\Preparacion Examen1.txt
		System.out.println("Introduce ruta de archivo a copiar:");
		String s;
		try {
			BufferedReader lectura = new BufferedReader(new FileReader(new File(Lector.scanStringAllNextLine())));
			System.out.println("Se copiara en C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\");
			BufferedWriter escritura = new BufferedWriter(new FileWriter(new File("C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\CopiadoEj05.txt")));
			while((s = lectura.readLine())!=null){
				escritura.write(s);
			}
			
			lectura.close();
			escritura.close();
		} catch (IOException e) {
			System.out.println("No se encuentra el archivo");
		}

	}

}
