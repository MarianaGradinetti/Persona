
public class Persona {
	String nombre;
	String apellido;
	int dni;
	int edad; 
	int altura;
	int peso;
	String estado;
	

	
	public Persona(String nombre,String apellido,int dni,int edad,int altura,int peso,String estado) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
		this.altura = altura; 
		this.peso = peso; 
		this.estado = estado;
		
	}

	public void Caminar () {
		
	}
	public void Sentarse () {
		
	}
	public void Pararse () {
		
	}
	public void Cumplir () {
		
	}
	public void Engordar () {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
