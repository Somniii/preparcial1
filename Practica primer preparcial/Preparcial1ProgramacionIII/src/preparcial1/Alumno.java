package preparcial1;
/*- El alumno tendrá un método (Asignatura_aprobada) que nos devuelva “Aprobado” si
la nota por materia es mayor o igual a 7 o “Reprobado” si la nota es menor que 7.
- El alumno dispondrá de un método que nos devuelva el promedio del mismo al
pasarle asignaturas cursadas.
Generar un método que cuente la cantidad de horas mensuales de los docentes y el
decano, y la cantidad de horas de cursada del alumno de la siguiente manera:
Si es alumno será la suma de todas las horas de cursada semanales de
asignatura anotada.
Si es docente será la suma de todas las horas semanales de asignatura en la
que trabaja mas 10 horas semanales de investigacion.
Si es decano son 30 horas semanales
*/
public class Alumno implements horasFacultad{
	private String nombre, apellido;
	private long dni;
	private Asignatura[] vectorAsignatura;
	public Alumno() {
		
	}
	public Alumno(String nombre, String apellido, int dni, Asignatura[] vectorAsignatura) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
		setVectorAsignatura(vectorAsignatura);
	}
	public Asignatura[] getVectorAsignatura() {
		return vectorAsignatura;
	}
	public void setVectorAsignatura(Asignatura[] vectorAsignatura) {
		this.vectorAsignatura = vectorAsignatura;
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
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	//Esto esta mal pues esta viendo en un vector y no puede retornar un unico valor 
//	public String asignaturaAprobada(Asignatura[] vectorAsignatura) {
//		String caso;
//		if(vectorAsignatura.length == 0) {
//			caso= "no hay asignaturas";
//		}
//		for(int i = 0 ;i<  vectorAsignatura.length ; i++) {
//			if(vectorAsignatura[i].getNotas() >= 7) {
//				return "aprobada";
//			}else {
//				return "desaprobada";
//			}
//		}
//		return caso;
//
//	}
	public double devolverPromedio(Asignatura[] vectorAsignatura) {
		double sumatoria = 0;
		double promedio = 0;
		int contador = 0;
		while(contador <= vectorAsignatura.length) {
			sumatoria =+ vectorAsignatura[contador].getNotas();
			contador++;
		}
		promedio = sumatoria/contador;
		return promedio;
	}

	public String asignaturaAprobada(Asignatura A) {
		if(A.getNotas() >=7) {
			return "aprobada";
		}else {
			return "desaprobada";
		}
	}
	
}
