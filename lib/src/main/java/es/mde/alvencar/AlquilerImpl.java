package es.mde.alvencar;

import java.time.LocalDateTime;

public class AlquilerImpl extends TransaccionImpl implements Alquiler {
    private LocalDateTime fechaHoraDevolucion;
    private float kmAntes;
    private float kmDespues;
    private String depositoAntes;
    private String depositoDespues;

    public AlquilerImpl() {

    }

    public AlquilerImpl(LocalDateTime fechaHoraDevolucion, float kmAntes, float kmDespues, String depositoAntes,
            String depositoDespues) {
        this.fechaHoraDevolucion = fechaHoraDevolucion;
        this.kmAntes = kmAntes;
        this.kmDespues = kmDespues;
        this.depositoAntes = depositoAntes;
        this.depositoDespues = depositoDespues;
    }

    public AlquilerImpl(float importe, LocalDateTime fechaHoraEntrega, LocalDateTime fechaHoraDevolucion, float kmAntes,
            float kmDespues, String depositoAntes, String depositoDespues) {
        super(importe, fechaHoraEntrega);
        this.fechaHoraDevolucion = fechaHoraDevolucion;
        this.kmAntes = kmAntes;
        this.kmDespues = kmDespues;
        this.depositoAntes = depositoAntes;
        this.depositoDespues = depositoDespues;
    }

    public LocalDateTime getFechaHoraDevolucion() {
        return fechaHoraDevolucion;
    }

    public void setFechaHoraDevolucion(LocalDateTime fechaHoraDevolucion) {
        this.fechaHoraDevolucion = fechaHoraDevolucion;
    }

    public float getKmAntes() {
        return kmAntes;
    }

    public void setKmAntes(float kmAntes) {
        this.kmAntes = kmAntes;
    }

    public float getKmDespues() {
        return kmDespues;
    }

    public void setKmDespues(float kmDespues) {
        this.kmDespues = kmDespues;
    }

    public String getDepositoAntes() {
        return depositoAntes;
    }

    public void setDepositoAntes(String depositoAntes) {
        this.depositoAntes = depositoAntes;
    }

    public String getDepositoDespues() {
        return depositoDespues;
    }

    public void setDepositoDespues(String depositoDespues) {
        this.depositoDespues = depositoDespues;
    }

}
