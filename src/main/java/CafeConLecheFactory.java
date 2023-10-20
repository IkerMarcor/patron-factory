package main.java;

public class CafeConLecheFactory implements ICafeFactory{
    @Override
    public ICafe crearCafe() { return new CafeConLeche(); }
}