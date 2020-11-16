public class Personaje {
    //Elegimos el nombre del Personaje
    private String nombrePersonaje;
    //N�mero de Experiencia acumulada por el personaje 
    private double experienciaAcumulada;
    //Elegimos si el inventario est� lleno o no
    private boolean inventarioLleno;
    /**
     * Creamos a nuestro Personaje y definimos sus variables.
     */
    public Personaje(double experiencia, String nombre) {
        experienciaAcumulada = experiencia;
        nombrePersonaje = nombre;
        inventarioLleno = true;

    }
    /**
     * Invocamos el metodo para saber el nombre del personaje
     */
    public String getNombrePersonaje(){
        return nombrePersonaje;
        
        
    }   
    /**
     * Invocamos e, metodo para obtener la experiencia acumulada en resultado decimal
     */
    public double getExperienciaAcumulada(){
        return experienciaAcumulada;
        
        
    }   
    /**
     * Invocamos el metodo para obtener informaci�m sobre si el escenario est� lleno o no
     */
    public boolean getInventarioLleno(){
        return inventarioLleno;
        
        
    }   
    /**
     * Elegimos un nuevo nombre para nuestro personaje
     */
    public void setNombrePersonaje(String nuevoNombre){
        nombrePersonaje = nuevoNombre;
        
        
    }   
    /**
     * A�adimos Experiencia a la experiencia total
     */
    public double recogerExperencia(double experienciaRecogida){
        return experienciaAcumulada = experienciaAcumulada + experienciaRecogida; 
        
        
    }   
    /**
     * Alternamos entre el inventario lleno o vacio
     */
    public void alternarInventario(){
        inventarioLleno = !inventarioLleno;
        
        
    }   
    /** 
     * Imprimimos en pantalla la infromaci�n de nuestro personaje
     */
    public void informacionPersonaje(){
        if (inventarioLleno) {
            System.out.println("Nombre Personaje:  " +  nombrePersonaje + " |  Experiencia total acumulada:  " + experienciaAcumulada + " | �Inventario Lleno?: " + " si");
        }
        else { 
            System.out.println("Nombre Personaje:  " +  nombrePersonaje + " |  Experiencia total acumulada:  " + experienciaAcumulada + " | �Inventario Lleno?: " + "no");
        
        }   
    }
    /**
     * Imprimimos el resto de detalles
     */
    public String getInformacionPersonaje (){
        String informacionPersonaje = "Nombre Personaje:  " +  nombrePersonaje + " |  Experiencia total acumulada:  " + experienciaAcumulada;
        if (inventarioLleno) {
            informacionPersonaje = informacionPersonaje + " | Tiene el inventario lleno";
        }
        else {
            informacionPersonaje = informacionPersonaje + " | Tiene el inventario vacio";
        }
        return  informacionPersonaje;
    }
        
}