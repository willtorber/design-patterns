package com.willtorber.patterns.creational.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            ConexionDB conexion = ConexionDB.obtenerConexion();
            log.info(conexion.hashCode() + "");
        });

        Thread t2 = new Thread(() -> {
            ConexionDB conexion = ConexionDB.obtenerConexion();
            log.info(conexion.hashCode()+"");
        });

        t1.start();
        t2.start();
        
    }

}
