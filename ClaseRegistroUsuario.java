
public class RegistroUsuario {
	public void validarDni (int dni){
		if (dni <=0 ){
			throw new IllegalArgumentException("La " + e.getMessage());
	}

	public void validarNombre(String nombre){
		if ( nombre == null || nombre.trim().isEmpty()){
			throw new IllegalArgumentException("Se debe completar el campo nombre);
		}
	}

	public void validadEdad (int edad) throws MenorDeEdadException(){
		if (edad < 0 || edad>120) {
			throw new IllegalArgumentException("Error edad incorrecta" + e.getMessage);
		if ( edad<18){
			throw new MenorDeEdadExcepcion(e.getMessage);

		}
	}

	public static void main (String [] args ) {
		Scanner teclado= new Scanner(System.in);	
		boolean datosCorrectos= false;
	
	while( datos!= false){
		try { 
			System.out.println("Ingrese nombre");
			String nombre= scanner.nextLine();
			validarNombre(nombre);

			
			System.out.println("Ingrese DNI");
			int dni= scanner.nextInt();
			teclado.nextLine();
			validarNombre(dni);

			System.out.println("Ingrese edad");
			int edad= scanner.nextInt();
			teclado.nextLine();
			validarEdad(edad);
		
			datosCorrectos = true;

		} cath (InputMismatchException e ) {
			System.out.println("Error" + e.getMessage());
		} catch ( MenorDeEdadException e ) {
			System.out.println("ERROR: " + e.getMessage);
		}catch (IllegalArgument e ){
			
			System.out.println("ERROR: " + e.getMessage);
		}finally {
			System.out.println(" -------- ");
	}

}

