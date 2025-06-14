package es.mde.alvencar;

import java.time.LocalDate;

public interface Vehiculo {
   
    String getMatricula();
    public void setMatricula(String matricula);

    public String getBastidor();
    public void setBastidor(String bastidor);

    public String getMarca();
    public void setMarca(String marca);

    public String getModelo();

    public void setModelo(String modelo);

    public String getColor();

    public void setColor(String color);

    public LocalDate getFechaMatriculacion();
    public void setFechaMatriculacion(LocalDate fechaMatriculacion);

    public String getCondicionAdquisicion();
    public void setCondicionAdquisicion(String condicionAdquisicion);

    public boolean isVendido();
    public void setVendido(boolean vendido);
}