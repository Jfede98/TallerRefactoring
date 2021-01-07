package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        return prof.getInfo().añosdeTrabajo*600 + prof.getInfo().BonoFijo;
    }  
}
