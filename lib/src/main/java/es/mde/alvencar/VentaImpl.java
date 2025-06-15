package es.mde.alvencar;

import java.time.LocalDateTime;
/**
 * @author Ziencia
 */
public class VentaImpl extends TransaccionImpl implements Venta {
    private String regimen;
    private LocalDateTime fechaFinGarantia;

    public VentaImpl(){}

    public VentaImpl(String regimen, LocalDateTime fechaFinGarantia) {
        this.regimen = regimen;
        this.fechaFinGarantia = fechaFinGarantia;
    }

    public VentaImpl(float importe, LocalDateTime fechaHoraEntrega, String regimen, LocalDateTime fechaFinGarantia) {
        super(importe, fechaHoraEntrega);
        this.regimen = regimen;
        this.fechaFinGarantia = fechaFinGarantia;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public LocalDateTime getFechaFinGarantia() {
        return fechaFinGarantia;
    }

    public void setFechaFinGarantia(LocalDateTime fechaFinGarantia) {
        this.fechaFinGarantia = fechaFinGarantia;
    }

}
