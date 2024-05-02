package preparcial1;

public class Asignatura {
	private String nombre;
	private double notas;
	private int horasCursadas;
	public Asignatura() {
		
	}
	public Asignatura(String nombre , double notas, int horasCursadas) {
		setNombre(nombre);
		setNotas(notas);
		setHorasCursadas(horasCursadas);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	public int getHorasCursadas() {
		return horasCursadas;
	}
	public void setHorasCursadas(int horasCursadas) {
		this.horasCursadas = horasCursadas;
	}
	
}
