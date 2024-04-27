package co.edu.uniquindio.parcial2.parcial2.controller;

import co.edu.uniquindio.parcial2.parcial2.modelFactory.ModelFactory;

public class PrestamoObjetoController {
    ModelFactory modelFactory;

    public PrestamoObjetoController() {
        modelFactory = ModelFactory.getInstance();
    }

    public String obtenerObjetosPrestados(String rango) {
        return modelFactory.obtenerObjetosPrestados(rango);
    }

    public String obtenerObjetoPorCodigo(String codigoObjeto) {
        return modelFactory.obtenerObjetoPorCodigo(codigoObjeto);
    }

    public String obtenerClientesConMasPrestamos(String rango) {
        return modelFactory.obtenerClientesConMasPrestamos(rango);
    }
}
