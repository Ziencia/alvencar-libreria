package es.mde.alvencar;

/**
 * Implementación de la interfaz {@link Cliente} que representa a un cliente
 * con sus datos básicos: identificación y contacto.
 * 
 * <p>Esta clase se puede reutilizar en diferentes contextos del sistema sin acoplarse
 * a tecnologías de persistencia como JPA.</p>
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
     * Constructor sin argumentos. Requerido para frameworks de serialización.
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

    /** {@inheritDoc} */
    @Override
    public String getCif() {
        return cif;
    }

    /** {@inheritDoc} */
    @Override
    public void setCif(String cif) {
        this.cif = cif;
    }

    /** {@inheritDoc} */
    @Override
    public String getNombre() {
        return nombre;
    }

    /** {@inheritDoc} */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** {@inheritDoc} */
    @Override
    public String getPrimerApellido() {
        return primerApellido;
    }

    /** {@inheritDoc} */
    @Override
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /** {@inheritDoc} */
    @Override
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /** {@inheritDoc} */
    @Override
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /** {@inheritDoc} */
    @Override
    public String getDireccion() {
        return direccion;
    }

    /** {@inheritDoc} */
    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /** {@inheritDoc} */
    @Override
    public String getTelefono() {
        return telefono;
    }

    /** {@inheritDoc} */
    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
