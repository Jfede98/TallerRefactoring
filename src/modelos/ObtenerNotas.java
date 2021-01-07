/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Tommy
 */
public class ObtenerNotas {
    Estudiante e;
    public Notas notas;
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNotaInicial(Notas notas){
        double notaInicial=0;
        for(Paralelo par:e.getParalelos()){
            if(notas.pa.equals(par)){
                notaInicial=calcularNota(notas.getNexamen(),notas.getNdeberes(),notas.getNlecc(),notas.getNtalleres());
            }
        }
        return notaInicial;
    }
    
    //Calcula y devuelve la nota final contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    
    public double CalcularNotaFinal(Notas notas){
        double notaFinal=0;
        for(Paralelo par:e.getParalelos()){
            if(notas.pa.equals(par)){
                notaFinal=calcularNota(notas.getNexamen(),notas.getNdeberes(),notas.getNlecc(),notas.getNtalleres());
            }
        }
        return notaFinal;
    }
    public double calcularNota(double nexamen,double ndeberes, double nlecciones,double ntalleres){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                return notaTeorico+notaPractico;
    }
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        double notaTotal=0;
        for(Paralelo par:e.getParalelos()){
            if(p.equals(par)){
                notaTotal=(p.getMateria().notaInicial+p.getMateria().notaFinal)/2;
                
            }
        }
        return notaTotal;
        
    }
}
