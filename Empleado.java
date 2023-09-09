package Actividad2;
import java.util.Scanner;
public class Empleado {
	public static void main(String[] args) {
		int codigo;
		String nombre;
		int horas;
		int valorhora;
		float retencionP;
		double salariobruto;
		double salarioneto;
		double retencion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese codigo de empleado:");
		codigo = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingrese nombre de empleado:");
		nombre = entrada1.next();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Ingrese numero de horas trabajadas al mes:");
		horas = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Ingrese valor por hora trabajada:");
		valorhora = entrada3.nextInt();
		
		Scanner entrada4 = new Scanner(System.in);
		System.out.println("Ingrese porcentaje de retencion de fuente:");
		retencionP = entrada4.nextFloat();
		
		salariobruto=horas*valorhora;
		retencion=salariobruto*(retencionP/100);
		salarioneto=salariobruto-retencion;
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Codigo empleado: " + codigo);
		System.out.println("Salario bruto: " + salariobruto);
		System.out.println("Salario neto: " + salarioneto);
		
		entrada.close();
		entrada1.close();
		entrada2.close();
		entrada3.close();
		entrada4.close();
	}
}
