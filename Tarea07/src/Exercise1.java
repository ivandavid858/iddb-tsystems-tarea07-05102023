import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		//Ex1
		//Validar que el usuario exista
		Scanner sc = new Scanner(System.in);
		
		Hashtable<String, Double> students = new Hashtable<String, Double>();
		
		double acumGrades = 0;
		double avgGrades;
		int totalGrades = 2;
		int totalStudents = 2;
		
		for (int j = 0; j < totalStudents; j++) {
			System.out.println("Ingresar nombre alumno:");
			String student = sc.nextLine();
			for (int i = 0; i < totalGrades; i++) {
				System.out.println("Ingresar nota: ");
				double grade = sc.nextDouble();
				sc.nextLine();
				acumGrades += grade;
			}
			avgGrades = acumGrades/totalGrades;
			students.put(student, avgGrades);
			acumGrades = 0;
		}
		
		System.out.println("\nNota media de alumnos:");
		for (Map.Entry<String, Double> student : students.entrySet()) {
			System.out.println(student.getKey() + ": " + student.getValue());
		}
		
		//Ex2:
		//En una lista guardar 5 articulos
		//nombre, precio
		//recorrer la lista
		
		
		//Ex3:
		//articulos y cantidad
		//decidir si es vector, dicionario...
		//hacer crud. Eliminar no
		
		//Ex4:
		
		
		

	}

}
