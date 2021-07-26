package co.edu.utp.misiontic2022.c2.sansoris.ArchivoTexto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GestorAOPersona {
    public void guardarPersonas(String archivo, List<ArchivoObjeto> personas) {
        //Gestor con archivo de objeto que guarde las personasl
        try {
        var oos = new ObjectOutputStream(new FileOutputStream(archivo));
        //recorrido de los elementos aplicando el metodo 
        for(ArchivoObjeto persona : personas){
            oos.writeObject(persona);
        }
        //flujo cerrado
        oos.close();

        }catch (IOException e){
            System.err.println(e);
    }
}

    public List<ArchivoObjeto> cargarPersonas (String archivo){
        List<ArchivoObjeto> personas = new ArrayList<>();
        ArchivoObjeto persona;
        try {
            ObjectInputStream ois = new  ObjectInputStream(new FileInputStream(archivo));
            while ((persona = (ArchivoObjeto) ois.readObject())!= null){ 
                personas.add(persona);
            }
            ois.close();
    
        }catch (IOException | ClassNotFoundException e){
            System.err.println(e);
        } return personas;
        
    }
}
