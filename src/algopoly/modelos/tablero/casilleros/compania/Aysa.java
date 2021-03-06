package algopoly.modelos.tablero.casilleros.compania;

import algopoly.modelos.tablero.casilleros.Casillero;

public class Aysa extends Compania implements Casillero {

	private static final Integer PRECIO_AYSA = 30000;
	private static final Integer IMP_AYSA = 300;
	private static final Integer IMP_AYSA_DOBLE = 500;
	
	public Aysa() {
		this.precio = PRECIO_AYSA;
		this.impuesto = IMP_AYSA;
		this.impuestoDoble = IMP_AYSA_DOBLE;
		this.estado = new SinPropietario();
	}

	@Override
	public String getNombre() {
		return "AYSA";
	}


}
