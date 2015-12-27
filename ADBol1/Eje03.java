package Rep;

import java.io.File;

public class Eje03 {
	public static void main(String[] args) {
		//C:\\Users\\corpex.Corpex-Portatil\\Pruebas AD
		System.out.println("Introduce directorio:");
		sacarFicheros(Lector.scanStringAllNextLine());
		
	}

	private static void sacarFicheros(String path) {
		File f = new File(path);
		File[] ficheros = f.listFiles();
		for(File fs : ficheros){
			System.out.println("-"+fs.getName());
			if(fs.isDirectory())
				sacarFicheros(fs.getAbsolutePath());
		}
	}
}
