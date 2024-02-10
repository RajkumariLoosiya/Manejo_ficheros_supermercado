package proyecto_avanzado_manejo_ficheros_supermercado.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import proyecto_avanzado_manejo_ficheros_supermercado.models.Cliente;
import proyecto_avanzado_manejo_ficheros_supermercado.models.Descuento;
import proyecto_avanzado_manejo_ficheros_supermercado.models.Empleado;
import proyecto_avanzado_manejo_ficheros_supermercado.models.Producto;
import proyecto_avanzado_manejo_ficheros_supermercado.models.Venta;

public class Logica_negocio {
	
	public List<String> leerDatos() {
		
		String url = "C:\\Users\\migue\\Desktop\\Workspace Eclipse Github\\Proyecto_avanzado_manejo_ficheros_supermercado\\src\\proyecto_avanzado_manejo_ficheros_supermercado\\data\\datos (1).txt"; 
		String linea = ""; 
		List<String> listaSalida = new ArrayList<>();
		
		try {
			
		BufferedReader reader = new BufferedReader(new FileReader(url));
		
		while ((linea = reader.readLine())!= null) {
			
			
			
			
			listaSalida.add(linea);
		}
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return listaSalida;
		
	}
	
	public List<Producto> procesarProductos() {
		
		String url = "C:\\Users\\migue\\Desktop\\Workspace Eclipse Github\\Proyecto_avanzado_manejo_ficheros_supermercado\\src\\proyecto_avanzado_manejo_ficheros_supermercado\\data\\datos (1).txt"; 
		String linea = ""; 
		List<Producto> listaSalida = new ArrayList<>();
		
		
		try {
			
		boolean leyendoProductos = true; 
			
		BufferedReader reader = new BufferedReader(new FileReader(url));
		
		reader.readLine();
		
		while ((linea = reader.readLine())!= null) {
			
			if(linea.startsWith("# Descripcion: Clientes (ID, Nombre)") || linea.isEmpty()) {
				leyendoProductos = false; 
			}
			
			if(leyendoProductos){
				
				linea = linea.trim().replaceAll("\\s+", " ");
				

				
				if(linea.startsWith(".")) {
					linea = linea.substring(2);

				}
				
				System.out.println(linea);
				
				String [] campos = linea.split("\\s+");
				
				String nombreProducto = campos[0];

				double precioProducto = Double.parseDouble(campos[1]);
				
				int idProducto = Integer.parseInt(campos[2]);


				
				listaSalida.add(new Producto(idProducto, nombreProducto, precioProducto));
				
			}
			
			
		}
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		listaSalida.forEach(i -> System.out.println(i.toString()));
		
		return listaSalida;
		
	}
	
	public List<Cliente> procesarClientes() {

		
		
		String url = "C:\\Users\\migue\\Desktop\\Workspace Eclipse Github\\Proyecto_avanzado_manejo_ficheros_supermercado\\src\\proyecto_avanzado_manejo_ficheros_supermercado\\data\\datos (1).txt"; 
		String linea = ""; 
		List<Cliente> listaSalida = new ArrayList<>();
		Boolean leer = false; 
		int contador = 0;
		int idAutoGenerado = 1; 
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(url));
			
			
			
			while ((linea = reader.readLine())!= null) {
				
				if(linea.startsWith("# Descripcion: Clientes (ID, Nombre)")) { 
					leer=true; 
				}
				
				if(linea.startsWith("&& D3scripción: Empleados (ID, Nombre)") || linea.isEmpty()) {
					leer = false; 
				}
				
				if(leer && !linea.startsWith("# Descripcion: Clientes (ID, Nombre)")) {
					Cliente cliente = new Cliente(idAutoGenerado, linea);
					listaSalida.add(cliente);
					idAutoGenerado++;
				}
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Cliente i: listaSalida) {
			System.out.println(i.toString());
		}
		
		
		return listaSalida;
	}

	public List<Empleado> procesarEmpleados() {
		
		String url = "C:\\Users\\migue\\Desktop\\Workspace Eclipse Github\\Proyecto_avanzado_manejo_ficheros_supermercado\\src\\proyecto_avanzado_manejo_ficheros_supermercado\\data\\datos (1).txt"; 
		String linea = ""; 
		List<Empleado> listaSalida = new ArrayList<>();
		Boolean leer = false; 
		int contador = 0;
		int idAutoGenerado = 1; 
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(url));
			
			
			
			while ((linea = reader.readLine())!= null) {
				
				if(linea.startsWith("&& D3scripción: Empleados (ID, Nombre)")) { 
					leer=true; 
				}
				
				if(linea.startsWith("* Descr1pción: Descuentos (ID, Descripción") || linea.isEmpty()) {
					leer = false; 
				}
				
				if(leer && !linea.startsWith("&& D3scripción: Empleados (ID, Nombre)")) {
					Empleado empleado = new Empleado(idAutoGenerado, linea);
					listaSalida.add(empleado);
					idAutoGenerado++;
				}
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Empleado i: listaSalida) {
			System.out.println(i.toString());
		}
		
		
		return listaSalida;
	}

	public List<Descuento> procesarDescuentos() {
		
		String url = "C:\\Users\\migue\\Desktop\\Workspace Eclipse Github\\Proyecto_avanzado_manejo_ficheros_supermercado\\src\\proyecto_avanzado_manejo_ficheros_supermercado\\data\\datos (1).txt"; 
		String linea = ""; 
		List<Descuento> listaSalida = new ArrayList<>();
		Boolean leer = false; 
		String [] datos = new String[3];
 	
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(url));
			
			
			
			while ((linea = reader.readLine())!= null) {
				
				if(linea.startsWith("* Descr1pción: Descuentos (ID, Descripción")) { 
					leer=true; 
				}
				
				if(linea.startsWith("% Descripci0n: Ventas (ID, ProductoID, ClienteID, EmpleadoID, DescuentoID, Cantidad, Fecha)") || linea.isEmpty()) {
					leer = false; 
				}
				
				if(leer && !linea.startsWith("* Descr1pción: Descuentos (ID, Descripción")) {
					
					datos = linea.replace("$", "").replaceAll("\\s+", " ").split("\\s+");
					
					Descuento descuento = new Descuento(Integer.parseInt(datos[2]), datos[0], Double.parseDouble(datos[1]));
					listaSalida.add(descuento);
				}
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Descuento i: listaSalida) {
			System.out.println(i.toString());
		}
		
		
		return listaSalida;
	}
	
public List<Venta> procesarVentas() {
		
		String url = "C:\\Users\\migue\\Desktop\\Workspace Eclipse Github\\Proyecto_avanzado_manejo_ficheros_supermercado\\src\\proyecto_avanzado_manejo_ficheros_supermercado\\data\\datos (1).txt"; 
		String linea = ""; 
		List<Venta> listaSalida = new ArrayList<>();
		Boolean leer = false; 
		String [] datos = new String[3];
 	
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(url));
			
			
			
			while ((linea = reader.readLine())!= null) {
				
				if(linea.startsWith("% Descripci0n: Ventas (ID, ProductoID, ClienteID, EmpleadoID, DescuentoID, Cantidad, Fecha)")) { 
					leer=true; 
				}
				
				if(leer && !linea.startsWith("% Descripci0n: Ventas (ID, ProductoID, ClienteID, EmpleadoID, DescuentoID, Cantidad, Fecha)")) {
					
					datos = linea.split("\\s+");
					
					int id = Integer.parseInt(datos[0]);
					
					int productoId = Integer.parseInt(datos[1]);
					
					int clienteId = Integer.parseInt(datos[2]);
					
					int empleadoId = Integer.parseInt(datos[3]);
					
					int descuentoID = Integer.parseInt(datos[4]);
					
					int cantidad = Integer.parseInt(datos[5]);
					 
					LocalDate fecha = LocalDate.parse(datos[6]);
					
//					Date fecha1 = new SimpleDateFormat("yyyy-MM-dd").parse(datos[6]);
					
					Venta venta = new Venta(id, productoId, clienteId, empleadoId, descuentoID, cantidad, fecha);
					
					listaSalida.add(venta);
					
				}
				
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		for(Venta i: listaSalida) {
			System.out.println(i.toString());
		}
		
		
		return listaSalida;
	}
	
//	public void busquedaPorIdCompra(int idCliente, List<Venta> ListaCompra) {
//		
//		for(Venta i: ListaCompra) {
//			
//			if(idCliente == i.getClienteId()) {
//				System.out.println("El cliente con id de compra");
//			}
//	
//		}
//		
	
//	}
	
	

}
