package taller_3.operaciones;

import javax.swing.JOptionPane;

import taller_3.models.Circulo;
import taller_3.models.Cuadrado;
import taller_3.models.Triangulo;
import taller_3.utils.ControlDecimales;

public class FigurasGeometricas {

	private final ControlDecimales controlDecimales;

	public FigurasGeometricas() {
		this.controlDecimales = new ControlDecimales();
	}

	public String areaPerimetroCirculo() {
		String dato = JOptionPane.showInputDialog(null, "Ingrese radio del circulo", "CIRCULO",
				JOptionPane.PLAIN_MESSAGE);
		double radio = Double.valueOf(dato);

		Circulo circulo = new Circulo(radio);
		String area = controlDecimales.decimales(circulo.operacionArea());
		String perimetro = controlDecimales.decimales(circulo.operacionPerimetro());

		String response = "Datos del circulo\n";
		response += "Area = " + area + "\n";
		response += "Perimetro = " + perimetro + "\n\n";
		JOptionPane.showMessageDialog(null, response);
		return response;
	}

	public String areaTriangulo() {
		String dato1 = JOptionPane.showInputDialog(null, "Ingrese valor de la base", "TRIANGULO",
				JOptionPane.PLAIN_MESSAGE);
		String dato2 = JOptionPane.showInputDialog(null, "Ingrese valor de la altura", "TRIANGULO",
				JOptionPane.PLAIN_MESSAGE);
		double base = Double.valueOf(dato1);
		double altura = Double.valueOf(dato2);

		Triangulo triangulo = new Triangulo(base, altura);
		String area = controlDecimales.decimales(triangulo.operacionArea());

		String response = "Dato del triangulo\n";
		response += "Area = " + area + "\n\n";
		JOptionPane.showMessageDialog(null, response);
		return response;
	}

	public String perimetroTriangulo() {
		String dato1 = JOptionPane.showInputDialog(null, "Ingrese valor lado 1", "TRIANGULO",
				JOptionPane.PLAIN_MESSAGE);
		String dato2 = JOptionPane.showInputDialog(null, "Ingrese valor lado 2", "TRIANGULO",
				JOptionPane.PLAIN_MESSAGE);
		String dato3 = JOptionPane.showInputDialog(null, "Ingrese valor lado 3", "TRIANGULO",
				JOptionPane.PLAIN_MESSAGE);

		double lado1 = Double.valueOf(dato1);
		double lado2 = Double.valueOf(dato2);
		double lado3 = Double.valueOf(dato3);

		Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
		String perimetro = controlDecimales.decimales(triangulo.operacionPerimetro());

		String response = "Dato del triangulo\n";
		response += "Perimetro = " + perimetro + "\n\n";
		JOptionPane.showMessageDialog(null, response);
		return response;
	}

	public String areaPerimetroCuadrado() {

		String dato1 = JOptionPane.showInputDialog(null, "Ingrese un valor", "CUADRADO",
				JOptionPane.PLAIN_MESSAGE);
		double lado = Double.valueOf(dato1);

		Cuadrado cuadrado = new Cuadrado(lado);
		String area = controlDecimales.decimales(cuadrado.operacionArea());
		String perimetro = controlDecimales.decimales(cuadrado.operacionPerimetro());

		String response = "Datos del cuadrado\n";
		response += "Area = " + area + "\n";
		response += "Perimetro = " + perimetro + "\n\n";

		JOptionPane.showMessageDialog(null, response);
		return response;
	}

}
