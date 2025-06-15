package es.mde.alvencar;

import java.time.LocalDateTime;

/**
 * @author Ziencia
 */
public class FacturaImpl implements Factura {

    private String conceptoFactura;
    private String nombreApellidosDNI;
    private String datosDireccionLocalizacion;
    private String datosVehiculo;
    private float importe;
    private float importeTotal;
    private float impuestos;
    private LocalDateTime fechaFactura;
    private boolean estaPagada;
    private int tipoFactura;
    private LocalDateTime fechaInicioAlquiler;
    private LocalDateTime fechaFinAlquiler;
    private int numeroDiasAlquiler;
    private float importeTotalDias;
    private float importeKmExtra;
    private float importePenalizacionDeposito;

    public FacturaImpl() {
    }

    public FacturaImpl(String conceptoFactura, String nombreApellidosDNI, String datosDireccionLocalizacion,
            String datosVehiculo, float importe, float importeTotal, float impuestos, LocalDateTime fechaFactura,
            boolean estaPagada, int tipoFactura, LocalDateTime fechaInicioAlquiler, LocalDateTime fechaFinAlquiler,
            int numeroDiasAlquiler, float importeTotalDias, float importeKmExtra, float importePenalizacionDeposito) {
        this.conceptoFactura = conceptoFactura;
        this.nombreApellidosDNI = nombreApellidosDNI;
        this.datosDireccionLocalizacion = datosDireccionLocalizacion;
        this.datosVehiculo = datosVehiculo;
        this.importe = importe;
        this.importeTotal = importeTotal;
        this.impuestos = impuestos;
        this.fechaFactura = fechaFactura;
        this.estaPagada = estaPagada;
        this.tipoFactura = tipoFactura;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.fechaFinAlquiler = fechaFinAlquiler;
        this.numeroDiasAlquiler = numeroDiasAlquiler;
        this.importeTotalDias = importeTotalDias;
        this.importeKmExtra = importeKmExtra;
        this.importePenalizacionDeposito = importePenalizacionDeposito;
    }

    @Override
    public LocalDateTime getFechaInicioAlquiler() {
        return fechaInicioAlquiler;
    }

    @Override
    public void setFechaInicioAlquiler(LocalDateTime fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    @Override
    public LocalDateTime getFechaFinAlquiler() {
        return fechaFinAlquiler;
    }

    @Override
    public void setFechaFinAlquiler(LocalDateTime fechaFinAlquiler) {
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    @Override
    public int getNumeroDiasAlquiler() {
        return numeroDiasAlquiler;
    }

    @Override
    public void setNumeroDiasAlquiler(int numeroDiasAlquiler) {
        this.numeroDiasAlquiler = numeroDiasAlquiler;
    }

    @Override
    public float getImporteTotalDias() {
        return importeTotalDias;
    }

    @Override
    public void setImporteTotalDias(float importeTotalDias) {
        this.importeTotalDias = importeTotalDias;
    }

    @Override
    public float getImporteKmExtra() {
        return importeKmExtra;
    }

    @Override
    public void setImporteKmExtra(float importeKmExtra) {
        this.importeKmExtra = importeKmExtra;
    }

    @Override
    public float getImportePenalizacionDeposito() {
        return importePenalizacionDeposito;
    }

    @Override
    public void setImportePenalizacionDeposito(float importePenalizacionDeposito) {
        this.importePenalizacionDeposito = importePenalizacionDeposito;
    }

    @Override
    public String getConceptoFactura() {
        return conceptoFactura;
    }

    @Override
    public void setConceptoFactura(String conceptoFactura) {
        this.conceptoFactura = conceptoFactura;
    }

    @Override
    public String getNombreApellidosDNI() {
        return nombreApellidosDNI;
    }

    @Override
    public void setNombreApellidosDNI(String nombreApellidosDNI) {
        this.nombreApellidosDNI = nombreApellidosDNI;
    }

    @Override
    public String getDatosDireccionLocalizacion() {
        return datosDireccionLocalizacion;
    }

    @Override
    public void setDatosDireccionLocalizacion(String datosDireccionLocalizacion) {
        this.datosDireccionLocalizacion = datosDireccionLocalizacion;
    }

    @Override
    public String getDatosVehiculo() {
        return datosVehiculo;
    }

    @Override
    public void setDatosVehiculo(String datosVehiculo) {
        this.datosVehiculo = datosVehiculo;
    }

    @Override
    public float getImporte() {
        return importe;
    }

    @Override
    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public float getImporteTotal() {
        return importeTotal;
    }

    @Override
    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public float getImpuestos() {
        return impuestos;
    }

    @Override
    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    @Override
    public LocalDateTime getFechaFactura() {
        return fechaFactura;
    }

    @Override
    public void setFechaFactura(LocalDateTime fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    @Override
    public boolean isEstaPagada() {
        return estaPagada;
    }

    @Override
    public void setEstaPagada(boolean estaPagada) {
        this.estaPagada = estaPagada;
    }

    @Override
    public void setTipoFactura (int tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    @Override
    public int getTipoFactura () {
        return tipoFactura;
    }
}
