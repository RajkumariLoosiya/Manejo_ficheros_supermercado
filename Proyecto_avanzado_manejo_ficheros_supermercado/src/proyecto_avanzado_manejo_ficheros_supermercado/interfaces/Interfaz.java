package proyecto_avanzado_manejo_ficheros_supermercado.interfaces;

import javax.swing.JOptionPane;

public class Interfaz {
	
	public int imprimirInterfaz() {
		
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "---------------Supermercados Miguel S.A--------------- \n"
				+"1. Cargar datos de la compra actual \n"
				+"2. Generar informe \n"
				+"3. Salir"));  

		
		return op; 
		
	}
	
	
	

}
