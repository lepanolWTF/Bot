import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcularPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x,y,velocidad,angulo;
		System.out.println("Introduce el punto x de inicio");
		x=sc.nextDouble();
		System.out.println("Introduce el punto y de inicio");
		y=sc.nextDouble();
		System.out.println("Introduce la velocidad en metros/s");
		velocidad=sc.nextDouble();
		System.out.println("Introduce el angulo en el que se mueve");
		angulo=sc.nextDouble();
		
		System.out.println("El punto de partida es en las coordenadas: " +x+", "+y);
		calcularAvance(x,y, velocidad, angulo);
	}

	public static void calcularAvance(double x1,double y1,double velocidad,double angulo){
		DecimalFormat df = new DecimalFormat("#0.00");
		double x,y;
		double b = Math.toRadians(angulo),d;
		d=velocidad*10;
		x=d*Math.cos(b);
		y=d*Math.sin(b);
		
		for(int i=1;i<=6;i++){
			
			System.out.println("Al cabo de "+ i*10 + " segundos estaran en la posicion "+ df.format(x*i) + ", " + df.format(y*i));
		}			
	}
}
