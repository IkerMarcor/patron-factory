package main.java;

public class CafeMochaFactory implements ICafeFactory{
    @Override
    public ICafe crearCafe() { return new CafeMocha(); }
}