package src;

public class Pelicula extends Contenido {
    public int duracion; // minutos
    public Director director;
    public boolean filmadaImax;

    public void reproducir(){
        System.out.println("Reproduciendo Pelicula " + nombre);
    }

    


}
