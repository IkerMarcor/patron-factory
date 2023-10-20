package main.java;

public class Main {
    public static void main(String[] args){
        ICafeFactory factory = new CafeConLecheFactory();
        ICafe cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());

        factory = new CafeMochaFactory();
        cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());

        factory = new CafeSimpleFactory();
        cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());

        factory = new CafeConCarameloFactory();
        cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());
    }
}
