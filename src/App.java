package src;

public class App {
    public static void main(String[] args) throws Exception {
   
        // A partir de Metflix buscar la temporada 5 episodio 1 Serie "How I met your mother"
        //Reproducir el episodio

        Metflix miMetflix = new Metflix();

        System.out.println("Inicializando catálogo de Metflix");

        miMetflix.inicializarCatalogo(); //Llamo al método que crea las pelis y series

        /*Serie serieBuscada = miMetflix.buscarSerie("Riverdale");
    
        if (serieBuscada == null){
            System.out.println("Serie no existe");
            return;
        }

        Temporada temporada = serieBuscada.buscarTemporada(2);

        Episodio episodio = temporada.buscarEpisodio(16);

        episodio.reproducir();*/

        Pelicula peliBuscada = miMetflix.buscarPeli("Titanic");

        if (peliBuscada == null){
            System.out.println("Pelicula no existe");
            return;
        }

        peliBuscada.reproducir();





    }
}
