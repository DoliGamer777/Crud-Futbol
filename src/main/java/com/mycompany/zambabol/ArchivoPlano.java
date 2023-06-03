
package com.mycompany.zambabol;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArchivoPlano {
    
    File archivo = new File("Datos.txt");
    File Partidos = new File("Partidos.txt");
    
    
    public void guardarPartido(String DatosPartido){
    
     try{
        // append 
        FileWriter fw = new FileWriter(Partidos,true);
        // leer (fw)
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);  
        pw.append(DatosPartido);
        pw.close();
        bw.close();
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }// cierre del try
    }
    public void guardar(String DatosEquipo){
        
        try{
        // append 
        FileWriter fw = new FileWriter(archivo,true);
        // leer (fw)
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);  
        pw.append(DatosEquipo);
        pw.close();
        bw.close();
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo");
        }// cierre del try
       
        
    }// cierre del metodo guardar
    
    public ArrayList<Object[]> LeerPartidos(){
        ArrayList <Object[]> datosArchivos = new ArrayList<>();
        try {
            FileReader fr = new FileReader(Partidos);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine())!= null ){
                Object[] LineaDatos = linea.split(";");
                datosArchivos.add(LineaDatos);
            }
            br.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return datosArchivos;}
    
    
    public ArrayList<Object[]> leer(){
        ArrayList <Object[]> datosArchivos = new ArrayList<>();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while ((linea = br.readLine())!= null ){
                Object[] LineaDatos = linea.split(";");
                datosArchivos.add(LineaDatos);
            }
            br.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
        }
        return datosArchivos;}
           
 // eliminarEstudiante
    
    // almacenera el archivo en la arraylis nueva
    public boolean eliminarEquipo(String codigoEquipo){
        
        ArrayList<Object[]> EquiposTodos = this.leer();
        boolean encontrado = false;
        this.vaciarArchivo();
        
        for (Object[] dato : EquiposTodos) {
            
            if (!String.valueOf(dato[0]).equals(codigoEquipo)){
                String fila = String.valueOf(dato[0]+";"
                        +String.valueOf(dato[1])+";"
                        +String.valueOf(dato[2]))+"\n";
                
                this.guardar(fila);
            }//if
            else{
                encontrado = true;
            }// else
        }// for
        return encontrado;
    } // eliminarEquipo
    
    public void vaciarArchivo (){
        
    try{
        // append es importante (escribir)
        FileWriter fw = new FileWriter(archivo);
        // leer se encarga para de transmitir los datos al fw
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);  
        pw.close();
        bw.close();
        
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro al abrir el archivo");
        }// cierre del try   
    }
    
}
