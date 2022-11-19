package unico;

public class Ejercicio12 {

	public static void main(String[] args) {

		/*
		 * Implementar un método que reciba tres valores que se correspondan con un
		 * número de horas, minutos y segundos. El método debe transformar dicha medida
		 * en una expresión correcta, y mostrarlo por consola. El método devolverá,
		 * además, un valor booleano que indique si la fecha ha sobrepasado las 24 horas
		 * del día. Por ejemplo: dada la medida 3h 118m 195s, la función deberá mostrar
		 * 5h 1m 15s. Y devolverá false. dada la medida 23h 118m 195s, la función deberá
		 * mostrar 1h 1m 15s. Y devolverá true dada la medida 24h 0m 0s, la función
		 * deberá mostrar 0h 0m 0s. Y devolverá true.
		 */

		int horas;
		int minutos;
		int segundos;
		String mensaje;

		horas = Util.leerInt("Introduce el número de horas: ");
		minutos = Util.leerInt("Introduce el número de minutos: ");
		segundos = Util.leerInt("Introduce el número de segundos: ");
		
		mensaje = transformarFecha(horas, minutos, segundos); 
				
		Util.escribirLn("Dado: " + horas + "h " + minutos + "m " + segundos + "s. ");
		Util.escribirLn(mensaje);
	}

	static public String transformarFecha(int horas, int minutos, int segundos) {
		final int SEGHOR = 3600;
		final int SESEN = 60;
		final int HORDIA = 24;

		String fechaTotal;
		int seg;
		int segundosTotales;
		int minutosTotales;
		int horasTotales;
		boolean sobrepaso = false;

		seg = (horas * SEGHOR) + (minutos * SESEN) + segundos;

		minutosTotales = seg / SESEN;
		segundosTotales = seg % SESEN;
		horasTotales = minutosTotales / SESEN;
		minutosTotales = minutosTotales % SESEN;

		if (horasTotales >= HORDIA) {
			horasTotales -= HORDIA;
			sobrepaso = true;
		}
		
		fechaTotal = "Obtenemos: " + horasTotales + "h " + minutosTotales + "m " + segundosTotales + "s. Se ha sobrepasado las 24 horas: " + sobrepaso;
		
		return fechaTotal;
	}
}
