
package p_arcial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);

        int[] array = new int[10];
        int[][] matriz = new int[4][4];

        boolean arrayCargado = false;
        boolean matrizCargada = false;

        int opcion;

        do {
            limpiarConsola();

            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Calcular Area del Circulo");
            System.out.println("2. Ingresar Datos Array");
            System.out.println("3. Listar Datos Array");
            System.out.println("4. Listar Dato del Array en Especifico");
            System.out.println("5. Ingresar Datos Matriz");
            System.out.println("6. Listar Datos de la Matriz");
            System.out.println("7. Listar Dato de la Matriz en Especifico");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();

            limpiarConsola();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el radio del circulo: ");
                    double radio = teclado.nextDouble();
                    double area = Math.PI * radio * radio;
                    System.out.println("Area del circulo: " + area);
               }

                case 2 -> {
                    System.out.println("Ingrese los 10 valores del array:");
                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Array[" + i + "]: ");
                        array[i] = teclado.nextInt();
                    }
                    arrayCargado = true;
               }

                case 3 -> {
                    if (arrayCargado) {
                        System.out.println("Datos del array:");
                        for (int i = 0; i < array.length; i++) {
                            System.out.println("Array[" + i + "] = " + array[i]);
                        }
                    } else {
                        System.out.println("Primero debe ingresar los datos del array (opcion 2).");
                    }
               }

                case 4 -> {
                    if (arrayCargado) {
                        System.out.print("Ingrese la posicion del array (0 a 9): ");
                        int pos = teclado.nextInt();
                        if (pos >= 0 && pos < array.length) {
                            System.out.println("Array[" + pos + "] = " + array[pos]);
                        } else {
                            System.out.println("Posicion fuera de rango");
                        }
                    } else {
                        System.out.println("Primero debe ingresar los datos del array (opcion 2).");
                    }
               }

                case 5 -> {
                    System.out.println("Ingrese los valores de la matriz 4x4:");
                    for (int fila = 0; fila < 4; fila++) {
                        for (int col = 0; col < 4; col++) {
                            System.out.print("Matriz[" + fila + "][" + col + "]: ");
                            matriz[fila][col] = teclado.nextInt();
                        }
                    }
                    matrizCargada = true;
               }

                case 6 -> {
                    if (matrizCargada) {
                        System.out.println("Datos de la matriz:");
                        for (int fila = 0; fila < 4; fila++) {
                            for (int col = 0; col < 4; col++) {
                                System.out.print(matriz[fila][col] + "\t");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Primero debe ingresar los datos de la matriz (opcion 5).");
                    }
               }

                case 7 -> {
                    if (matrizCargada) {
                        System.out.print("Ingrese fila (0 a 3): ");
                        int fila = teclado.nextInt();
                        System.out.print("Ingrese columna (0 a 3): ");
                        int col = teclado.nextInt();
                        if (fila >= 0 && fila < 4 && col >= 0 && col < 4) {
                            System.out.println("Matriz[" + fila + "][" + col + "] = " + matriz[fila][col]);
                        } else {
                            System.out.println("Indices fuera de rango");
                        }
                    } else {
                        System.out.println("Primero debe ingresar los datos de la matriz (opcion 5).");
                    }
               }

                case 8 -> {
                    System.out.println("Saliendo del programa. Hasta luego :) ");
                    System.out.println("Hecho por Ana Caro y Didier Lopez");
                    pausar(teclado);
               }

                default -> System.out.println("Opcion invalida. Intente de nuevo.");
            }

            if (opcion != 8) {
                pausar(teclado);
            }

        } while (opcion != 8);

        teclado.close();
    }

    public static void pausar(Scanner scanner) {
        System.out.println("\nPresione Enter para continuar");
        scanner.nextLine();
        scanner.nextLine();
    }

    public static void limpiarConsola() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}

       

    
    

