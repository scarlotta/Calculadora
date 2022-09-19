import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        mostrarOpcionesMenu();
        int a = trycatchInt(6);
        switch (a) {
            case 1 -> operacionesAritmeticas();
            case 2 -> ecuacionCuadratica();
            case 3 -> figurasGeometricas();
            case 4 -> sistemaEcuaciones();
            case 5 -> ecuacionRecta();
            default -> {
            }
        }

    }
    public static void operacionesAritmeticas(){

        System.out.println("Ingrese 2 valores");
        double a = eleccion();
        double b = eleccion();

        sumar(a,b);
        restar(a,b);
        multiplicar(a,b);
        dividir(a,b);
        encontrarMayor(a,b);
        encontrarMenor(a,b);
        porcentaje(a,b);
        potencia(a,b);

    }

    public static void ecuacionCuadratica(){
        System.out.println("La operacion cuadratica tiene la forma Ax^2+Bx+C, seleccione los valores.");

        System.out.println("Ingrese el valor de A");
        double a = eleccion();
        System.out.println("Ingrese el valor de B");
        double b = eleccion();
        System.out.println("Ingrese el valor de C");
        double c = eleccion();

        double determinante = Math.pow(b,2)-(4*a*c);
        if (determinante>0)
        {
            double x1=(-b+Math.sqrt(determinante))/(2*a);
            double x2=(-b-Math.sqrt(determinante))/(2*a);
            System.out.println("Hay dos numeros reales: x1 = "+x1+" y x2= "+x2);
        }
        else if (determinante==0)
        {
            double x1 = -b/(2*a);
            System.out.println("La ecuación tiene una raíz real, x1 = x2 = "+x1);
        }
        else if (determinante<0) {
            System.out.println("Ecuaciones sin raices reales");
        }
    }
    public static void figurasGeometricas(){

        mostrarOpcionesFiguras();
        int a = trycatchInt(7);

        switch (a){
            case 1 -> operacionesCuadrado();
            case 2 -> operacionesRectangulo();
            case 3 -> operacionesCirculo();
            case 4 -> operacionesEsfera();
            case 5 -> operacionesCono();
            case 6 -> operacionesCubo();
        }
    }

    public static void sistemaEcuaciones(){

        System.out.println("El sistema de ecuaciones lineales tiene la forma" +
                "\n Ax+By=C \n Dx+Ey=F \n Seleccione los valores");
        System.out.println("Ingrese el valor A");
        double a = eleccion();
        System.out.println("Ingrese el valor B");
        double b = eleccion();
        System.out.println("Ingrese el valor C");
        double c = eleccion();
        System.out.println("Ingrese el valor D");
        double d = eleccion();
        System.out.println("Ingrese el valor E");
        double e = eleccion();
        System.out.println("Ingrese el valor F");
        double f = eleccion();
        double x = (c*e-b*f) / (a*e-b*d);
        double y = (a*f-c*d) / (a*e-b*d);
        System.out.println("El valor de x es "+x+" El valor de y es "+y);
    }

    public static void ecuacionRecta(){

        System.out.println("Ingrese los puntos (A,B) y (C,D) para obtener la ecuacion de la recta");
        System.out.println("Ingrese el valor A");
        double a = eleccion();
        System.out.println("Ingrese el valor B");
        double b = eleccion();
        System.out.println("Ingrese el valor C");
        double c = eleccion();
        System.out.println("Ingrese el valor D");
        double d = eleccion();
        double m = (d-b)/(c-a);
        double k = b-(m*a);
        System.out.println("La ecuacion de la recta es: " +
                "\n Y="+m+"X+"+k);
    }
    public static int elegirOperacion(int limite) {
        Scanner teclado = new Scanner(System.in);
        int a;
        do {
            a = teclado.nextInt();
        } while (a > limite || a <= 0);

        return a;
    }

    public static void sumar(double num1, double num2){
        System.out.println("La suma de los 2 valores es: "+ (num1+num2));
    }

    public static void restar(double num1, double num2){
        System.out.println("La resta de los 2 valores es: " + (num1-num2));
    }

    private static void multiplicar(double num1, double num2){
        System.out.println("La multiplicacion de los 2 valores es: " + (num1*num2));
    }

    public static double dividir(double num1, double num2){
        num2= validar0(num2);

        double a = num1/num2;
        System.out.println("La division de los 2 valores es: "+ (num1/num2));
        return a;
    }

    public static void encontrarMayor(double num1, double num2){
        if (num1>num2){
            System.out.println("el numero "+num1+" es el mayor");
        }
        System.out.println("el numero "+num2+" es el mayor");
    }

    public static void encontrarMenor(double num1, double num2){
        if (num1<num2){
            System.out.println("el numero "+num1+" es el menor");
        }
        System.out.println("el numero "+num2+" es el menor");
    }

    public static double potencia(double base, double exponente){
        double a = Math.pow(base, exponente);
        System.out.println("El primer numero elevado al segundo es: " + (Math.pow(base,exponente)));
        return a;
    }

    public static void porcentaje (double num, double porcentaje){
        System.out.println("El " + porcentaje + "% de " + num + " es: " + (num*(porcentaje/100)));
    }

    public static void operacionesCuadrado(){

        System.out.println("Por favor introduzca un lado del cuadrado");
        double lado = eleccion();
        System.out.println("El perimetro del cuadrado es: " + perimetroCuadrado(lado));
        System.out.println("El area del cuadrado es: " + areaCuadrado(lado));
    }

    public static void operacionesRectangulo(){

        System.out.println("Por favor introduzca un lado del rectangulo");
        double lado1 = eleccion();
        System.out.println("Por favor introduzca el otro lado del rectangulo");
        double lado2 = eleccion();

        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo(lado1, lado2));
        System.out.println("El area del rectangulo es: " + areaRectangulo(lado1, lado2));
    }

    public static void operacionesCirculo(){
        System.out.println("Por favor introduzca el radio del circulo");
        double radio = eleccion();

        System.out.println("El perimetro del circulo es: " + perimetroCirculo(radio));
        System.out.println("El area del circulo es: "+ areaCirculo(radio));
    }

    public static void operacionesEsfera(){

        System.out.println("Por favor introduzca el radio de la esfera");
        double radio = eleccion();

        System.out.println("El area de la esfera es: " + areaEsfera(radio));
        System.out.println("El volumen de la esfera es: " + volumenEsfera(radio));
    }

    public static void operacionesCubo(){

        System.out.println("Por favor introduzca un lado del cubo");
        double lado = eleccion();

        System.out.println("El area del cubo es: " + areaCubo(lado));
        System.out.println("El volumen del cubo es: " + volumenCubo(lado));

    }

    public static void operacionesCono(){
        System.out.println("Por favor introduzca el radio del cono");
        double radio = eleccion();

        System.out.println("Por favor introduzca la altura del cono");
        double altura = eleccion();

        System.out.println(areaCono(radio, altura));
        System.out.println(volumenCono(radio, altura));
    }
    public static double perimetroCuadrado(double lado){
        return 4*lado;
    }

    public static double areaCuadrado(double lado){
        return lado*lado;
    }

    public static double perimetroRectangulo(double lado1, double lado2){
        return (lado1*2+lado2*2);
    }

    public static double areaRectangulo(double lado1, double lado2){
        return (lado1*lado2);
    }

    public static double perimetroCirculo(double radio){
        return (2*Math.PI*radio);
    }

    public static double areaCirculo(double radio){
        return (Math.PI*radio*radio);
    }

    public static double areaEsfera(double radio){return (4*Math.PI*radio*radio);}

    public static double volumenEsfera(double radio){return (4*Math.PI*radio*radio);}

    public static double areaCubo(double lado){return lado*lado*6;}

    public static double volumenCubo(double lado){return lado*lado*lado;}

    public static double areaCono(double radio, double altura){
        return ((Math.PI*radio*radio)+Math.sqrt(altura*altura+radio*radio));
    }

    public static double volumenCono(double radio, double altura){
        return (Math.PI*radio*radio*altura/3);
    }

    public static int eleccion(){
        Scanner teclado = new Scanner(System.in);
        int eleccion = teclado.nextInt();
        return eleccion;
    }

    public static double validar0(double num){
        while (num == 0){
            System.out.println("no puede ingresar 0 como divisor, ingrese nuevamente");
            num = eleccion();
        }
        return num;
    }

    public static void mostrarOpcionesMenu(){
        System.out.println("Eliga la operacion a realizar:" +
                "\n [1] Operaciones aritmeticas" +
                "\n [2] Ecuacion cuadratica" +
                "\n [3] Figuras geometricas" +
                "\n [4] Sistema de ecuaciones" +
                "\n [5] Ecuacion de la recta" +
                "\n [6] Salir");
    }

    public static void mostrarOpcionesFiguras(){
        System.out.println("Eliga la operacion a realizar:" +
                "\n [1] Operaciones Cuadrados" +
                "\n [2] Operaciones Rectangulos" +
                "\n [3] Operaciones Circulos" +
                "\n [4] Operaciones Esferas" +
                "\n [5] Operaciones Cono" +
                "\n [6] Operaciones Cubo" +
                "\n [7] Salir");
    }
    public static int trycatchInt(int limite){
       Scanner teclado = new Scanner(System.in);
       int a=0,b;
       do {

           try {
               a = teclado.nextInt();
           } catch (Exception e) {

               System.out.println("Ingrese nuevamente");
               teclado.next();
           }
       }while (a > limite || a <= 0);

               return a;
    }
    public static boolean dividirPrueba1(double num1, double num2){

        boolean es0;

        if(num2==0) {
            es0=true;
            System.out.println("No se puede dividir por 0");
        }else{
            es0=false;
        }

        return es0;
    }

    public static double dividirPrueba2(double num1, double num2){

        boolean es0;

        if(num2==0) {
            es0=true;
            System.out.println("No se puede dividir por 0");
        }else{
            es0=false;
        }
        double a = num1/num2;

        return a;
    }
}