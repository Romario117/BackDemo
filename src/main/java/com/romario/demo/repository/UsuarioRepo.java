package com.romario.demo.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.romario.demo.entities.UsuarioEntity;

@Component
public class UsuarioRepo {
    @SuppressWarnings("deprecation")
	public List<UsuarioEntity> getDataJson() {
        List<UsuarioEntity> usu = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("src/main/resources/DemoUsuarios.txt");
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {

                String[] datos = linea.split(";");
                usu.add(new UsuarioEntity(Integer.valueOf(datos[0]),datos[1],datos[2],datos[3],datos[4],datos[5],datos[6],datos[7],
                        new Date(String.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(datos[8])))
                        , new Date(String.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(datos[9])))
                        ,datos[10],datos[11]));
            }

        } catch (IOException | ParseException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }

        }
        return usu;
    }
    
}
