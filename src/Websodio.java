package src;

public class Websodio extends Episodio {
    public String link;

  //Redefinición
    @Override
      public void reproducir(){
          System.out.println("Reproduciendo websodio del link " + this.link);

      }

      
    
}
