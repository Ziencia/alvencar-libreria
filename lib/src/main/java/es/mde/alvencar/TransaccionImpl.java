package es.mde.alvencar;

import java.time.LocalDateTime;
/**
 * @author Ziencia
 */
public class TransaccionImpl implements Transaccion {

    private float importe;
    private LocalDateTime fechaHoraEntrega;

    public TransaccionImpl(){}

    public TransaccionImpl(float importe, LocalDateTime fechaHoraEntrega) {
        this.importe = importe;
        this.fechaHoraEntrega = fechaHoraEntrega;
    }

    public float getImporte() {
        return importe;
    }
    public void setImporte(float importe) {
        this.importe = importe;
    }

    public LocalDateTime getFechaHoraEntrega() {
        return fechaHoraEntrega;
    }
    public void setFechaHoraEntrega(LocalDateTime fechaHoraEntrega) {
        this.fechaHoraEntrega = fechaHoraEntrega;
    }
}
