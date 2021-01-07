package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        return prof.info.añosdeTrabajo*600 + prof.info.BonoFijo;
    }  
}
