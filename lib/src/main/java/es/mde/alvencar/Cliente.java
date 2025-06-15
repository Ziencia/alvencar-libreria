package es.mde.alvencar;

/**
 * Interfaz que representa un cliente del sistema de gestión de vehículos.
 * Define los métodos de acceso para los atributos básicos de identificación y contacto.
 *  
 * @author Ziencia
 */
public interface Cliente {

    /**
     * Devuelve el CIF (Código de Identificación Fiscal) del cliente.
     *
     * @return el CIF del cliente
     */
    String getCif();

    /**
     * Establece el CIF del cliente.
     *
     * @param cif el nuevo CIF del cliente
     */
    void setCif(String cif);

    /**
     * Devuelve el nombre del cliente.
     *
     * @return el nombre del cliente
     */
    String getNombre();

    /**
     * Establece el nombre del cliente.
     *
     * @param nombre el nuevo nombre del cliente
     */
    void setNombre(String nombre);

    /**
     * Devuelve el primer apellido del cliente.
     *
     * @return el primer apellido
     */
    String getPrimerApellido();

    /**
     * Establece el primer apellido del cliente.
     *
     * @param primerApellido el nuevo primer apellido
     */
    void setPrimerApellido(String primerApellido);

    /**
     * Devuelve el segundo apellido del cliente.
     *
     * @return el segundo apellido
     */
    String getSegundoApellido();

    /**
     * Establece el segundo apellido del cliente.
     *
     * @param segundoApellido el nuevo segundo apellido
     */
    void setSegundoApellido(String segundoApellido);

    /**
     * Devuelve la dirección del cliente.
     *
     * @return la dirección
     */
    String getDireccion();

    /**
     * Establece la dirección del cliente.
     *
     * @param direccion la nueva dirección
     */
    void setDireccion(String direccion);

    /**
     * Devuelve el teléfono de contacto del cliente.
     *
     * @return el número de teléfono
     */
    String getTelefono();

    /**
     * Establece el teléfono de contacto del cliente.
     *
     * @param telefono el nuevo número de teléfono
     */
    void setTelefono(String telefono);
}

