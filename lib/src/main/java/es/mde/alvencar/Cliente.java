package es.mde.alvencar;

public interface Cliente {
    
    String getCif();
    void setCif(String cif);

    String getNombre();
    void setNombre(String nombre);

    String getPrimerApellido();
    void setPrimerApellido(String primerApellido);

    String getSegundoApellido();
    void setSegundoApellido(String segundoApellido);

    String getDireccion();
    void setDireccion(String direccion);

    String getTelefono();
    void setTelefono(String telefono);
}
