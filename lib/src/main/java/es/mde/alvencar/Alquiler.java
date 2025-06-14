package es.mde.alvencar;

import java.time.LocalDateTime;

public interface Alquiler {
    public LocalDateTime getFechaHoraDevolucion();
    public void setFechaHoraDevolucion(LocalDateTime fechaHoraDevolucion);

    public float getKmAntes();
    public void setKmAntes(float kmAntes);

    public float getKmDespues();
    public void setKmDespues(float kmDespues);

    String getDepositoAntes();
    void setDepositoAntes(String depositoAntes);

    String getDepositoDespues();
    void setDepositoDespues(String depositoDespues);
}
