package ejercicios;

import java.util.Scanner;

public class ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //utilizando variables fijas como IVA_Producto que sera el iva y es un dato el cual no vamos a tocar,
        //y utilizando una variable la cual rellene el usuario sumaremos las dos una vez se calcule el precio
        //del IVA del producto
        System.out.println("Ingrese el precio neto del producto");
        float precioNeto = (float) sc.nextDouble();
        final float IVA_Producto = (float) (precioNeto * 0.21);
        float precioVenta = (float) (precioNeto + IVA_Producto);
        System.out.println("Precio Neto          "+precioNeto);
        System.out.println("Coste de IVA    +    "+IVA_Producto);
        System.out.println("---------------------");
        System.out.println("Precio final         "+precioVenta);
    }
}

