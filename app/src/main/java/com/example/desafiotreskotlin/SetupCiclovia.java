package com.example.desafiotreskotlin;

import java.util.ArrayList;
import java.util.List;

public class SetupCiclovias {

    private String[] nombres = {"Ciclovia 1", "Ciclovia 2", "Ciclovia 3", "Ciclovia 4", "Ciclovia 5", "Ciclovia 6", "Ciclovia 7", "Ciclovia 8", "Ciclovia 9", "Ciclovia 10"};
    private String[] comunas = {"Las Condes", "La Reina", "Ã‘uÃ±oa", "Macul", "Providencia", "Las Condes", "La Reina", "Ã‘uÃ±oa", "Macul", "Providencia"};

    public SetupCiclovias() {}

    public ArrayList<Ciclovia> init() {

        List<Ciclovia> lista = new ArrayList<Ciclovia>();

        for (int i = 0; i < 10; i++) {
            Ciclovia ciclovia = new Ciclovia(nombres[i], comunas[i]);
            lista.add(ciclovia);
        }

        return lista;
    }
}