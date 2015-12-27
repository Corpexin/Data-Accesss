package Rep;

import java.io.File;

public class Eje01 {

	public static void main(String[] args) {
		//Solicitar fichero
		System.out.println("Introduce ruta de fichero:");
		File f = new File(Lector.scanStringAllNextLine());
		//File f = new File("C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD\\prueba.txt");
		
		//Mostrar datos
		if(f.exists()){
			System.out.println("Nombre: "+f.getName());
			System.out.println("Ejecutable? "+f.canExecute());
			System.out.println("Oculto? "+f.isHidden());
			System.out.println("Ruta Relativa: "+f.getPath());
			System.out.println("Ruta Absoluta: "+f.getAbsolutePath());
			System.out.println("Tamaño: "+f.length());
			
		}
		else{
			System.out.println("No se encuentra el archivo");
		}

	
	}

}
