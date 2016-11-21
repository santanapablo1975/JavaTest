
public class UsuarioAdmin {

	
	public void Mostrar(Usuario modelo){
		System.out.println("Nombre: 	"	+modelo.getNombre());
		System.out.println("Apellido: 	"	+modelo.getApellido());
		System.out.println("Edad: 		" 	+modelo.getEdad());
		
		//condiciones
		if (modelo.getEdad()>=18) {
			System.out.println("Es mayor de edad");			
		}
		else{
			if (modelo.getEdad()<5) {
				System.out.println("Es BEBE");
			}
			else if (modelo.getEdad()>=5 && modelo.getEdad()<=10) {
				System.out.println("Es un NIÑO");
			}			
			//ciere con else
			else			
			System.out.println("Es un Adolescente");				
			
			
			// cierre con else if
			//else if (modelo.getEdad()>10) {
			//	System.out.println("Es un Adolescente");				
			//}

		}
		
	}
}
