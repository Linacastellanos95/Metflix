package src;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    public List<Temporada> temporadas = new ArrayList<>();
    
    public Temporada buscarTemporada(int numeroTemporada){
        for (Temporada temporada: this.temporadas){
            if(temporada.numero == numeroTemporada){
                return temporada;
            }
        }
            return null;
        
    }
    
    
}
