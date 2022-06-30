package com.upchiapas;

import com.upchiapas.models.CatalogoPizza;
import com.upchiapas.models.ItemCompra;
import com.upchiapas.models.OrdenCompra;
import com.upchiapas.models.Pizza;
import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean index = false;
        int opcion = 0;
        byte opcionCantidad = 0;
        int cantidad = 0;
        String nombre;

        CatalogoPizza catalogoPizza = new CatalogoPizza();

        OrdenCompra ordenCompra = new OrdenCompra();

        ItemCompra itemCompra;
        catalogoPizza.llenarCatalogo();

        ArrayList<ItemCompra> productoList = new ArrayList<ItemCompra>();

        OrdenCompra pedidos[];

        do {

            System.out.println("----------------------------------------------");
            System.out.println("--:Menú de pizza´s de Flamingos en Suchiapa:--");
            System.out.println("----------------------------------------------");
            System.out.println("---| 1.- Catalogo de especialidades|----------");
            System.out.println("----------------------------------------------");
            System.out.println("---| 2.- Ordenar por metodo burbuja|----------");
            System.out.println("----------------------------------------------");
            System.out.println("---| 3.- Reporte de ventas         |----------");
            System.out.println("----------------------------------------------");
            System.out.println("---| 6.- Salir del menú            |----------");
            System.out.println("----------------------------------------------");
            System.out.println("---| Dijita tu opción              |----------\n");
            System.out.println("|Ingresa tu opción|");
            System.out.println("^_^");

                Scanner teclado = new Scanner(System.in);
                opcion = Integer.valueOf(teclado.nextLine());

            switch (opcion) {

                case 1:
                        System.out.println("|------------------------------------------------|");
                        System.out.println("| Usted selecciono el catalogo de especialidades |");
                        System.out.println("| ingresa tu nombre                              |");
                        nombre = teclado.nextLine();
                        System.out.println("|------------------------------------------------|");
                        System.out.println("---| Dijita tu opción |---------------------------");
                        System.out.println("-->");

                        for(int i=0; i<catalogoPizza.getCatalogo().length; i++){
                                    Pizza tuPizza = catalogoPizza.getCatalogo()[i];
                                    System.out.println(  "|"+(i+1)+".-" + "Pizza de: " + tuPizza.getEspecialidad() + " " + "$" + tuPizza.getPrecio());
                        }
                            opcion = Integer.valueOf(teclado.nextLine());

                            do{
                                System.out.println("|----------------------------------------|");
                                System.out.println("| Cuantas pizzas deseas ordenar? |--------");
                                System.out.println("|----------------------------------------|");
                                opcionCantidad = Byte.valueOf(teclado.nextLine());
                              }while(opcionCantidad <= 0 );

                                itemCompra = new ItemCompra(opcionCantidad,catalogoPizza.getCatalogo()[opcion-1],catalogoPizza.getCatalogo()[opcion-1].getPrecio() * opcionCantidad,nombre);
                                productoList.add(itemCompra);

                                break;

                case 2:
                    System.out.println("|-----------------------------------------------------|");
                    System.out.println("| Usted a dijitado ordenar por metodo burbuja|--------");
                    System.out.println("|-----------------------------------------------------|");

                    String[] arreglo = new String[productoList.size()];
                    String elemento = null;

                        for (int x = 0; x < productoList.size(); x++){
                        arreglo[x] = productoList.get(x).getNombre();
                        System.out.println(arreglo[x]);
                    }

                    String aux;
                    for(int i=1; i<=arreglo.length; i++) {
                        for(int j=0; j<arreglo.length-i; j++) {
                            if( arreglo[j].compareTo( arreglo[j+1] ) > 0 ) {
                                aux   = arreglo[j];
                                arreglo[j]  = arreglo[j+1];
                                arreglo[j+1]= aux;
                            }
                        }
                    }
                    System.out.println("|-------------------|");
                    System.out.println("| Pizzas ordenadas  |");
                    System.out.println("|-------------------|");
                    for (int i = 0; i < arreglo.length ;i++){
                        System.out.println(arreglo[i]);
                    }

                    break;

                case 3:
                    System.out.println("|---------------------------------|");
                    System.out.println("| Reporte de Ventas |-------------");
                    System.out.println("|---------------------------------|");
                    float total = 0;
                        for (int x = 0; x < productoList.size(); x++){
                            total = total + productoList.get(x).getSubtotal();
                            System.out.println("Número de la orden que realizó:"+ (x+1)+ " " + " Pizza de especialidad "+ productoList.get(x).getProducto().getEspecialidad()+ " " + " $" + productoList.get(x).getProducto().getPrecio() + "   " + "Número de pizzas ordenadas son " + productoList.get(x).getCantidad() + " Precio total =" + " $" + productoList.get(x).getSubtotal());

                        }

                        total = total / productoList.size();
                        System.out.println("|----------------------------|");
                        System.out.println("|Su promedio de venta es de: |" + total );
                        System.out.println("|----------------------------|");
                    break;
            }
        } while (opcion != 6) ;

        System.out.println("|-----------------------------------------|");
        System.out.println("| Has salido del menú Flamingos::Buen día |");
        System.out.println("|-----------------------------------------|");
    }
}