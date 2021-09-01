package Prac2;

public class Estudiante{
	String nombre;
	int identificacion;
	String materia;
	int calificacion;
	String estado;
	
	//Método constructor
	public Estudiante(String nombre, int identificacion, String materia, int calificacion, String estado){
		setNombre(nombre);
		setIdentificacion(identificacion);
		setMateria(materia);
		setCalificacion(calificacion);
		setEstado(estado);
	}
	//Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
		}
	
	public void setIdentificacion(int identificacion){
		this.identificacion = identificacion;
		}
	
	public void setMateria(String materia){
		this.materia = materia;
		}
	
	public void setCalificacion(int calificacion){
		this.calificacion = calificacion;
		}
	
	public void setEstado(String estado){
		this.estado = estado;
		}
	
	//Getters.
	public String getNombre(){
		return nombre;
		}
	
	public int getIdentificacion(){
		return identificacion;
		}
	
	public String getMateria(){
		return materia;
		}
	
	public int getCalificacion(){
		return calificacion;
		}
	
	public String getEstado(){
		return estado;
		}
	
}
