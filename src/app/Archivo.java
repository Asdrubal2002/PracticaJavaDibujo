package app;

import java.io.*;

public class Archivo {

    public static boolean guardar(String nombreArchivo, String[] lineas) {
        if (lineas != null) {
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
                for(int i=0;i<lineas.length;i++){
                    //guardar la linea
                    bw.write(lineas[i]);
                    bw.newLine();
                }
                bw.close();
                return true;
            } catch (IOException ex) {
                return false;
            }
        }
        else{
            return false;
        }
    }

}
