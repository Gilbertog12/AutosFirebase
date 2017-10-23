package com.example.gilbertogalindo.autosfirebase;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Gilberto Galindo on 23/10/2017.
 */

public class Metodos {
    public static int fotoAleatoria(ArrayList<Integer> fotos){
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotoSeleccionada);
    }

    public static boolean existencia_Auto(ArrayList<Auto> Autos, String Placa){
        for (int i = 0; i <Autos.size() ; i++) {
            if(Autos.get(i).getPlaca().equals(Placa)){
                return true;
            }
        }
        return false;
    }
    public static boolean Auto_editar(ArrayList<Auto> Autos, String cedulaE, String cedulaActual){

        if (!cedulaActual.equals(cedulaE)) {
            if (existencia_Auto(Autos, cedulaE)) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
}
