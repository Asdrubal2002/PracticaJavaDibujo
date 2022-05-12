/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JComponent;

/**
 *
 * @author Asdrubal
 */
public class Shapes extends JComponent implements MouseListener, MouseMotionListener {
    
    //figura que se pintara en la pizarra
    private String figura = "Linea";
    
    private LinkedList<Forma> c = new LinkedList<Forma>();
    private LinkedList<Forma> ci = new LinkedList<Forma>();
    private LinkedList<Forma> l = new LinkedList<Forma>();
    private LinkedList<Triangulo> tri = new LinkedList<Triangulo>();
    
    
    private int x,y;
    private int x1,y1,x2,y2,w,h;
    //Activa la figura
    private boolean draw = false;
    
    Shapes(Dimension d){
        setSize(d);
        setPreferredSize(d);
        setVisible(true);
        addMouseListener( this ); 
    	addMouseMotionListener( this ); 
    }
    
    //Selecciona la figura que presiono
     public void selectFigura(String figura)
    {
        this.figura = figura;
    }
     
    public void paint(Graphics g){
        super.paint( g );
        g.drawString( "X,Y: [" + x + "," + y + "] - Figura: " + figura, 10, 20 );
        
        
        if(draw)
        {
            int width = this.x1 - this.x2;
            int height = this.y1 - this.y2;
            w = Math.abs( width );
            h = Math.abs( height );
            x = width < 0 ? x1 : x2;            
            y = height < 0 ? y1 : y2;
            if(figura.equals("Cuadrado"))
                g.drawRect(x, y, w, h);
            else if(figura.equals("Circulo"))
                g.drawOval(x, y, w, h);
            else if(figura.equals("Linea"))
                g.drawLine(x1, y1, x2, y2);
            else if(figura.equals("Triangulo"))            
               g.drawPolygon( new Triangulo(x1,y1,x2,y2) );   
            
        }
       drawCuadrado(g);
       drawCirculo(g);
       drawLinea(g);
       drawTriangulo(g);
    }
    //Pinta el cuadrado
    private void drawCuadrado(Graphics g)
    {
         for(int i=0; i< c.size(); i++)
        {
            Forma tmp = c.get(i);
            g.drawRect( tmp.getX(), tmp.getY() , tmp.getW(), tmp.getH() );   
            
        }
    }  
    //Pinta el circulo
    private void drawCirculo(Graphics g)
    {
        for(int i=0; i< ci.size(); i++)
        {
            Forma tmp = ci.get(i);
            g.drawOval( tmp.getX(), tmp.getY() , tmp.getW(), tmp.getH() );            
        }
    }  
   
    //Pinta la linea
    private void drawLinea(Graphics g)
    {
        for(int i=0; i< l.size(); i++)
        {
            Forma tmp = l.get(i);
            g.drawLine( tmp.getX(), tmp.getY() , tmp.getW(), tmp.getH() );
        }
    }
    //Pinta triangulos
    private void drawTriangulo(Graphics g)
    {
        for(int i=0; i< tri.size(); i++)
        {
            Triangulo tmp = tri.get(i);
            g.drawPolygon( tmp );
        }
    }    
    
    
    @Override
    public void mouseClicked(MouseEvent e) {}
    
    @Override
    public void mousePressed(MouseEvent e) {
        draw = true;
        x1 = e.getX();
        y1 = e.getY();  
        x2=x1;
        y2=y1;
        repaint();
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        draw = false;
        
        
        if(figura.equals("Cuadrado")){
            c.add( new Forma(x,y, w, h) );
            
            agregar(new Nodo());
            
            String p1Cu=Integer.toString(x);
            String p2Cu=Integer.toString(y);
            String p3Cu=Integer.toString(w);
            String p4Cu=Integer.toString(h);
            
            actualizar(obtenerLongitud(),figura,p1Cu,p2Cu,p3Cu,p4Cu);
            
        }else if(figura.equals("Circulo")){
            ci.add( new Forma(x,y, w, h) );
            
            agregar(new Nodo());
            
            String p1C=Integer.toString(x);
            String p2C=Integer.toString(y);
            String p3C=Integer.toString(w);
            String p4C=Integer.toString(h);
            
            actualizar(obtenerLongitud(),figura,p1C,p2C,p3C,p4C);
            
        }else if(figura.equals("Linea")){
            l.add( new Forma(x1,y1,x2,y2));
            
             agregar(new Nodo());
             
             String p1=Integer.toString(x1);
             String p2=Integer.toString(y1);
             String p3=Integer.toString(x2);
             String p4=Integer.toString(y2);
             
             actualizar(obtenerLongitud(),figura,p1,p2,p3,p4);
            
        } else if(figura.equals("Triangulo")){    
           tri.add( new Triangulo(x1,y1,x2,y2));
           
           agregar(new Nodo());
           
           String p1=Integer.toString(x1);
           String p2=Integer.toString(y1);
           String p3=Integer.toString(x2);
           String p4=Integer.toString(y2);
             
           actualizar(obtenerLongitud(),figura,p1,p2,p3,p4);
           
        } 
        repaint();
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    @Override
    public void mouseDragged(MouseEvent e) {        
        x2 = e.getX();
        y2 = e.getY();     
        x = e.getX();
        y = e.getY();       
        repaint();
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();        
        repaint();
    }    
    
     private Nodo cabeza;
     
      public void agregar(Nodo n) {
        //La lista esta vacia
        if (cabeza == null) {
            cabeza = n;
        } else {
            //Buscar el ultimo nodo de la lista
            Nodo sig = cabeza;
            while (sig.siguiente != null) {
                sig = sig.siguiente;
            }
            //Apuntar desde el ultimo nodo al nuevo nodo
            sig.siguiente = n;
        }
        
    }
      
      public int obtenerLongitud() {
        int l = 0;
        Nodo sig = cabeza;
        while (sig != null) {
            l++;
            sig = sig.siguiente;
        }
        return l;
        
    }
      
   //devuelve el nodo que se encuentre en una poisición
    public Nodo obtenerNodo(int posicion) {
        int p = 1;
        Nodo apuntador = cabeza;
        while (apuntador != null && p != posicion) {
            apuntador = apuntador.siguiente;
            p++;
        }
        return apuntador;
    }
    
    public void actualizar(int posicion,String figura,String posX1,String posY1,String posX2,String posY2) {
        Nodo n = obtenerNodo(posicion);
        if (n != null) {
            n.actualizar(figura, posX1, posY1, posX2, posY2);
        }
    }
    
     public boolean guardar(String nombreArchivo) {
        int tn = obtenerLongitud();
        
        if (tn > 0) {
            //Convertir de lista ligada a vector de cadenas de texto
            String[] lineas = new String[tn];
            Nodo apuntador = cabeza;
            int i = 0;
            while (apuntador != null) {
                lineas[i] = (apuntador.figura != null ? apuntador.figura : " ") + "\t"
                          + (apuntador.posX1 != null ? apuntador.posX1 : " ") + "\t"
                          + (apuntador.posY1 != null ? apuntador.posY1 : " ") + "\t"
                          + (apuntador.posX2 != null ? apuntador.posX2 : " ") + "\t"
                          + (apuntador.posY2 != null ? apuntador.posY2 : " ");
                apuntador = apuntador.siguiente;
                i++;
            }
            return Archivo.guardar(nombreArchivo, lineas);
        } else {
            return false;
        }
    }  
     
}

