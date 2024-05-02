package preparcial1;

public class Personal {
	private String nombre , apellido, cargoFuncion;
	public Personal() {

	}
	public Personal(String nombre, String appellido , String cargoFuncion) {
		setNombre(nombre);
		setApellido(apellido);
		setCargoFuncion(cargoFuncion);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCargoFuncion() {
		return cargoFuncion;
	}
	public void setCargoFuncion(String cargoFuncion) {
		this.cargoFuncion = cargoFuncion;
	}
}
