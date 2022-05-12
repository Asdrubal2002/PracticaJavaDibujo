
package app;


public class Nodo {
 
    public String figura;
    public String posX1;
    public String posY1;
    public String posX2;
    public String posY2;
    
    public Nodo siguiente;
    
    public void actualizar(String figura,String posX1,String posY1,String posX2,String posY2){
        this.figura=figura;
        this.posX1=posX1;
        this.posY1=posY1;
        this.posX2=posX2;
        this.posY2=posY2;
    }
    
}
