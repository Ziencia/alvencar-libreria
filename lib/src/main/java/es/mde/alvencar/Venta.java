package es.mde.alvencar;

import java.time.LocalDateTime;

public interface Venta {
    String getRegimen();

    void setRegimen(String regimen);

    LocalDateTime getFechaFinGarantia();

    void setFechaFinGarantia(LocalDateTime fechaFinGarantia);
}
