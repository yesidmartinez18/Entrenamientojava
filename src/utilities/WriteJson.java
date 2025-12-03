package utilities;
import java.io.FileWriter;
import java.io.IOException;

//Import las clases necesarias para manejo json
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJson {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		//----Estudiante 1-----
		JSONObject estudiante1 = new JSONObject();
		estudiante1.put("nombreEstudiante","Lucas" );
		estudiante1.put("Grado","Sexto" );
		estudiante1.put("Ubicacion","Manizales" );
		
		
		//----Estudiante 2-----
		JSONObject estudiante2 = new JSONObject();
		estudiante2.put("nombreEstudiante","Maria" );
		estudiante2.put("Grado","Octavo" );
		estudiante2.put("Ubicacion","Manizales" );
		

		//----Estudiante 3-----
		JSONObject estudiante3 = new JSONObject();
		estudiante3.put("nombreEstudiante","Juan" );
		estudiante3.put("Grado","Noveno" );
		estudiante3.put("Ubicacion","Bogota" );
		
		
		//Arreglo de estudiantes
		
		JSONArray detallesEstudiantes = new JSONArray();
		detallesEstudiantes.add(estudiante1);
		detallesEstudiantes.add(estudiante2);
		detallesEstudiantes.add(estudiante3);
		
		
		//Objeto contenedor principal
		JSONObject datos = new JSONObject();
		datos.put("detallesEstudiantes", detallesEstudiantes);
		
		System.out.println(datos.toJSONString());
		
		try(FileWriter archivo = new FileWriter("estudiantes.json")){
			archivo.write(datos.toJSONString());//Escribe el json como texto
			archivo.flush();//FUerza la escritura inmediafa de los datos en el discos
			System.out.println("Archivo JSON guardado como 'estudiante.json'");
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}

}
