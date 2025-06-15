package es.mde.alvencar;

import java.time.LocalDateTime;

/**
 * Interfaz que representa una transacción genérica realizada sobre un vehículo,
 * incluyendo el importe y la fecha/hora de entrega.
 * 
 * Esta interfaz puede ser implementada por diferentes tipos de transacciones
 * como ventas o alquileres.
 * 
 * @author Ziencia
 */
public interface Transaccion {

    /**
     * Devuelve el importe asociado a la transacción.
     *
     * @return Importe de la transacción.
     */
    float getImporte();

    /**
     * Establece el importe asociado a la transacción.
     *
     * @param importe Importe de la transacción.
     */
    void setImporte(float importe);

    /**
     * Devuelve la fecha y hora en que se realizó la entrega del vehículo.
     *
     * @return Fecha y hora de entrega.
     */
    LocalDateTime getFechaHoraEntrega();

    /**
     * Establece la fecha y hora en que se realizó la entrega del vehículo.
     *
     * @param fechaHoraEntrega Fecha y hora de entrega.
     */
    void setFechaHoraEntrega(LocalDateTime fechaHoraEntrega);
}
