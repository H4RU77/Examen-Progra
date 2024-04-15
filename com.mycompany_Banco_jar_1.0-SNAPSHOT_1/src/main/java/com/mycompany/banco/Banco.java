/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author harum
 */
public class Banco {
    private ListaSE<Solicitud> solicitudes;
    private ListaSE<Cuenta> cuentas;
/*
    public String consultarLogs(String identificadorCliente) {
        String depositos="";
        String retiros="";
        try {
           
            depositos+="Depósitos:\n";
            BufferedReader depositosReader = new BufferedReader(new FileReader("log_depositos.txt"));
            String lineaDeposito;
            while ((lineaDeposito = depositosReader.readLine()) != null) {
                if (lineaDeposito.contains(identificadorCliente)) {
                    depositos+=lineaDeposito+"\n";
                }
            }
            depositosReader.close();
            
            retiros+="\nRetiros:";
            BufferedReader retirosReader = new BufferedReader(new FileReader("log_retiros.txt"));
            String lineaRetiro;
            while ((lineaRetiro = retirosReader.readLine()) != null) {
                if (lineaRetiro.contains(identificadorCliente)) {
                    retiros+=lineaRetiro+"\n";
                }
            }
            retirosReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String logs=depositos+retiros;
        return logs;
    }
    
      public static void almacenarLogDeposito(String identificadorCliente, String numeroCuenta, double monto, String nombrePersona) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log_depositos.txt", true));
            LocalDateTime now = LocalDateTime.now();
            String fechaHora = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String log = String.format("[%s] Cliente %s depositó %.2f en la cuenta %s (Nombre: %s)\n", fechaHora, identificadorCliente, monto, numeroCuenta, nombrePersona);
            writer.write(log);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
      public static void almacenarLogRetiro(String identificadorCliente, String numeroCuenta, double monto) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("log_retiros.txt", true));
            LocalDateTime now = LocalDateTime.now();
            String fechaHora = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            String log = String.format("[%s] Cliente %s retiró %.2f de la cuenta %s\n", fechaHora, identificadorCliente, monto, numeroCuenta);
            writer.write(log);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/
    public void adicionarCuenta(Cuenta c){
        cuentas.Agregar(c);
    }
    public void eliminarCuenta(int pos){
        cuentas.Eliminar(pos);
    }

    public Banco(ListaSE<Cuenta> cuentas) {

        this.cuentas = cuentas;

    }

    public ListaSE<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ListaSE<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public void setCuentas(ListaSE<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public ListaSE<Cuenta> getCuentas(){
        return cuentas;
    }



    public int VerificarCuenta(String nCuenta) { //regresa indice de la cuenta
        // Buscar si existe una cuenta para la solicitud
        for (int i = 0; i < cuentas.tamanio(); i++)
            if (cuentas.Obtener(i).getNoDeCuenta().equals(nCuenta))
                return i;


        //si no existe la cuenta, crear y agregarla a la lista de cuentas

        return (-1); //posición de la nueva cuenta
    }
    

   
}