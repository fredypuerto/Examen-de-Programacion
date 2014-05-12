import java.util.Scanner;

public class Examen1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);	
		System.out.print("Puntaje 1 ");
		int puntaje1;
		puntaje1=s.nextInt();
		
		System.out.print("Puntaje 2 ");
		int puntaje2;
		puntaje2 =s.nextInt();
		
		System.out.print("Puntaje 3 ");
		int puntaje3;
		puntaje3 =s.nextInt();
		
		
		int promedio;
		promedio=(puntaje1+puntaje2+puntaje3)/3;
		if(promedio>1000)
		System.out.print("Excelente");
		if(promedio>700)
		System.out.print("Bueno");
		if(promedio>500)
		System.out.print("Suficiente");
		if(promedio<500)
			System.out.print("Haz perdido");
	}
}

