package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante {
    public ArrayList<Paralelo> paralelos;

    public ArrayList<Paralelo> getParalelos(){
        return paralelos;
    }
    //Los paralelos se añaden/eliminan directamente del Arraylist de paralelos
    public void setParalelos(ArrayList<Paralelo> paralelos){
        this.paralelos=paralelos;
    }

    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
