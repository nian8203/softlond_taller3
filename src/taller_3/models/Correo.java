package taller_3.models;

import taller_3.abstractas.NotificacionAbt;

public class Correo extends NotificacionAbt {

	public Correo(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String enviar(String msg) {		
		String msgConcatenado = "Enviando notificacion de correo a: \n- "+msg;
		return msgConcatenado;
	}

}
