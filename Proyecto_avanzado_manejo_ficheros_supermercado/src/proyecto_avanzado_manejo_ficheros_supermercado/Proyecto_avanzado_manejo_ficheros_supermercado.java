package proyecto_avanzado_manejo_ficheros_supermercado;

import proyecto_avanzado_manejo_ficheros_supermercado.interfaces.Interfaz;
import proyecto_avanzado_manejo_ficheros_supermercado.services.Logica_negocio;

public class Proyecto_avanzado_manejo_ficheros_supermercado {
	
	public static void main (String [] args) {
		
		Interfaz interfaz = new Interfaz();
		Logica_negocio logicaNegocio = new Logica_negocio();
		
		int op; 
		
		do {
			
			op = interfaz.imprimirInterfaz();
			
			
			switch(op) {
			
			case 1: 
				
//				for(String i: logicaNegocio.leerDatos()) {
//					System.out.println(i);
//				}
				
//				logicaNegocio.leerDatos().forEach(i->System.out.println(i));
				
//				logicaNegocio.leerDatos().forEach(System.out::println);
				
				logicaNegocio.procesarProductos();
				
				break; 
				
			case 2: 
				
				logicaNegocio.procesarVentas();
				
				break; 
			
			case 3:
				
				break; 
			
			}
			
			
		} while (op < 3);
		
		
		
		
		
		
	} 

}
