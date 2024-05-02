package preparcial1;
/*Generar un método que cuente la cantidad de horas mensuales de los docentes y el
decano, y la cantidad de horas de cursada del alumno de la siguiente manera:
Si es alumno será la suma de todas las horas de cursada semanales de
asignatura anotada.
Si es docente será la suma de todas las horas semanales de asignatura en la
que trabaja mas 10 horas semanales de investigacion.
Si es decano son 30 horas semanales*/
public class Docente extends Personal implements horasFacultad{
	private Asignatura[] vectorAsignatura;
	public Docente() {	
	}
	public Docente(Asignatura[] vectorAsignatura) {
		setVectorAsignatura(vectorAsignatura);
	}
	public Asignatura[] getVectorAsignatura() {
		return vectorAsignatura;
	}
	public void setVectorAsignatura(Asignatura[] vectorAsignatura) {
		this.vectorAsignatura = vectorAsignatura;
	}
	
}