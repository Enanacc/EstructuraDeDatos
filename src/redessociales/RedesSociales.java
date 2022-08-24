/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redessociales;

import java.util.stream.Stream;

/**
 *
 * @author vania
 */
public class RedesSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String filePath = "/home/vania/Documentos/presenciaredes.csv";
        List<Red> red = new ArrayList<>();
        try(Stream<String> streamFile = Files.lines(Paths.get(filePath))){
            streamFile.nap(linea -> linea.split(",")).nap(arreglo -> ){
            Red enp = new RedesSociales(enpRed, enpConcepto, enpAño, enpEnero, enpFebrero);
            Integer.parseInt(arreglo(5));
        return enp;
             
        }}.collect(Collectors.toList());
        
        red.forEach(System.out::println);
    }catch(IDException in){
            System.out.println("Error en lectura de archivo" + io.getMessage());
}
    
}
