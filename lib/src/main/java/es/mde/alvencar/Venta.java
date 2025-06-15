package es.mde.alvencar;

import java.time.LocalDateTime;

/**
 * Interfaz que define los datos específicos asociados a una transacción de venta
 * de un vehículo, incluyendo el régimen de la venta y la fecha de finalización de la garantía.
 * 
 * Esta interfaz permite acceder y modificar los atributos propios de una venta.
 * 
 * @author Ziencia
 */
public interface Venta {

    /**
     * Devuelve el régimen de la venta (por ejemplo, contado o financiado).
     *
     * @return Régimen de la venta.
     */
    String getRegimen();

    /**
     * Establece el régimen de la venta.
     *
     * @param regimen Régimen de la venta.
     */
    void setRegimen(String regimen);

    /**
     * Devuelve la fecha de finalización de la garantía ofrecida con la venta.
     *
     * @return Fecha fin de garantía.
     */
    LocalDateTime getFechaFinGarantia();

    /**
     * Establece la fecha de finalización de la garantía.
     *
     * @param fechaFinGarantia Fecha fin de garantía.
     */
    void setFechaFinGarantia(LocalDateTime fechaFinGarantia);
}
