package main.java;

public class CafeConCarameloFactory implements ICafeFactory{
    @Override
    public ICafe crearCafe() { return new CafeConCaramelo(); }
}
