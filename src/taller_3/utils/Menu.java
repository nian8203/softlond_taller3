package taller_3.utils;

import javax.swing.JOptionPane;

import taller_3.operaciones.FigurasGeometricas;
import taller_3.operaciones.NoticacionesOperacion;

public class Menu {
	
	private final FigurasGeometricas figurasGeometricas;
	private final NoticacionesOperacion noticacionesOperacion;
	
	public Menu() {
		this.figurasGeometricas = new FigurasGeometricas();
		this.noticacionesOperacion = new NoticacionesOperacion();
	}

	public void menuPrincipal() {
		
		String opcion;
		do {
			
			String msg = "1- Figuras geometricas\n";
			msg += "2- Sistema de notificaciones\n";
			msg += "3- Banco y cuentas\n";
			msg += "4- Juego de cartas\n";
			msg += "5- Tienda en línea\n";
			msg += "6- Animales y sonidos\n\n";
			
			opcion = JOptionPane.showInputDialog(null,msg,"Menu principal",JOptionPane.PLAIN_MESSAGE);
			switch (opcion) {
			case "1":
				menuFigurasGeometricas();	
				break;
			case "2":
				menuNotificaciones();
				break;
			case "3":
				
				break;

			default:
				break;
			}
			
		} while (!opcion.equals("s"));
		
		
	}
	
	private void menuFigurasGeometricas() {
		
		String opcion = "";
		do {
			
			String msg = "1- Area y perimetro circulo\n";
			msg += "2- Area triangulo\n";
			msg += "3- Perimetro triangulo\n";
			msg += "4- Area y perimetro cuadro\n";
			msg += "5- Salir\n\n";
			
			opcion = JOptionPane.showInputDialog(null,msg,"Figuras Geometricas",JOptionPane.PLAIN_MESSAGE);
			
			switch (opcion) {
			case "1":
				figurasGeometricas.areaPerimetroCirculo();
				break;
			case "2":
				figurasGeometricas.areaTriangulo();
				break;
			case "3":
				figurasGeometricas.perimetroTriangulo();
				break;
			case "4":
				figurasGeometricas.areaPerimetroCuadrado();
				break;
			case "5":
				menuPrincipal();
				break;
			default:
				break;
			}
			
		} while (!opcion.equals("5"));		
		
	}
	
private void menuNotificaciones() {
		
		String opcion = "";
		do {
			
			String msg = "1- Correo electronico\n";
			msg += "2- Mensaje de texto\n";
			msg += "3- Push\n";
			msg += "4- Salir\n\n";
			
			opcion = JOptionPane.showInputDialog(null,msg,"Tipo de notificaciones",JOptionPane.PLAIN_MESSAGE);
			
			switch (opcion) {
			case "1":
				noticacionesOperacion.solicitarDatos("correo");
				break;
			case "2":
				noticacionesOperacion.solicitarDatos("numero");
				break;
			case "3":
				noticacionesOperacion.solicitarDatos("nombre de la app");;
				break;
			case "4":
				menuPrincipal();
				break;
			default:
				break;
			}
			
		} while (!opcion.equals("4"));		
		
	}
	
	
	
	
	
}
