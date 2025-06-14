package es.mde.alvencar;

import java.time.LocalDateTime;

public interface Factura {

    LocalDateTime getFechaInicioAlquiler();

    void setFechaInicioAlquiler(LocalDateTime fechaInicioAlquiler);

    LocalDateTime getFechaFinAlquiler();

    void setFechaFinAlquiler(LocalDateTime fechaFinAlquiler);

    int getNumeroDiasAlquiler();

    void setNumeroDiasAlquiler(int numeroDiasAlquiler);

    float getImporteTotalDias();

    void setImporteTotalDias(float importeTotalDias);

    float getImporteKmExtra();

    void setImporteKmExtra(float importeKmExtra);

    float getImportePenalizacionDeposito();

    void setImportePenalizacionDeposito(float importePenalizacionDeposito);

    String getConceptoFactura();

    void setConceptoFactura(String conceptoFactura);

    String getNombreApellidosDNI();

    void setNombreApellidosDNI(String nombreApellidosDNI);

    String getDatosDireccionLocalizacion();

    void setDatosDireccionLocalizacion(String datosDireccionLocalizacion);

    String getDatosVehiculo();

    void setDatosVehiculo(String datosVehiculo);

    float getImporte();

    void setImporte(float importe);

    float getImporteTotal();

    void setImporteTotal(float importeTotal);

    float getImpuestos();

    void setImpuestos(float impuestos);

    LocalDateTime getFechaFactura();

    void setFechaFactura(LocalDateTime fechaFactura);

    boolean isEstaPagada();

    void setEstaPagada(boolean estaPagada);

    void setTipoFactura(int tipoFactura);

    int getTipoFactura();

}