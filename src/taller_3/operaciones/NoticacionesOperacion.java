package taller_3.operaciones;

import javax.swing.JOptionPane;

import taller_3.models.Correo;
import taller_3.models.MsgTexto;
import taller_3.models.Push;

public class NoticacionesOperacion {

	public void solicitarDatos(String opcion) {
		String dato = JOptionPane
				.showInputDialog(null,"Ingrese el "+opcion,"Notificación",JOptionPane.PLAIN_MESSAGE);
		
		if (opcion.equals("correo")) {
			Correo correo = new Correo(dato);
			JOptionPane.showMessageDialog(null, correo.enviar(dato));
		}else if (opcion.equals("numero")) {
			MsgTexto msgTexto = new MsgTexto(dato);
			JOptionPane.showMessageDialog(null, msgTexto.enviar(dato));
		}else if (opcion.equals("nombre de la app")) {
			Push push = new Push(dato);
			JOptionPane.showMessageDialog(null, push.enviar(dato));
		}
		
		
	}
}
