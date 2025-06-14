package es.mde.alvencar;

public class OfertaImpl implements Oferta {
    private float ofertaVenta;
    private float ofertaAlquiler;
    private Vehiculo vehiculo;

    public OfertaImpl() {}

    public OfertaImpl(float ofertaVenta, float ofertaAlquiler, Vehiculo vehiculo) {
        this.ofertaVenta = ofertaVenta;
        this.ofertaAlquiler = ofertaAlquiler;
        this.vehiculo = vehiculo;
    }

    @Override
    public float getOfertaVenta() {
        return ofertaVenta;
    }
    @Override
    public void setOfertaVenta(float ofertaVenta) {
        this.ofertaVenta = ofertaVenta;
    }

    @Override
    public float getOfertaAlquiler() {
        return ofertaAlquiler;
    }
    @Override
    public void setOfertaAlquiler(float ofertaAlquiler) {
        this.ofertaAlquiler = ofertaAlquiler;
    }

    @Override
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    @Override
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}