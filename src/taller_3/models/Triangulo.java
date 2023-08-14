package taller_3.models;

import taller_3.interfaces.IFiguras;

public class Triangulo implements IFiguras {

	private double base;
	private double altura;
	private double lado1;
	private double lado2;
	private double lado3;

	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double operacionArea() {
		return base * altura;
	}

	@Override
	public double operacionPerimetro() {
		// TODO Auto-generated method stub
		return lado1 + lado2 + lado3;
	}

}
