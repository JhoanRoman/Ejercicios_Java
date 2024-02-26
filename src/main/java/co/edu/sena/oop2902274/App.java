package co.edu.sena.oop2902274;


import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {


        //Area de un triangulo//
        System.out.println( "Calcular el area de un triangulo" );
        Scanner src  = new Scanner(System.in);


        System.out.println( "Ingrese la base de un triangulo" );
        double base = src.nextDouble();


        System.out.println( "Ingrese la altura de un triangulo" );
        double height = src.nextDouble();


        double result= (base*height)/2;
        System.out.println( "El area de un triangulo es:" + result );
        //Area de un triangulo//
   


        //Suma de dos numeros//


        System.out.println( "Suma de dos numeros" );
        Scanner sum = new Scanner(System.in);


        System.out.println( "Ingrese el primer numero" );
        double num1 = sum.nextDouble();


        System.out.println( "Ingrese el segundo numero" );
        double num2 = sum.nextDouble();


        double suma = (num1+num2);
        System.out.println( "El resultado es:" + suma);


        //Suma de dos numeros//




        //Un numero y su equivalente al cuadrado//


        System.out.println("Numero elevado al cuadrado");
        Scanner cuad = new Scanner(System.in);


        System.out.println("Ingrese un numero");
        double num = cuad.nextDouble();


        double cuadrado = (num*num);
        System.out.println( "El numero elevado al cuadrado es:" + cuadrado);




        //Un numero y su equivalente al cuadrado//




        //Convertidor de divisas//


        System.out.println("Convertidor de divisas");
        Scanner money = new Scanner(System.in);


        System.out.println("Ingrese un valor en euros");
        double valor = money.nextDouble();


        double conv = (valor*1.08);
        System.out.println("El valor en dolares es:" +conv);


        //Convertidor de divisas//






        //Cuadrado//


        System.out.println( "Area y perimetro de un cuadrado");
        Scanner cua = new Scanner(System.in);


        System.out.println("Ingrese el valor de un lado de un cuadrado");
        double lado = cua.nextDouble();


        double peri=(lado+lado+lado+lado);
        System.out.println("El perimetro del cuadrado es" +peri);


        double ar=(lado*lado);
        System.out.println("El perimetro del cuadrado es" +ar);
        //Cuadrado//








        //Cilindro//

        System.out.println("Area y volumen de un cilindro");         
         Scanner cilindro = new Scanner(System.in);           
         System.out.println("Ingrese la radio del cilindro");         
         double radio = cilindro.nextDouble();           
         System.out.println("Ingrese la altura del cilindro");         
         double altura = cilindro.nextDouble();           
         double area = 2 * Math.PI * radio *(radio + altura ) ;         
        double volumen= Math.PI * Math.pow(radio,2) * altura;
         System.out.println("El area del cilindro es " +area+"y el volumen del cilindro es: " +volumen );

        //Cilindro//
        
        //Circulo//

        System.out.println("Longitud de la circunferencia y area");
        System.out.println("Ingrese el radio");
        Scanner rc= new Scanner (System.in);
        double radioo = src.nextDouble();
        double longitud= 2 * Math.PI * radioo;
        double areaa = Math.PI * Math.pow(radioo, 2);
        System.out.println("La longitud de circunferencia es de: " + longitud+ "y el area del circulo es: " + areaa);
        //Circulo//

        //promedio//
        System.out.println("Promedio de 3 números");
        System.out.println("Ingrese el primer número");
        Scanner npc= new Scanner (System.in);
        double not1 = npc.nextDouble();
        System.out.println("Ingrese el segundo número");
        double not2 = npc.nextDouble();
        System.out.println("Ingrese el tercer número");
        double not3 = npc.nextDouble();
        double promedio = (not1 + not2+ not3)/2;
        System.out.println("El promedio de los numeros ingresados es : "+ promedio);
        //promedio//
    }
   
}






