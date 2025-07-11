package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	public static void main(String[] args) {
		String fichero ="/Users/mananas/Desktop/Mis_cosas/Programa.java"; 
		//System.out.println(muestraFichero(fichero));
		System.out.println(leerFichero(fichero));
	}
	
	
//metodo bien hecho:
	public static String leerFichero(String fichero){
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			String linea;
			while((linea = br.readLine()) != null) {
				sb.append(linea+ "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	
	}
	
//metodo mal hecho 
	public static String muestraFichero(String fichero) {
		
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null; //se sierra solo si el fichero se abriera con exito se tiene que inicializar en null
		try {
			br = new BufferedReader(new FileReader(fichero));
			//vamos a leer linea linea
			String linea;
			//leer que mientras linea sea distinta de null (eof  = fin del texto y si aparece da null)
			while((linea = br.readLine()) != null) {
				sb.append(linea+ "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
		 if(br !=null) { //si el fichero se pudo abrir
			 try {
				br.close(); //muestra error tienes que meterlo en un try-catch para controlar la exception de ioexeption
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
			
		}
		return sb.toString();
	}
}
