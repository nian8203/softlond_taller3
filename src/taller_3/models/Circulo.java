package taller_3.models;

import taller_3.interfaces.IFiguras;

public class Circulo implements IFiguras {

	private final double PI = 3.1416;
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [PI=" + PI + ", radio=" + radio + "]";
	}

	@Override
	public double operacionArea() {
		return PI * radio * radio;
	}

	@Override
	public double operacionPerimetro() {
		return 2 * PI * radio;
	}

}
