package Prac2;

import java.util.*;

public class Main{
	
 public static void main(String args[]){
	 
	int opc=0;
	boolean salir=false;
	
	Estudiante est1= new Estudiante("Jose",1274044,"Circuitos Electricos",90,"aprobado");
	Estudiante est2= new Estudiante("Luis",1275055,"Circuitos Digitales",85,"aprobado");
	Estudiante est3= new Estudiante("Victor",1276066,"Señales y Sistemas",55,"reprobado");
	Estudiante est4= new Estudiante("John",1271011,"Mercadotecnia",100,"aprobado");
	Estudiante est5= new Estudiante("Jahseh",1273033,"Aministracion",95,"aprobado");
	while(!salir)
	{
	try{
		System.out.println("seleccione una opcion:");
		System.out.println("1.- imprimir los primeros 5 alumnos");
		System.out.println("2.- imprimir capturar datos de los alumnos 6-10 y imprimir todos los alumnos");
		System.out.println("3.- salir");
		System.out.println();
		opc=CapturaEntrada.capturarEntero("opcion");
		switch(opc)
		{
		case 1:
			System.out.println(est1.getNombre());
			System.out.println(est1.getIdentificacion());
			System.out.println(est1.getMateria());
			System.out.println(est1.getCalificacion());
			System.out.println(est1.getEstado());
			System.out.println();
			System.out.println(est2.getNombre());
			System.out.println(est2.getIdentificacion());
			System.out.println(est2.getMateria());
			System.out.println(est2.getCalificacion());
			System.out.println(est2.getEstado());
			System.out.println();
			System.out.println(est3.getNombre());
			System.out.println(est3.getIdentificacion());
			System.out.println(est3.getMateria());
			System.out.println(est3.getCalificacion());
			System.out.println(est3.getEstado());
			System.out.println();
			System.out.println(est4.getNombre());
			System.out.println(est4.getIdentificacion());
			System.out.println(est4.getMateria());
			System.out.println(est4.getCalificacion());
			System.out.println(est4.getEstado());
			System.out.println();
			System.out.println(est5.getNombre());
			System.out.println(est5.getIdentificacion());
			System.out.println(est5.getMateria());
			System.out.println(est5.getCalificacion());
			System.out.println(est5.getEstado());
			break;
		case 2:
			Estudiante est6= new Estudiante(CapturaEntrada.capturarCadena("Ingrese el nombre del estudiante 6"),CapturaEntrada.capturarEntero("Ingrese su identificacion"),CapturaEntrada.capturarCadena("Ingrese la materia"),CapturaEntrada.capturarEntero("Ingrese la calificacion"),CapturaEntrada.capturarCadena("Ingrese el estado"));
			Estudiante est7= new Estudiante(CapturaEntrada.capturarCadena("Ingrese el nombre del estudiante 7"),CapturaEntrada.capturarEntero("Ingrese su identificacion"),CapturaEntrada.capturarCadena("Ingrese la materia"),CapturaEntrada.capturarEntero("Ingrese la calificacion"),CapturaEntrada.capturarCadena("Ingrese el estado"));
			Estudiante est8= new Estudiante(CapturaEntrada.capturarCadena("Ingrese el nombre del estudiante 8"),CapturaEntrada.capturarEntero("Ingrese su identificacion"),CapturaEntrada.capturarCadena("Ingrese la materia"),CapturaEntrada.capturarEntero("Ingrese la calificacion"),CapturaEntrada.capturarCadena("Ingrese el estado"));
			Estudiante est9= new Estudiante(CapturaEntrada.capturarCadena("Ingrese el nombre del estudiante 9"),CapturaEntrada.capturarEntero("Ingrese su identificacion"),CapturaEntrada.capturarCadena("Ingrese la materia"),CapturaEntrada.capturarEntero("Ingrese la calificacion"),CapturaEntrada.capturarCadena("Ingrese el estado"));
			Estudiante est10= new Estudiante(CapturaEntrada.capturarCadena("Ingrese el nombre del estudiante 10"),CapturaEntrada.capturarEntero("introduzca su identificacion"),CapturaEntrada.capturarCadena("Ingrese la materia"),CapturaEntrada.capturarEntero("Ingrese la calificacion"),CapturaEntrada.capturarCadena("Ingrese el estado"));
			System.out.println("Nombre: "+est1.getNombre());
			System.out.println("Identificacion: "+est1.getIdentificacion());
			System.out.println("Materia: "+est1.getMateria());
			System.out.println("Calificacion: "+est1.getCalificacion());
			if(est6.getCalificacion() > 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est2.getNombre());
			System.out.println("Identificacion: "+est2.getIdentificacion());
			System.out.println("Materia: "+est2.getMateria());
			System.out.println("Calificacion: "+est2.getCalificacion());
			if(est6.getCalificacion() > 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est3.getNombre());
			System.out.println("Identificacion: "+est3.getIdentificacion());
			System.out.println("Materia: "+est3.getMateria());
			System.out.println("Calificacion: "+est3.getCalificacion());
			if(est6.getCalificacion() > 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est4.getNombre());
			System.out.println("Identificacion: "+est4.getIdentificacion());
			System.out.println("Materia: "+est4.getMateria());
			System.out.println("Calificacion: "+est4.getCalificacion());
			if(est6.getCalificacion() > 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est5.getNombre());
			System.out.println("Identificacion: "+est5.getIdentificacion());
			System.out.println("Materia: "+est5.getMateria());
			System.out.println("Calificacion: "+est5.getCalificacion());
			if(est6.getCalificacion() >= 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est6.getNombre());
			System.out.println("Identificacion: "+est6.getIdentificacion());
			System.out.println("Materia: "+est6.getMateria());
			System.out.println("Calificacion: "+est6.getCalificacion());
			if(est6.getCalificacion() >= 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est7.getNombre());
			System.out.println("Identificacion: "+est7.getIdentificacion());
			System.out.println("Materia: "+est7.getMateria());
			System.out.println("Calificacion: "+est7.getCalificacion());
			if(est6.getCalificacion() >= 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est8.getNombre());
			System.out.println("Identificacion: "+est8.getIdentificacion());
			System.out.println("Materia: "+est8.getMateria());
			System.out.println("Calificacion: "+est8.getCalificacion());
			if(est6.getCalificacion() >= 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est9.getNombre());
			System.out.println("Identificacion: "+est9.getIdentificacion());
			System.out.println("Materia: "+est9.getMateria());
			System.out.println("Calificacion: "+est9.getCalificacion());
			if(est6.getCalificacion() >= 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			System.out.println();
			System.out.println("Nombre: "+est10.getNombre());
			System.out.println("Identificacion: "+est10.getIdentificacion());
			System.out.println("Materia: "+est10.getMateria());
			System.out.println("Calificacion: "+est10.getCalificacion());
			if(est6.getCalificacion() >= 60) {
				System.out.println("Estado: "+"Aprobado");
			}
			else{
				System.out.println("Estado: "+"Repobado");
			}
			break;
		case 3:
			salir=true;
		break;
		default:
			System.out.println("Seleciones una Opcion Valida.");
		}
		}catch(InputMismatchException e){
			System.out.println("Tienes que ingresar un numero.");
		}
  }
 }
} 
