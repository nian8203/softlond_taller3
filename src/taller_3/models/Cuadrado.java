package taller_3.models;

import taller_3.interfaces.IFiguras;

public class Cuadrado implements IFiguras {

	private double lado;

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	@Override
	public double operacionArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public double operacionPerimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}
	
	
}
