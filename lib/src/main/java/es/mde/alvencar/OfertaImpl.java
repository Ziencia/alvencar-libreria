package es.mde.alvencar;

public class OfertaImpl implements Oferta {
    private float ofertaVenta;
    private float ofertaAlquiler;

    public OfertaImpl() {}

    public OfertaImpl(float ofertaVenta, float ofertaAlquiler) {
        this.ofertaVenta = ofertaVenta;
        this.ofertaAlquiler = ofertaAlquiler;
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
}