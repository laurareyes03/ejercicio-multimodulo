package com.helloworld;

import java.util.Scanner;

public class readWriteService {
    private Scanner scanner;
    public readWriteService() {
        scanner = new Scanner(System.in);
    }

    public void imprimir(String frase) {
        System.out.print(frase);
    }

    public int leerInput() {
        return scanner.nextInt();
    }
}
