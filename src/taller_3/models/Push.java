package taller_3.models;

import taller_3.abstractas.NotificacionAbt;

public class Push extends NotificacionAbt {

	public Push(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String enviar(String msg) {
		String mensajePush = "Tienes una actualización pendiente,\nEste es un mensaje de "+msg;
		return mensajePush;
	}

}
