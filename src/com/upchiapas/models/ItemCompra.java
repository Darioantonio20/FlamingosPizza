package com.upchiapas.models;

public class ItemCompra {

    private byte cantidad;
    private Pizza producto;
    private float subtotal;

    private String nombre;

    public ItemCompra(byte cantidad, Pizza producto, float subtotal, String nombre) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = subtotal;
        this.nombre = nombre;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public Pizza getProducto() {
        return producto;
    }

    public void setProducto(Pizza producto) {
        this.producto = producto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
