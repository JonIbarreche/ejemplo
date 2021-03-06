import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	
	//Metodo Recursivo
	private static void contar(int current, int end) {
		
		for (int i = current; i < end; i++) {
			System.out.println(i);
		}
	
	}
	
	private static void contarRecursiva(int current, int end) {
		System.out.println(current);
		if (current != end) {
			contar(current + 1, end);
		}
	}

	public static void main(String[] args) {
		System.out.println("------------------");
		/**
		 * 
		
		try {
			Class.forName("org.sqlite.JDBC");
			} catch (ClassNotFoundException e) {
			System.out.println("No se ha podido cargar el driver de la base de datos");
			}
		 */
		/*
		 * Clase PersonaSerializable
		 
		PersonaSerializable p1 = new PersonaSerializable("Jon", "Ibaretxe", 21);
		// Creamos un stream de salida de objetos a fichero
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("datos.bin"))) {
		os.writeObject(p1);
		System.out.println("Datos serializados correctamente");
		} catch (IOException e) {
		System.out.println("Error al serializar los datos al fichero");
		}
		*/
		/*
		 * Leer instancia
		 * 
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("datos.bin"))) {
		Persona p = (Persona) is.readObject(); // el objeto se debe castear al tipo concreto
		System.out.println(p);
		} catch (IOException e) {
		System.out.println("Error. No se pudo deserializar el objeto. " + e.getMessage());
		} catch (ClassNotFoundException e) {
		System.out.println("Error. No se pudo encontrar la clase asociada. " + e.getMessage());
		}
		 */
		/**
		 * 
		 
		Compra c1 = new Compra("Patatas", "Un conjunto de patatas");
		
		// Creamos un stream de salida de objetos a fichero
				try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("datos.bin"))) {
				os.writeObject(c1);
				System.out.println("Datos serializados correctamente");
				} catch (IOException e) {
				System.out.println("Error al serializar los datos al fichero");
				}
				
		*/		
		//Ejercicio recursividad
		System.out.println("Contar Recursiva");
		contarRecursiva(0, 14);
				
				
	}

}
