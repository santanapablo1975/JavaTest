import java.util.Scanner;

public class clase1 {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub

		//imprimir algo en cosnola
	System.out.println("Dia1 curso JAVA test, escriba en consola \n"); 
	
	//capturar consola caracteres
	Scanner leer=new Scanner(System.in);
	
	String palabra=leer.nextLine();
	
	System.out.println("la palabra es: " + palabra + "\n");
	
	//capturar consola numeros para operadores
	
	System.out.println("\n escriba un numero 1");	
	int numero1=leer.nextInt();
	System.out.println("\n escriba un numero 2");
	int numero2=leer.nextInt();
	
	System.out.println("el numero es 1 y 2: " + numero1 + "  " + numero2 + "\n");
	
*/
		//llamar a metodo
		
		MostrarPalabra();
		//MostrarPalabra();
	}
	
	/*
	private static void MostrarPalabra() {
		// TODO Auto-generated method stub

				//imprimir algo en cosnola
			System.out.println("Dia1 curso JAVA test, escriba en consola \n"); 
			
			//capturar consola caracteres
			Scanner leer=new Scanner(System.in);
			
			String palabra=leer.nextLine();
			
			System.out.println("la palabra es: " + palabra + "\n");
			
			//capturar consola numeros para operadores
			
			System.out.println("\n escriba un numero 1");	
			int numero1=leer.nextInt();
			System.out.println("\n escriba un numero 2");
			int numero2=leer.nextInt();
			
			System.out.println("el numero es 1 y 2: " + numero1 + "  " + numero2 + "\n");
		
		
	}*/

	
	private static void MostrarPalabra() {
			//capturar consola caracteres
			Scanner leer=new Scanner(System.in);
			Usuario modelo=new Usuario();
			
			UsuarioAdmin admin=new UsuarioAdmin();
			
			System.out.println("Escriba el Nombre");
			modelo.setNombre(leer.nextLine());
			System.out.println("Escriba el Apellido");
			modelo.setApellido(leer.nextLine());
			System.out.println("Escriba la Edad");
			modelo.setEdad(leer.nextInt());
			
			
			admin.Mostrar(modelo);
			leer.close();
			
		
		
	}


}
