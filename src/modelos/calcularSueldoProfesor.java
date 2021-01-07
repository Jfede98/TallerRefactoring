package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        return prof.getAñosdeTrabajo()*600 + prof.getBonoFijo();
    }  
}
