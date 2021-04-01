package src;

import java.util.ArrayList;
import java.util.List;

public class Temporada  {
    public int numero;
    public String nombre; //Nombre de la temporada
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio buscarEpisodio(int numeroEpisodio){
        for(Episodio episodio: this.episodios){
            if(episodio.numero == numeroEpisodio){
                return episodio;
            }
   
        }
        return null;

  
    }
}

