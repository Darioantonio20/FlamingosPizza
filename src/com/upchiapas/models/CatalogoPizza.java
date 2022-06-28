package com.upchiapas.models;

public class CatalogoPizza {
    Pizza catalogo[] = new Pizza[5];



    public Pizza[] getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Pizza[] catalogo) {

        this.catalogo = catalogo;
    }

    public void llenarCatalogo(){
        this.catalogo[0] = new Pizza(1,"Hawaiana",120);
        this.catalogo[1] = new Pizza(2,"Peperoni Especial",170);
        this.catalogo[2] = new Pizza(3,"Deluxe",160);
        this.catalogo[3] = new Pizza(4,"Veggie",200);
        this.catalogo[4] = new Pizza(5,"Champinon",250);

    }
}
