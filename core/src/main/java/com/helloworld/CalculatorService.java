package com.helloworld;

public class CalculatorService {
    private readWriteService consola;
    private BasicOperationsService operaciones;
    private int x;
    private int y;

    public CalculatorService() {
        consola = new readWriteService();
        operaciones = new BasicOperationsService();
    }

    public void runCalculator() {
        while(true) {
            consola.imprimir("Select an operation:\n" +
                    "1. Div\n" +
                    "2. Sum\n" +
                    "3. Mul\n" +
                    "4. Res\n" +
                    "5. Exit\n" +
                    "Option:");

            int option = consola.leerInput();

            if(option < 5) {
                consola.imprimir("Introduce el primer número: ");
                x = consola.leerInput();

                consola.imprimir("Introduce el segundo número: ");
                y = consola.leerInput();
            }

            int resultado = 0;

            switch (option) {
                case 1:
                    resultado = operaciones.division(x, y);
                    break;
                case 2:
                    resultado = operaciones.suma(x, y);
                    break;
                case 3:
                    resultado = operaciones.multiplicacion(x, y);
                    break;
                case 4:
                    resultado = operaciones.resta(x, y);
                    break;
                case 5:
                    consola.imprimir("Saliendo de la calculadora...");
                    return;
                default:
                    consola.imprimir("Opción inválida. Por favor, intenta nuevamente.\n\n");
            }

            if(option < 5) {
                consola.imprimir("El resultado de la operación es " + resultado + "\n\n");
            }
        }
    }
}
