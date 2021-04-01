package src;

import java.util.ArrayList;
import java.util.List;

public class Metflix {
    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public void inicializarCatalogo() {
        // Peliculas
        // 1
        Pelicula titanic;
        titanic = new Pelicula();
        titanic.nombre = "Titanic";
        titanic.añoLanzamiento = 1997;
        titanic.duracion = 210; // 3hrs30min

        Actor actor = new Actor();
        actor.nombre = "Leo DiCaprio";
        titanic.actores.add(actor); // agrego a la lista de actores del objeto titanic
        this.peliculas.add(titanic); // Se agraga Titanic al Catalogo peliculas

        // 2
        Pelicula batman = new Pelicula();
        batman.nombre = "Batman: El caballero de la noche";
        batman.añoLanzamiento = 2008;
        batman.duracion = 152;

        // No declaro otra variable actor, voy a rehusar la variable Actor
        actor = new Actor();
        actor.nombre = "Christian Bale";
        batman.actores.add(actor);
        this.peliculas.add(batman);

        //3
        Pelicula milagro = new Pelicula();
        milagro.nombre = "Milagro en la celda 7";
        milagro.añoLanzamiento = 2019;
        milagro.duracion = 132;

        actor = new Actor();
        actor.nombre = "Aras Bulut";
        milagro.actores.add(actor);
        this.peliculas.add(milagro);

        // Series
        // 1
        Serie howImet = new Serie();
        howImet.nombre = "How I met your mother";
        howImet.añoLanzamiento = 2005;

        actor = new Actor();
        actor.nombre = "Neil Patrick Harris";
        howImet.actores.add(actor);

        actor = new Actor();
        actor.nombre = "Cobie Smulders";
        howImet.actores.add(actor);

        // Temporada 1
        Temporada temporada = new Temporada();
        temporada.numero = 5;

        // Episodios
        Episodio episodio = new Episodio();
        episodio.nombre = "The last cigarrette";
        episodio.numero = 11;
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Definitions";
        episodio.numero = 1;
        temporada.episodios.add(episodio);

        // Temporada 2
        temporada = new Temporada();
        temporada.numero = 3;

        // Episodios
        episodio = new Episodio();
        episodio.nombre = "Wait for it";
        episodio.numero = 1;
        temporada.episodios.add(episodio);
         
        episodio = new Episodio();
        episodio.nombre = "Little boys";
        episodio.numero = 4;
        temporada.episodios.add(episodio);
      
        howImet.temporadas.add(temporada); // Agrego la temporada y el episodio, es mejor al final
        this.series.add(howImet);

     //2
        Serie theBigBang = new Serie();
        theBigBang.nombre = "The Big Bang Theory";
        theBigBang.añoLanzamiento = 2007;

        actor = new Actor();
        actor.nombre = "Kaley Cuoco";
        theBigBang.actores.add(actor);

        // Temporada 1
        temporada = new Temporada();
        temporada.numero = 1;

        // Episodios
        episodio = new Episodio();
        episodio.nombre = "Pilot";
        episodio.numero = 1;
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = " The Cooper - Hofstadter Polarizato";
        episodio.numero = 4;
        temporada.episodios.add(episodio);

        theBigBang.temporadas.add(temporada);
        this.series.add(theBigBang);

        //3
        Serie riverdale = new Serie();
        riverdale.nombre = "Riverdale";
        riverdale.añoLanzamiento = 2017;

        actor = new Actor();
        actor.nombre = "Cole Sprouse";
        riverdale.actores.add(actor);

        actor = new Actor();
        actor.nombre = " Lili Reinhart";
        riverdale.actores.add(actor);

        //Temporada1
        temporada = new Temporada();
        temporada.numero = 1;

        //Episodios
        episodio = new Episodio();
        episodio.nombre = "Corrientes traicioneras";
        episodio.numero = 1;
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Las sombras del mal";
        episodio.numero = 2;
        temporada.episodios.add(episodio);

        //Temporada2
        temporada = new Temporada();
        temporada.numero = 2;
        
        //Episodios
        episodio = new Episodio();
        episodio.nombre = "Ojos en el bosque";
        episodio.numero = 3;
        temporada.episodios.add(episodio);

        episodio = new Episodio();
        episodio.nombre = "Colores primarios";
        episodio.numero = 16;
        temporada.episodios.add(episodio);

        riverdale.temporadas.add(temporada);
        this.series.add(riverdale);



    }
        

        //Buscar Serie
        public Serie buscarSerie(String nombreABuscar){
            for (Serie serie : this.series){
                if (serie.nombre.equals(nombreABuscar))
                return serie;
            }
            return null;
        }
        
        //Buscar Pelicula
       public Pelicula buscarPeli(String nombreBuscar){
            for (Pelicula pelicula : this.peliculas){
                if (pelicula.nombre.equals(nombreBuscar))
                return pelicula;
            }
            return null;
        

    



    }

}

