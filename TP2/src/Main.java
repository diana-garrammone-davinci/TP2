
import java.util.Date;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Equipo argentina = new Equipo("Argentina");
        Equipo mexico = new Equipo("Mexico");
        Equipo polonia = new Equipo("Polonia");
        Equipo arabia = new Equipo("Arabia");

        Partido partido1 = new Partido(new Date(2022, 10, 10), argentina, arabia);
        Partido partido2 = new Partido(new Date(2022, 10, 10), argentina, polonia);

        Resultado rdoPartido1 = new Resultado(2,0);
        Resultado rdoPartido2 = new Resultado(3,2);

        partido1.setResultado(rdoPartido1);
        partido2.setResultado(rdoPartido2);

        Grupo grupoA = new Grupo();


        grupoA.addPartido(partido1);
        grupoA.addPartido(partido2);

        grupoA.addEquipoQueAvanza(argentina);
        System.out.print(argentina.getPuntajeEtapaGrupo());

  

	}

}
