package es.mde.alvencar;

import java.time.LocalDate;

public class VehiculoImpl implements Vehiculo {

    private String matricula;
    private String bastidor;
    private String marca;
    private String modelo;
    private String color;
    private LocalDate fechaMatriculacion;
    private String condicionAdquisicion;
    private boolean vendido;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }

    public String getCondicionAdquisicion() {
        return condicionAdquisicion;
    }

    public void setCondicionAdquisicion(String condicionAdquisicion) {
        this.condicionAdquisicion = condicionAdquisicion;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
}
