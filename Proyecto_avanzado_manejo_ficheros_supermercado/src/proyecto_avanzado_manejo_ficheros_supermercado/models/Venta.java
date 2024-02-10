package proyecto_avanzado_manejo_ficheros_supermercado.models;

import java.time.LocalDate;


public class Venta {
	
	private int id; 
	
	private int productoId;
	
	private int clienteId; 
	
	private int empleadoId; 
	
	private int descuentoId; 
	
	private int cantidad; 

	private LocalDate fecha;

	public Venta(int id, int productoId, int clienteId, int empleadoId, int descuentoId, int cantidad,
			LocalDate fecha) {

		this.id = id;
		this.productoId = productoId;
		this.clienteId = clienteId;
		this.empleadoId = empleadoId;
		this.descuentoId = descuentoId;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public int getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}

	public int getDescuentoId() {
		return descuentoId;
	}

	public void setDescuentoId(int descuentoId) {
		this.descuentoId = descuentoId;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", productoId=" + productoId + ", clienteId=" + clienteId + ", empleadoId="
				+ empleadoId + ", descuentoId=" + descuentoId + ", cantidad=" + cantidad + ", fecha=" + fecha + "]";
	}
		
	

}
