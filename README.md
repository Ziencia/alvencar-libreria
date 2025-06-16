# Libreria del Proyecto Alvencar

## Descripción
La libreria de Alvencar, desarrollada en Java, ha sido diseñada para la gestión de la venta y alquiler de una flota de coches. Ofrece una estructura completa, independiente de JPA e integrable. 

## Características Principales
- Gestión de clientes
- Gestión de vehículos
- Posibilidad de establecer ofertas para los vehiculos
- Las operaciones se agrupan en una clase generica denominada transacciones
- Las transacciones pueden ser del tipo alquiler o del tipo venta cada una con sus particularidades
- Gestion de alquileres
- Gestión de ventas
- Gestión de facturas

## Estructura del Proyecto
```
es.mde.alvencar
├── Cliente (Interfaz ..)
│   └── ClienteImpl (Implementación ..)
├── Vehiculo
│   └── VehiculoImpl
├── Oferta
│   └── OfertaImpl
├── Transaccion  
│   └── TransaccionImpl
        ├── Venta
            └── VentaImpl
        ├── Alquiler
            └── AlquilerImpl
├── Factura
│   └── FacturaImpl
```
## Javadoc
https://ziencia.github.io/alvencar-libreria/lib

## Instalación

### Usando JitPack
Para usar esta librería en tu proyecto, añadir el repositorio de JitPack al archivo `build.gradle`:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```

Luego, añadir la dependencia:

```gradle
dependencies {
    implementation ''com.github.Ziencia:alvencar-libreria:v0.1.9''
}
```

### Requisitos persistencia
1. **Separacion de responsabilidades**: La libreria se centra exclusivamente en la estructura de datos y lógica de negocio. Si se quire gestionar persistencia y acceso de datos ser hara de forma independiente JPA, Hibernate, etc.
2. **Modularidad y reutilización**: no se han introducido dependencias innecesarias a frameworks concretos.
3. **Reducción de dependencias transversales**: permite mantener la libreria lo más ligera y desacoplada posible.

## Requisitos
- Java 8 o superior
- Gradle 7.0 o superior 