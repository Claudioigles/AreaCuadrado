import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resultado,base, altura;
        //Llamamos a cargar valores
        base=cargarBase();
        altura=cargarAltura();


        //calculamos el area y lo almacenamos en la variable resultado
        resultado=calcularAreaCuadrado( base, altura);

        //Mostramos por pantalla el resultado
        mostrarPorPantalla(resultado);

    }

    private static double calcularAreaCuadrado(double altura, double base){
        return  base*altura;


    }

    private static void mostrarPorPantalla(double area){
        System.out.println("El area del cuadrado es: "+area);
    }

    private static double cargarAltura() {

        double altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Altura");
        altura = entrada.nextDouble();
        return altura;
    }
    private static double cargarBase() {

        double base;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Base");
        base = entrada.nextDouble();
        return base;
    }


    }
