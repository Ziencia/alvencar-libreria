package es.mde.alvencar;

import java.time.LocalDateTime;

/**
 * Interfaz que define la estructura y comportamiento básico de una factura
 * generada por una operación de alquiler o venta de un vehículo.
 * Incluye detalles fiscales, de periodo, importes y datos del cliente y vehículo.
 * 
 * @author Ziencia
 */
public interface Factura {

    /**
     * Devuelve la fecha de inicio del periodo de alquiler.
     *
     * @return Fecha y hora de inicio.
     */
    LocalDateTime getFechaInicioAlquiler();

    /**
     * Establece la fecha de inicio del periodo de alquiler.
     *
     * @param fechaInicioAlquiler Fecha y hora de inicio.
     */
    void setFechaInicioAlquiler(LocalDateTime fechaInicioAlquiler);

    /**
     * Devuelve la fecha de fin del periodo de alquiler.
     *
     * @return Fecha y hora de fin.
     */
    LocalDateTime getFechaFinAlquiler();

    /**
     * Establece la fecha de fin del periodo de alquiler.
     *
     * @param fechaFinAlquiler Fecha y hora de fin.
     */
    void setFechaFinAlquiler(LocalDateTime fechaFinAlquiler);

    /**
     * Devuelve el número total de días de alquiler.
     *
     * @return Días de alquiler.
     */
    int getNumeroDiasAlquiler();

    /**
     * Establece el número total de días de alquiler.
     *
     * @param numeroDiasAlquiler Días de alquiler.
     */
    void setNumeroDiasAlquiler(int numeroDiasAlquiler);

    /**
     * Devuelve el importe total correspondiente al número de días.
     *
     * @return Importe por días.
     */
    float getImporteTotalDias();

    /**
     * Establece el importe total correspondiente al número de días.
     *
     * @param importeTotalDias Importe por días.
     */
    void setImporteTotalDias(float importeTotalDias);

    /**
     * Devuelve el importe correspondiente a kilómetros adicionales.
     *
     * @return Importe por km extra.
     */
    float getImporteKmExtra();

    /**
     * Establece el importe correspondiente a kilómetros adicionales.
     *
     * @param importeKmExtra Importe por km extra.
     */
    void setImporteKmExtra(float importeKmExtra);

    /**
     * Devuelve el importe correspondiente a penalizaciones por depósito.
     *
     * @return Importe por penalización.
     */
    float getImportePenalizacionDeposito();

    /**
     * Establece el importe correspondiente a penalizaciones por depósito.
     *
     * @param importePenalizacionDeposito Importe por penalización.
     */
    void setImportePenalizacionDeposito(float importePenalizacionDeposito);

    /**
     * Devuelve el concepto general de la factura.
     *
     * @return Descripción del concepto.
     */
    String getConceptoFactura();

    /**
     * Establece el concepto general de la factura.
     *
     * @param conceptoFactura Descripción del concepto.
     */
    void setConceptoFactura(String conceptoFactura);

    /**
     * Devuelve los datos del cliente: nombre, apellidos y DNI.
     *
     * @return Datos del cliente.
     */
    String getNombreApellidosDNI();

    /**
     * Establece los datos del cliente: nombre, apellidos y DNI.
     *
     * @param nombreApellidosDNI Datos del cliente.
     */
    void setNombreApellidosDNI(String nombreApellidosDNI);

    /**
     * Devuelve la dirección y localización del cliente.
     *
     * @return Dirección del cliente.
     */
    String getDatosDireccionLocalizacion();

    /**
     * Establece la dirección y localización del cliente.
     *
     * @param datosDireccionLocalizacion Dirección del cliente.
     */
    void setDatosDireccionLocalizacion(String datosDireccionLocalizacion);

    /**
     * Devuelve la descripción del vehículo relacionado con la factura.
     *
     * @return Datos del vehículo.
     */
    String getDatosVehiculo();

    /**
     * Establece la descripción del vehículo relacionado con la factura.
     *
     * @param datosVehiculo Datos del vehículo.
     */
    void setDatosVehiculo(String datosVehiculo);

    /**
     * Devuelve el importe base de la factura, sin impuestos.
     *
     * @return Importe neto.
     */
    float getImporte();

    /**
     * Establece el importe base de la factura, sin impuestos.
     *
     * @param importe Importe neto.
     */
    void setImporte(float importe);

    /**
     * Devuelve el importe total de la factura, incluyendo impuestos.
     *
     * @return Importe total.
     */
    float getImporteTotal();

    /**
     * Establece el importe total de la factura, incluyendo impuestos.
     *
     * @param importeTotal Importe total.
     */
    void setImporteTotal(float importeTotal);

    /**
     * Devuelve el importe correspondiente a impuestos aplicados.
     *
     * @return Importe de impuestos.
     */
    float getImpuestos();

    /**
     * Establece el importe correspondiente a impuestos aplicados.
     *
     * @param impuestos Importe de impuestos.
     */
    void setImpuestos(float impuestos);

    /**
     * Devuelve la fecha de emisión de la factura.
     *
     * @return Fecha de la factura.
     */
    LocalDateTime getFechaFactura();

    /**
     * Establece la fecha de emisión de la factura.
     *
     * @param fechaFactura Fecha de la factura.
     */
    void setFechaFactura(LocalDateTime fechaFactura);

    /**
     * Indica si la factura ha sido pagada o no.
     *
     * @return true si está pagada, false si no.
     */
    boolean isEstaPagada();

    /**
     * Establece si la factura está pagada.
     *
     * @param estaPagada true si está pagada, false si no.
     */
    void setEstaPagada(boolean estaPagada);

    /**
     * Establece el tipo de factura: venta, alquiler, u otro.
     *
     * @param tipoFactura Código de tipo.
     */
    void setTipoFactura(int tipoFactura);

    /**
     * Devuelve el tipo de factura.
     *
     * @return Código de tipo.
     */
    int getTipoFactura();

}