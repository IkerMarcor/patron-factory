package main.java;

public class CafeSimple implements ICafe {
    @Override
    public String getDescripcion() { return "Café simple"; }
    @Override 
    public double getCosto() { return 50; }
}