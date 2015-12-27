package Rep;

import java.io.File;
import java.io.IOException;

public class Eje02 {

	public static void main(String[] args) {
		//Directorio actual?
		File f = new File("C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\Prueba02");
		if(f.mkdir())
			System.out.println("Fichero Creado");
		else
			System.out.println("El fichero ya existe");
		
		File ff1 = new File(f, "Fich1.txt");
		File ff2 = new File(f, "Fich2.txt");
		
		try {
			ff1.createNewFile();
			ff2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ff1.renameTo(new File(f, "Fich1Ren.txt"));
		
		if(ff2.delete())
			System.out.println("Fichero Borrado");
		else
			System.out.println("Fichero no borrado");
	}

}
