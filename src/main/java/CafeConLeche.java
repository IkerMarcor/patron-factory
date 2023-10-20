package main.java;

public class CafeConLeche implements ICafe{
    @Override
    public String getDescripcion() { return "Café con leche"; }
    @Override 
    public double getCosto() { return 60; }
}