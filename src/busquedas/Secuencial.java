package busquedas;

import javax.swing.JOptionPane;

public class Secuencial {

	public static void main(String[] args) {

		int arreglo[] = { 3, 5, 2, 1, 4 };
		int num;
		boolean band = false;

		num = Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));

		int i = 0;

		while (i < 5 && band == false) {
			if (arreglo[i] == num) {
				band = true;
			}
			i++;
		}

		if (band == false) {
			System.out.println("El número que buscas no se encuentra");
		} else {
			System.out.println("El número que buscas está en la posición: "+(i-1));
		}

	}
}
