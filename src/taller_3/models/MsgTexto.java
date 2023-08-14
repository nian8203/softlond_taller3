package taller_3.models;

import taller_3.abstractas.NotificacionAbt;

public class MsgTexto extends NotificacionAbt{

	public MsgTexto(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String enviar(String msg) {
		String mensajeTexto = "Notificando por mensaje de texto al numero "+msg;
		return mensajeTexto;
	}

}
