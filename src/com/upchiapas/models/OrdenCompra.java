package com.upchiapas.models;

public class OrdenCompra {

    private byte id;

    ItemCompra productos[];

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public ItemCompra[] getProductos() {
        return productos;
    }

    public void setProductos(ItemCompra[] productos) {
        this.productos = productos;
    }
}
