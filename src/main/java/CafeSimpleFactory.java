package main.java;

public class CafeSimpleFactory implements ICafeFactory{
    @Override
    public ICafe crearCafe() { return new CafeSimple(); }
}