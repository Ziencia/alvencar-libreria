package es.mde.alvencar;

/**
 * Interfaz que representa una oferta económica asociada a un vehículo,
 * indicando los importes disponibles tanto para la venta como para el alquiler.
 * 
 * @author Ziencia
 */
public interface Oferta {

    /**
     * Devuelve el importe propuesto para la venta del vehículo.
     *
     * @return Importe de venta.
     */
    float getOfertaVenta();

    /**
     * Establece el importe propuesto para la venta del vehículo.
     *
     * @param ofertaVenta Importe de venta.
     */
    void setOfertaVenta(float ofertaVenta);

    /**
     * Devuelve el importe propuesto para el alquiler del vehículo.
     *
     * @return Importe de alquiler.
     */
    float getOfertaAlquiler();

    /**
     * Establece el importe propuesto para el alquiler del vehículo.
     *
     * @param ofertaAlquiler Importe de alquiler.
     */
    void setOfertaAlquiler(float ofertaAlquiler);
}
