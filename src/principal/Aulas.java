/**
 * 
 */
package principal;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author valen
 *
 */
public class Aulas {
	private Integer[] aulas = { 40, 35, 30 };
	private Integer alumnos = 0;
	private String[] nombresAulas = { "Azul", "Verde", "Amarillo" };
	private ArrayList aul = new ArrayList<>();
	

	public ArrayList getAul() {
		
		return aul;
	}

	public Aulas() {

	}

	public Integer getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Integer alumnos) {
		this.alumnos = alumnos;
	}

	public Integer[] getAulas() {
		return aulas;
	}
//Algoritmo que deja las aulas cerraas y agrega los datos a la lista para mostrarlas en pantalla
	public void solucion() {
		int numero = 0;
		int aulaCorrecta = acomodarAlumnos(this.alumnos, this.aulas);
		if (aulaCorrecta >= 0) {
			System.out.println(
					"En el Aula " + this.nombresAulas[aulaCorrecta] + " entraron los " + this.alumnos + " alumnos");
			numero = this.aulas[aulaCorrecta];
			aul.add("Aula " + this.nombresAulas[aulaCorrecta] + " Capacidad para " + this.aulas[aulaCorrecta]
					+ " Alumnos, se insertaron " + this.alumnos);
			this.aulas[aulaCorrecta] = 0;

		} else {
			System.out.println(
					"No se encontraron aulas aptas para esa cantidad de inscriptos/n o para inscribir mas alumnos ");
		}
	}

	// Coloca la cantidad de alumnos en la mejor aula
	public int acomodarAlumnos(int alum, Integer[] au) {
		System.out.println("La cantidad de alumnos que ingreso es " + alumnos);
		Integer min = 999;
		Integer result = -1;
		Integer a = 0;
		for (int i = 0; i < this.aulas.length; i++) {
			a = au[i] - alum;
			// System.out.println("modulo de aula "+i+" "+this.aulas[i]+" MODULO "+a);
			if ((min > a) && (a >= 0)) {
				min = a;
				result = i;
				// System.out.println("el minimo es " +a +" aula correcta " +result);
			}
		}
		return result;
	}

	// Revisa si todas la aulas estan vacias para seguir solicitando numeros de
	// ingreso en pantalla
	public boolean revisarAulas() {
		boolean cantidad = true;
		int contador = 0;
		for (int i = 0; i < this.aulas.length; i++) {
			if (this.aulas[i] > 0) {
				contador++;
			}
		}
		if (contador == 0) {
			cantidad = false;
		}
		return cantidad;
	}

}
