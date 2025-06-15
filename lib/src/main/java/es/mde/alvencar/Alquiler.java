package es.mde.alvencar;

import java.time.LocalDateTime;

/**
 * Interfaz que define los métodos de acceso a los datos específicos
 * de una operación de alquiler de un vehículo.
 * 
 * Un alquiler incluye información sobre fechas, kilometraje y nivel del depósito.
 * 
 * @author Ziencia
 */
public interface Alquiler {

    /**
     * Devuelve la fecha y hora de devolución del vehículo alquilado.
     *
     * @return Fecha y hora de devolución.
     */
    LocalDateTime getFechaHoraDevolucion();

    /**
     * Establece la fecha y hora de devolución del vehículo alquilado.
     *
     * @param fechaHoraDevolucion Fecha y hora de devolución.
     */
    void setFechaHoraDevolucion(LocalDateTime fechaHoraDevolucion);

    /**
     * Devuelve el kilometraje del vehículo antes del inicio del alquiler.
     *
     * @return Kilometraje inicial.
     */
    float getKmAntes();

    /**
     * Establece el kilometraje del vehículo antes del inicio del alquiler.
     *
     * @param kmAntes Kilometraje inicial.
     */
    void setKmAntes(float kmAntes);

    /**
     * Devuelve el kilometraje del vehículo después de finalizar el alquiler.
     *
     * @return Kilometraje final.
     */
    float getKmDespues();

    /**
     * Establece el kilometraje del vehículo después de finalizar el alquiler.
     *
     * @param kmDespues Kilometraje final.
     */
    void setKmDespues(float kmDespues);

    /**
     * Devuelve el estado del depósito de combustible antes del alquiler.
     *
     * @return Estado inicial del depósito.
     */
    String getDepositoAntes();

    /**
     * Establece el estado del depósito de combustible antes del alquiler.
     *
     * @param depositoAntes Estado inicial del depósito.
     */
    void setDepositoAntes(String depositoAntes);

    /**
     * Devuelve el estado del depósito de combustible después del alquiler.
     *
     * @return Estado final del depósito.
     */
    String getDepositoDespues();

    /**
     * Establece el estado del depósito de combustible después del alquiler.
     *
     * @param depositoDespues Estado final del depósito.
     */
    void setDepositoDespues(String depositoDespues);
}
