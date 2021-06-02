package principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner escritura = new Scanner(System.in);
		int alumnos = 0;
		Aulas au = new Aulas();
		int dato = -1;
		do {
			try {
				System.out.println("Ingrese la cantidad de alumnos inscriptos");
				alumnos = escritura.nextInt();
				if (alumnos > 41) {
					System.out.println("La entrada debe ser menor o igual a 40");
				} else {
					au.setAlumnos(alumnos);
					au.solucion();
				}
			} catch (Exception e) {
				System.out.println("Debe ingresar numero de alumnos no letras y simbolos raros");
				escritura.nextLine();
			}
			try {

				if (au.revisarAulas() == false) {
					do {
						System.out.println(
								"Ya no posee aulas habilitadas, desea salir tipee 0 si desea ver como quedo la linsta de aulas tipee 2");
						dato = escritura.nextInt();
						if (dato == 2) {
							System.out.println(au.getAul());
							System.out.println(
									"Ya no posee aulas habilitadas, desea salir tipee 0 si desea ver como quedo la linsta de aulas tipee 2");
							;
							dato = escritura.nextInt();
						}
					} while (dato == 2);
				} else {
					do {
						System.out.println("  Tiene aulas disponibles aun. Desea seguir tipee 1\n"
								+ "  Desea salir tipee 0\n" + "  Desea ver como quedo la lista con las aulas tipee 2");
						dato = escritura.nextInt();

						if (dato == 2) {
							// System.out.println(au.getAul());
							System.out.println("LISTA");
							for (Object string : au.getAul()) {
								System.out.println("---------------------------------------");
								System.out.println(string);
							}

						}
					} while (dato == 2);
				}

			} catch (Exception e) {
				System.out.println("Debe ingresar los numeros solicitados para que funcione el sistema");
				escritura.nextLine();
			}

		} while (dato != 0);
	}

}
