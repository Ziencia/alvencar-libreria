package es.mde.alvencar;

import java.time.LocalDate;

/**
 * Interfaz que representa la información básica de un vehículo gestionado
 * en el sistema, incluyendo su identificación, características y estado de adquisición.
 * 
 * Esta interfaz permite acceder y modificar los atributos relevantes para
 * operaciones como la venta o el alquiler.
 * 
 * @author Ziencia
 */
public interface Vehiculo {

    /**
     * Devuelve la matrícula del vehículo.
     *
     * @return Matrícula del vehículo.
     */
    String getMatricula();

    /**
     * Establece la matrícula del vehículo.
     *
     * @param matricula Matrícula del vehículo.
     */
    void setMatricula(String matricula);

    /**
     * Devuelve el número de bastidor del vehículo.
     *
     * @return Número de bastidor.
     */
    String getBastidor();

    /**
     * Establece el número de bastidor del vehículo.
     *
     * @param bastidor Número de bastidor.
     */
    void setBastidor(String bastidor);

    /**
     * Devuelve la marca del vehículo.
     *
     * @return Marca del vehículo.
     */
    String getMarca();

    /**
     * Establece la marca del vehículo.
     *
     * @param marca Marca del vehículo.
     */
    void setMarca(String marca);

    /**
     * Devuelve el modelo del vehículo.
     *
     * @return Modelo del vehículo.
     */
    String getModelo();

    /**
     * Establece el modelo del vehículo.
     *
     * @param modelo Modelo del vehículo.
     */
    void setModelo(String modelo);

    /**
     * Devuelve el color del vehículo.
     *
     * @return Color del vehículo.
     */
    String getColor();

    /**
     * Establece el color del vehículo.
     *
     * @param color Color del vehículo.
     */
    void setColor(String color);

    /**
     * Devuelve la fecha de matriculación del vehículo.
     *
     * @return Fecha de matriculación.
     */
    LocalDate getFechaMatriculacion();

    /**
     * Establece la fecha de matriculación del vehículo.
     *
     * @param fechaMatriculacion Fecha de matriculación.
     */
    void setFechaMatriculacion(LocalDate fechaMatriculacion);

    /**
     * Devuelve la condición de adquisición del vehículo (por ejemplo, Compra o Leasing).
     *
     * @return Condición de adquisición.
     */
    String getCondicionAdquisicion();

    /**
     * Establece la condición de adquisición del vehículo.
     *
     * @param condicionAdquisicion Condición de adquisición.
     */
    void setCondicionAdquisicion(String condicionAdquisicion);

    /**
     * Indica si el vehículo ha sido vendido.
     *
     * @return true si el vehículo está vendido; false en caso contrario.
     */
    boolean isVendido();

    /**
     * Establece si el vehículo está vendido.
     *
     * @param vendido Estado de venta del vehículo.
     */
    void setVendido(boolean vendido);
}
