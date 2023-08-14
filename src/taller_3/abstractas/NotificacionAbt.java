package taller_3.abstractas;

import taller_3.interfaces.INotificaciones;

public abstract class NotificacionAbt implements INotificaciones {

	private String msg;

	public NotificacionAbt(String msg) {
		super();
		this.msg = msg;
	}
	
	
}
