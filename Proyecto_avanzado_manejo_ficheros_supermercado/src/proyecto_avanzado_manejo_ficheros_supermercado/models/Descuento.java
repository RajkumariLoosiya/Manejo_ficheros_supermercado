package proyecto_avanzado_manejo_ficheros_supermercado.models;

public class Descuento {
	
	private int id; 
	
	private String descripcion;
	
	private double valor;
	
	public Descuento(int id, String descripcion, double valor) {
		this.id = id;
		this.descripcion = descripcion;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Descuento [id=" + id + ", descripcion=" + descripcion + ", valor=" + valor + "]";
	} 
	
	

}
