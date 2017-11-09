package com.company;

public class Main {

    public static void main(String[] args) {

        //Рисуем прямоугольнк
        for(int i=0; i<10; i++)
        {
            for(int j = 0; j<10; j++)
            {
                if(  i==0 || i==9  ||  j==0 || j==9  )  { System.out.print("* "); }
                else { System.out.print("  "); }


            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // Рисуем прямоугольный треугольник
        for(int i=0; i<10; i++)
        {
            for(int j = 0; j<10; j++)
            {
                if(  i==9  ||  j==0 || i==j  )  { System.out.print("* "); }
                else { System.out.print("  "); }


            }
            System.out.print("\n");
        }



        System.out.print("\n");

        // Рисум ромб
        for(int i=-5; i<=5; i++)
        {
            for(int j = -5; j<=5; j++)
            {
                if(  Math.abs(i) + Math.abs(j) == 5  )  { System.out.print("* "); }
                else { System.out.print("  "); }


            }
            System.out.print("\n");
        }


        System.out.print("\n");

        // Рисум равносторонний треугольник
        for(int i=-5; i<=0; i++)
        {
            for(int j = -5; j<=5; j++)
            {
                if(  Math.abs(i) + Math.abs(j) == 5  || i == 0 )  { System.out.print("* "); }
                else { System.out.print("  "); }


            }
            System.out.print("\n");
        }
    }
}
