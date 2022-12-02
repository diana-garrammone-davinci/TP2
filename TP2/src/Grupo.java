import java.util.ArrayList;


public class Grupo extends EtapaMundial{

    private ArrayList<Equipo> equiposQueAvanzan;
  
    public Grupo() {
        super();
        this.equiposQueAvanzan = new ArrayList<Equipo>();
    }

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan(){
      
        return equiposQueAvanzan;
    }

}
