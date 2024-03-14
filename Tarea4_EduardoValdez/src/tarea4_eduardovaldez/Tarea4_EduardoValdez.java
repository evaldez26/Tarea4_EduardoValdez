/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea4_eduardovaldez;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author guali
 */
public class Tarea4_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's') {
            System.out.print("**********Menu**********\n1. Battleship\n2. Busca Minas\n3. Salir\nIngrese una opcion: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("**********¡BATTLESHIP!**********");
                    System.out.print("1. Modo De Un Jugador\n2. Modo De Dos Jugadores\nElija un modo de juego: ");
                    int modo = leer.nextInt();
                    switch (modo) {
                        case 1:
//                            System.out.println("Tablero A");
//                            imprimir(TableroA());
//                            System.out.println("\nTablero B");
//                            imprimir(TableroB());
                            System.out.print("\nElija un tablero[1.A, 2.B]: ");
                            int tablero = leer.nextInt();
                            switch (tablero) {
                                case 1:
                                    System.out.print("1. Modo Silencioso\n2. Modo Simple\nElija una opcion: ");
                                    int modo2 = leer.nextInt();
                                    switch (modo2) {
                                        case 1:
                                            System.out.println("Has escogido el Tablero A en Modo Silencioso\nTablero\n");
                                            char[][] Tablero = TableroA();
                                            imprimir2(Tablero);

                                            boolean vic = false;
                                            while (vic == false) {

                                                System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                String coordenada = leer.next();
                                                int fila = coordenada.charAt(0) - 48;
                                                int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero.length || columna >= Tablero[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero = ataque(Tablero, fila, columna);
                                                imprimir2(Tablero);
                                                vic = victoriaA(Tablero);

                                            }
                                            if (vic) {
                                                System.out.println("Has dañado 3 barcos ¡HAS GANADO!\n");
                                            }

//                                            System.out.println(fila+"-"+columna);
                                            break;
                                        case 2:
                                            int cont = 0;
                                            System.out.println("Has escogido el Tablero A en Modo Simple\nTablero\n");
                                            Tablero = TableroA();
                                            imprimir(Tablero);

                                            vic = false;
                                            while (vic == false) {

                                                System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                String coordenada = leer.next();
                                                int fila = coordenada.charAt(0) - 48;
                                                int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero.length || columna >= Tablero[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero = ataque(Tablero, fila, columna);
                                                imprimir(Tablero);
                                                vic = victoriaA(Tablero);

                                            }
                                            if (vic) {
                                                System.out.println("Has dañado 3 barcos ¡HAS GANADO!\n");
                                            }

//                                            System.out.println(fila+"-"+columna);
                                            break;
                                        default:
                                            break;
                                    }

                                    break;
                                case 2:
                                    System.out.print("1. Modo Silencioso\n2. Modo Simple\nElija una opcion: ");
                                    modo2 = leer.nextInt();
                                    switch (modo2) {
                                        case 1:
                                            System.out.println("Has escogido el Tablero B en Modo Silencioso\nTablero\n");
                                            char[][] Tablero = TableroB();
                                            imprimir2(Tablero);

                                            boolean vic = false;
                                            while (vic == false) {

                                                System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                String coordenada = leer.next();
                                                int fila = coordenada.charAt(0) - 48;
                                                int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero.length || columna >= Tablero[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero = ataque(Tablero, fila, columna);
                                                imprimir2(Tablero);
                                                vic = victoriaB(Tablero);

                                            }
                                            if (vic) {
                                                System.out.println("Has dañado 3 barcos ¡HAS GANADO!\n");
                                            }

//                                            System.out.println(fila+"-"+columna);
                                            break;
                                        case 2:
                                            System.out.println("Has escogido el Tablero B en Modo Simple");
                                            Tablero = TableroB();
                                            imprimir(Tablero);

                                            vic = false;
                                            while (vic == false) {

                                                System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                String coordenada = leer.next();
                                                int fila = coordenada.charAt(0) - 48;
                                                int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero.length || columna >= Tablero[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero = ataque(Tablero, fila, columna);
                                                imprimir(Tablero);
                                                vic = victoriaB(Tablero);

                                            }
                                            if (vic) {
                                                System.out.println("Has dañado 3 barcos ¡HAS GANADO!\n");
                                            }

//                                            System.out.println(fila+"-"+columna);
                                            break;

                                        default:
                                            break;

                                    }
                                    break;
                                default:
                                    break;
                            }

                            break;
                        case 2:
                            System.out.print("1. Modo Silencioso\n2. Modo Simple\nElija una opcion: ");
                            int modo2 = leer.nextInt();
                            switch (modo2) {
                                case 1:
                                    boolean vic = false;
                                    char[][] Tablero1 = TableroA();
                                    char[][] Tablero2 = TableroB();
                                    System.out.println("Has escogido el modo de dos jugadores en modo silecioso");
                                    System.out.println("Tablero A (Jugador 1)");
                                    imprimir2(Tablero1);
                                    System.out.println("Tablero B (Jugador 2)");
                                    imprimir2(Tablero2);
                                    int rounds = 1;
                                    while (vic == false) {
                                        switch (rounds) {
                                            case 1:
                                                rounds = rounds + 1;
                                                System.out.print("\nTurno de Jugador 1\nIngrese coordenadas del tablero b que quiere atacat[1,3]; ");
                                                String coordenada = leer.next();
                                                int fila = coordenada.charAt(0) - 48;
                                                int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero2.length || columna >= Tablero2[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero2 = ataque(Tablero2, fila, columna);
                                                imprimir2(Tablero2);
                                                vic = victoriaB(Tablero2);

                                                if (vic) {
                                                    System.out.println("Ha dañad 3 barcos ¡HAS GANADO EL JUGADOR 1!\n");
                                                }
                                                break;
                                            case 2:
                                                rounds = rounds - 1;
                                                System.out.print("\nTurno de Jugador 2\nIngrese coordenadas del tablero a que quiere atacat[1,3]; ");
                                                coordenada = leer.next();
                                                fila = coordenada.charAt(0) - 48;
                                                columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero1.length || columna >= Tablero1[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero1 = ataque(Tablero1, fila, columna);
                                                imprimir2(Tablero1);
                                                vic = victoriaA(Tablero1);

                                                if (vic) {
                                                    System.out.println("Ha dañado 3 barcos ¡HA GANADO EL JUGADOR 2!\n");
                                                }
                                                break;

                                        }

                                    }
                                    break;
                                case 2:
                                    vic = false;
                                    Tablero1 = TableroA();
                                    Tablero2 = TableroB();
                                    System.out.println("Has escogido el modo de dos jugadores en modo simple");
                                    System.out.println("Tablero A (Jugador 1)");
                                    imprimir(Tablero1);
                                    System.out.println("Tablero B (Jugador 2)");
                                    imprimir(Tablero2);
                                    rounds = 1;
                                    while (vic == false) {
                                        switch (rounds) {
                                            case 1:
                                                rounds = rounds + 1;
                                                System.out.print("\nTurno de Jugador 1\nIngrese coordenadas del tablero b que quiere atacat[1,3]; ");
                                                String coordenada = leer.next();
                                                int fila = coordenada.charAt(0) - 48;
                                                int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero2.length || columna >= Tablero2[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero2 = ataque(Tablero2, fila, columna);
                                                imprimir(Tablero2);
                                                vic = victoriaB(Tablero2);

                                                if (vic) {
                                                    System.out.println("Ha dañad 3 barcos ¡HAS GANADO EL JUGADOR 1!\n");
                                                }
                                                break;
                                            case 2:
                                                rounds = rounds - 1;
                                                System.out.print("\nTurno de Jugador 2\nIngrese coordenadas del tablero a que quiere atacat[1,3]; ");
                                                coordenada = leer.next();
                                                fila = coordenada.charAt(0) - 48;
                                                columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                while (fila >= Tablero1.length || columna >= Tablero1[0].length) {
                                                    System.out.println("Rangos no validos");
                                                    System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                                    coordenada = leer.next();
                                                    fila = coordenada.charAt(0) - 48;
                                                    columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                                }
                                                Tablero1 = ataque(Tablero1, fila, columna);
                                                imprimir(Tablero1);
                                                vic = victoriaA(Tablero1);

                                                if (vic) {
                                                    System.out.println("Ha dañado 3 barcos ¡HA GANADO EL JUGADOR 2!\n");
                                                }
                                                break;

                                        }

                                    }
                                    break;

                            }

                            break;
                        default:
                            break;

                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("**********¡BUSCA MINAS!*****");
                    System.out.print("1.Modo Dinamico\n2.Modo Estatico\nElije una opcion: ");
                    modo = leer.nextInt();
                    switch (modo) {
                        case 1:
                            System.out.print("1.Modo Silencioso\n2.Modo Simple\nElije una opcion: ");
                            int modo2 = leer.nextInt();
                            switch (modo2) {
                                case 1:
                                    char[][] tablero = TableroBuscaMinasdinamico();
                                    imprimir2(tablero);
                                    int cont = 0;
                                    boolean der = false;
                                    while (cont < 25 && der == false) {
                                        System.out.print("\nIngrese coordenadas del tablero a que quiere atacat[1,3]; ");
                                        String coordenada = leer.next();
                                        int fila = coordenada.charAt(0) - 48;
                                        int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        while (fila >= tablero.length || columna >= tablero[0].length) {
                                            System.out.println("Rangos no validos");
                                            System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                            coordenada = leer.next();
                                            fila = coordenada.charAt(0) - 48;
                                            columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        }
                                        tablero = ataqueBM(tablero, fila, columna);
                                        imprimir2(tablero);
                                        der = DerrotaBM(tablero);
                                        cont = cont + 1;

                                    }
                                    if (der == true) {
                                        System.out.println("Explotaste una bomba has perdido");
                                    } else if (cont >= 25) {
                                        System.out.println("Llenaste todas casillas donde no habian bombas ¡HAS GANADO!");
                                    }

                                    break;

                                case 2:
                                    tablero = TableroBuscaMinasdinamico();
                                    imprimir(tablero);
                                    cont = 0;
                                    der = false;
                                    while (cont < 25 && der == false) {
                                        System.out.print("\nIngrese coordenadas del tablero a que quiere atacat[1,3]; ");
                                        String coordenada = leer.next();
                                        int fila = coordenada.charAt(0) - 48;
                                        int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        while (fila >= tablero.length || columna >= tablero[0].length) {
                                            System.out.println("Rangos no validos");
                                            System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                            coordenada = leer.next();
                                            fila = coordenada.charAt(0) - 48;
                                            columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        }
                                        tablero = ataqueBM(tablero, fila, columna);
                                        imprimir(tablero);
                                        der = DerrotaBM(tablero);
                                        cont = cont + 1;

                                    }
                                    if (der == true) {
                                        System.out.println("Explotaste una bomba has perdido");
                                    } else if (cont >= 25) {
                                        System.out.println("Llenaste todas casillas donde no habian bombas ¡HAS GANADO!");
                                    }

                                    break;
                            }
                            break;
                        case 2:
                            System.out.print("1.Modo Silencioso\n2.Modo Simple\nElije una opcion: ");
                            modo2 = leer.nextInt();
                            switch (modo2) {
                                case 1:
                                    char[][] tablero = TableroBuscaMinas();
                                    imprimir2(tablero);
                                    int cont = 0;
                                    boolean der = false;
                                    while (cont < 25 && der == false) {
                                        System.out.print("\nIngrese coordenadas del tablero a que quiere atacat[1,3]; ");
                                        String coordenada = leer.next();
                                        int fila = coordenada.charAt(0) - 48;
                                        int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        while (fila >= tablero.length || columna >= tablero[0].length) {
                                            System.out.println("Rangos no validos");
                                            System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                            coordenada = leer.next();
                                            fila = coordenada.charAt(0) - 48;
                                            columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        }
                                        tablero = ataqueBM(tablero, fila, columna);
                                        imprimir2(tablero);
                                        der = DerrotaBM(tablero);
                                        cont = cont + 1;

                                    }
                                    if (der == true) {
                                        System.out.println("Explotaste una bomba has perdido");
                                    } else if (cont >= 25) {
                                        System.out.println("Llenaste todas casillas donde no habian bombas ¡HAS GANADO!");
                                    }

                                    break;
                                case 2:
                                    tablero = TableroBuscaMinas();
                                    imprimir(tablero);
                                    cont = 0;
                                    der = false;
                                    while (cont < 25 && der == false) {
                                        System.out.print("\nIngrese coordenadas del tablero a que quiere atacat[1,3]; ");
                                        String coordenada = leer.next();
                                        int fila = coordenada.charAt(0) - 48;
                                        int columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        while (fila >= tablero.length || columna >= tablero[0].length) {
                                            System.out.println("Rangos no validos");
                                            System.out.print("\nIngrese cordenada donde quiere atacar (Ejemplo: [1,3]): ");
                                            coordenada = leer.next();
                                            fila = coordenada.charAt(0) - 48;
                                            columna = coordenada.charAt(coordenada.length() - 1) - 48;
                                        }
                                        tablero = ataqueBM(tablero, fila, columna);
                                        imprimir(tablero);
                                        der = DerrotaBM(tablero);
                                        cont = cont + 1;

                                    }
                                    if (der == true) {
                                        System.out.println("Explotaste una bomba has perdido");
                                    } else if (cont >= 25) {
                                        System.out.println("Llenaste todas casillas donde no habian bombas ¡HAS GANADO!");
                                    }

                                    break;
                            }
                            break;

                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Salio del programa");
                    resp = 'n';
                    break;
                default:
            }

        }

    }//fin del main

    public static boolean DerrotaBM(char[][] tablero) {
        boolean derrota = false;
        int cont = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 'X') {
                    cont = cont + 1;
                }
            }

        }
        if (cont == 1) {
            derrota = true;
        }

        return derrota;
    }

    public static char[][] ataqueBM(char[][] tablero, int a, int b) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[a][b] == '*' && i == a && j == b) {
                    System.out.println("BOOM!!!!");
                    tablero[i][j] = 'X';
                } else if (tablero[a][b] == ' ' && i == a && j == b) {
                    System.out.println("Uff, no era una bomba");
                    tablero[i][j] = 'x';

                }
            }

        }

        return tablero;
    }

    public static char[][] TableroBuscaMinas() {
        char[][] tablero;
        int fila = 6;
        int columna = 5;
        tablero = new char[fila][columna];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (i == 0 && j == 0) {
                    tablero[i][j] = '*';
                } else if (i == 1 && j == 3) {
                    tablero[i][j] = '*';
                } else if (i == 3 && j == 1) {
                    tablero[i][j] = '*';
                } else if (i == 5 && j == 0 || i == 5 && j == 4) {
                    tablero[i][j] = '*';
                } else {
                    tablero[i][j] = ' ';
                }

            }
        }

        return tablero;

    }

    public static char[][] TableroBuscaMinasdinamico() {
        char[][] tablero;
        int fila = 6;
        int columna = 5;
        tablero = new char[fila][columna];
        int cont = 0;
        int fr = 0;
        int cr = 0;
        int fr2 = 0;
        int cr2 = 0;
        while (cont < 6) {
            fr = rand.nextInt(5);
            cr = rand.nextInt(5);
            if (fr == fr2 && cr == cr2) {
                fr = rand.nextInt(6);
                cr = rand.nextInt(5);

            }
            tablero[fr][cr] = '*';
            cont = cont + 1;
            fr2 = fr;
            cr2 = cr;
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] != '*') {
                    tablero[i][j] = ' ';

                }
            }
        }

        return tablero;

    }

    public static void imprimir(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }//fin de imprimir

    public static void imprimir2(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == 'x' || matriz[i][j] == 'X') {
                    System.out.print("[" + matriz[i][j] + "]");
                } else {
                    System.out.print("[ ]");
                }

            }
            System.out.println();
        }

    }//fin de imprimir 2

    public static char[][] TableroA() {
        char[][] tableroA;
        int fila = 6;
        int columna = 5;
        tableroA = new char[fila][columna];
        for (int i = 0; i < tableroA.length; i++) {
            for (int j = 0; j < tableroA[0].length; j++) {
                if (i < 4 && j == 0) {
                    tableroA[i][j] = '*';
                } else if (i == 1 && j < 4 && j > 1) {
                    tableroA[i][j] = '*';
                } else if (i > 2 && j == 4) {
                    tableroA[i][j] = '*';
                } else {
                    tableroA[i][j] = ' ';
                }

            }
        }

        return tableroA;

    }//fin tablero a

    public static char[][] TableroB() {
        char[][] tablerob;
        int fila = 6;
        int columna = 5;
        tablerob = new char[fila][columna];
        for (int i = 0; i < tablerob.length; i++) {
            for (int j = 0; j < tablerob[0].length; j++) {
                if (i > 2 && j == 1) {
                    tablerob[i][j] = '*';
                } else if (i > 0 && i < 4 && j == 3) {
                    tablerob[i][j] = '*';
                } else if (i == 5 && j > 2) {
                    tablerob[i][j] = '*';
                } else {
                    tablerob[i][j] = ' ';
                }

            }
        }

        return tablerob;

    }//fin tablero a

    public static char[][] ataque(char[][] tablero, int a, int b) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[a][b] == '*' && i == a && j == b) {
                    System.out.println("Uy, un barco ha sido dañado");
                    tablero[i][j] = 'x';
                } else if (tablero[a][b] == ' ' && i == a && j == b) {
                    System.out.println("Bomba al agua");
                    tablero[i][j] = 'x';

                }
            }

        }

        return tablero;
    }

    public static boolean victoriaA(char[][] tablero) {
        boolean victoria = false;
        int cont = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 'x' && i < 4 && j == 0 || tablero[i][j] == 'x' && i == 1 && j < 4 && j > 1 || tablero[i][j] == 'x' && i > 2 && j == 4) {
                    cont = cont + 1;
                }
            }

        }
        if (cont == 3) {
            victoria = true;
        }
        return victoria;
    }

    public static boolean victoriaB(char[][] tablero) {
        boolean victoria = false;
        int cont = 0;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 'x' && i > 2 && j == 1 || tablero[i][j] == 'x' && i > 0 && i < 4 && j == 3 || tablero[i][j] == 'x' && i == 5 && j > 2) {
                    cont = cont + 1;
                }
            }

        }
        if (cont == 3) {
            victoria = true;
        }
        return victoria;
    }

}
