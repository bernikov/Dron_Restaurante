package casilla;


/* Clase que representa una casilla en el plano cartesiano */
public class CasillaPlanoCartesiano implements Casilla {

	private int coordenadaX;
	private int coordenadaY;
	private Direccion direccion;

	public CasillaPlanoCartesiano(int coordenadaX, int coordenadaY, Direccion direccion) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.direccion = direccion;
	}

	@Override
	public Casilla avanzar() {

		if(direccion == Direccion.NORTE){
			return new CasillaPlanoCartesiano(coordenadaX,coordenadaY + 1, direccion);
		}
		else if(direccion == Direccion.SUR){
			return new CasillaPlanoCartesiano(coordenadaX,coordenadaY - 1, direccion);
		}
		else if(direccion == Direccion.ESTE){
			return new CasillaPlanoCartesiano(coordenadaX + 1 ,coordenadaY - 1, direccion);
		}
		else if(direccion == Direccion.OESTE){
			return new CasillaPlanoCartesiano(coordenadaX - 1,coordenadaY, direccion);
		}
		return null;
	}

	@Override
	public Casilla girarIzquierda() {
		if(direccion == Direccion.NORTE){
			return new CasillaPlanoCartesiano(coordenadaX, coordenadaY, Direccion.OESTE);
		}
		else if(direccion == Direccion.OESTE){
			return new CasillaPlanoCartesiano(coordenadaX, coordenadaY, Direccion.SUR);
		}
		else if(direccion == Direccion.SUR){
			return new CasillaPlanoCartesiano(coordenadaX,coordenadaY, Direccion.ESTE);
		}
		else if(direccion == Direccion.ESTE){
			return new CasillaPlanoCartesiano(coordenadaX, coordenadaY, Direccion.NORTE);
		}
		return null;
	}

	@Override
	public Casilla girarDerecha() {
		if(direccion == Direccion.NORTE){
			return new CasillaPlanoCartesiano(coordenadaX, coordenadaY, Direccion.ESTE);
		}
		else if(direccion == Direccion.OESTE){
			return new CasillaPlanoCartesiano(coordenadaX, coordenadaY, Direccion.NORTE);
		}
		else if(direccion == Direccion.SUR){
			return new CasillaPlanoCartesiano(coordenadaX,coordenadaY, Direccion.OESTE);
		}
		else if(direccion == Direccion.ESTE){
			return new CasillaPlanoCartesiano(coordenadaX, coordenadaY, Direccion.SUR);
		}
		return null;
	}

	@Override
	public String toString(){
		return "(" + coordenadaX + "," + coordenadaY + ")" + direccion.getDescripcion();
	}
}
