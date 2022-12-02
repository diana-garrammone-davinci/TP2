import java.util.ArrayList;

public class Llave extends EtapaMundial {

	private ArrayList<Equipo> equiposQueAvanzan;

	public Llave() {
		super();
	}

	@Override
	public ArrayList<Equipo> getEquiposQueAvanzan(){
		return equiposQueAvanzan;
	}
	
	

}
