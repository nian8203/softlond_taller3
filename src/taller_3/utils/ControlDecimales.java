package taller_3.utils;

import java.text.DecimalFormat;

public class ControlDecimales {

	public String decimales(double numero) {
		DecimalFormat df = new DecimalFormat("#,##0.0");
		return df.format(numero);
	}
}
