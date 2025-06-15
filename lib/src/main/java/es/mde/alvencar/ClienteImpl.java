package es.mde.alvencar;

/**
 * Implementación de la interfaz que representa a un cliente
 * con sus datos básicos: identificación y contacto.
 * 
 * 
 * @author Ziencia
 */
public class ClienteImpl implements Cliente {
    private String cif;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String direccion;
    private String telefono;

    /**
     * Constructor sin argumentos. Requerido para frameworks 
     */
    public ClienteImpl() {}

    /**
     * Constructor con todos los campos.
     * 
     * @param cif              el CIF del cliente
     * @param nombre           el nombre del cliente
     * @param primerApellido   el primer apellido
     * @param segundoApellido  el segundo apellido
     * @param direccion        la dirección
     * @param telefono         el número de teléfono
     */
    public ClienteImpl(String cif, String nombre, String primerApellido, String segundoApellido,
                       String direccion, String telefono) {
        this.cif = cif;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String getCif() {
        return cif;
    }

    @Override
    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getPrimerApellido() {
        return primerApellido;
    }

    @Override
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Override
    public String getSegundoApellido() {
        return segundoApellido;
    }

    @Override
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
