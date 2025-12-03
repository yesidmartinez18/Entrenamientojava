package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

//Importar clases de la biblioteca JSON
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonData {

	public static void main(String[] args) throws IOException, ParseException {
		
		String Filepath = System.getProperty("user.dir") + "//testData.json";
		//Obtiene la ruta absoluta del directorio actual.
		
		FileReader file = new FileReader(Filepath);
		//Abre el archivo JSON ubicado en la ruta especifica.
		
		JSONParser  parser  = new JSONParser();
		//Crea una instancia de la clase parser que se usa para convertir el texto del archivo
		
		JSONObject json =  (JSONObject) parser.parse(file);
		//parsea el contenido del archivo y lo convierte en un objeto JSON principal.
		
		System.out.println(json.toJSONString());
		//Muestra el contenido completo del archivo JSON en forma de texto
		
		JSONArray testData = (JSONArray) json.get("testdata");
		//Extrae el objeto json el arreglo que esta bajo la clave "testdata#
		//Este arreglo contiene uno o mas casos de prueba
		
		for(int i = 0;i < testData.size(); i++) {
			//Itera sobre cada elemento del arreglo testdata
			JSONObject testCase = (JSONObject) testData.get(i);
			//Extrae un objeto individual que representa un caso de prueba
			 System.out.println("EL nombre del caso de prueba es--"+ testCase.get("testName"));
			 //Imprime el nombre del caso de prueba
			 
			 JSONArray testCaseData = (JSONArray) testCase.get("data");
			 
			 for (int j = 0; j<testCaseData.size();j++) {
				 //Itera sobre cada elemento dentro del arrgelo
				 JSONObject currentTestData = (JSONObject) testCaseData.get(j);
				 //Obtiene el objeto  JSON actual (Un conjunto clave-valor
				 
				 Set<String> keys = currentTestData.keySet();
				 //Obtiene el conjunto de claves del objeto actual
				 
				 Iterator<String> it = keys.iterator();
				 //Crea un iterado para recorrer todas las claves del objeto
				 
				 while(it.hasNext()) {
					 //Mientras haya mas claves por recorrer
					 String key = it.next(); //Obtiene la siguiente clave
					 String value = (String) currentTestData.get(key);//Obtiene el valor coreespondiente a esa clabve
					 System.out.println(key + " -- "+ value);
				 }
				 
			 }
			
		}
		

	}

}
