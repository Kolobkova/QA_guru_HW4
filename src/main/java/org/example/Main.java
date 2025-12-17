package org.example;

public class Main {
    public static void main(String[] args) {

        int H = 10;
        int W = 5;
        int R = 4;
        double Pi = 3.14;
        byte C = 100;

        //применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int Perimeter = (H + W)*2;
        int Area = H*W;
        int Diametr = 2*R;

        System.out.println("Площадь прямоугольника равна " + Area);
        System.out.println("Периметр прямоугольника равен " + Perimeter);
        System.out.println("Диаметр окружности равен " + Diametr);


        // применить несколько арифметических операций над int и double в одном выражении

        System.out.println("Площадь круга равна " + Pi*R*R);
        System.out.println("Длина окружности равна " + 2*Pi*R);

        // применить несколько логических операций ( < , >, >=, <= )

        if (W < R) {
            System.out.println("Круг вписать в прямоугольник не получится");
                   }
        else {
            System.out.println("Круг вписать в прямоугольник получится");
        }


       boolean isCompare = Area > Perimeter;
        System.out.println(isCompare);

        //  получить переполнение при арифметической операции

        byte E = C + 28;
        System.out.println(E);


        }
    }
