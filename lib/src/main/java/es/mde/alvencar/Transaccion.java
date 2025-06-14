package es.mde.alvencar;

import java.time.LocalDateTime;

public interface Transaccion {

    float getImporte();
    void setImporte(float importe);
    LocalDateTime getFechaHoraEntrega();
    void setFechaHoraEntrega(LocalDateTime fechaHoraEntrega);
}
