package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ReadYAMLData {

	public static void main(String[] args) throws FileNotFoundException, YamlException {
		
		//COnstruye la ruta al archivo testData.yml dentro del proyecto
		String filepath = System.getProperty("user.dir") + "//testData.yml";
		
		//Abrir el archivo YAML
		FileReader file = new FileReader(filepath);
		
		//Crear un lector YAML a partir del archivo
		YamlReader reader = new YamlReader(file);
		
		//Leer el contenido del archivo YAML como Map con claves tipo String y valores tipo objec
		@SuppressWarnings("unchecked")
		Map<String, Object> testData = (Map<String, Object>)reader.read();
		
		
		//Extrae la lista de los casos d eprueba bajo la vlave testdata
		List<Map<String, Object>> testCases = (List<Map<String, Object>>) testData.get("testdata");
		System.out.println("Todos los casos de prueba");
		System.out.println(testCases);
		
		//TOma el primer caso de prueba: LoginTest
		Map<String, Object> loginTestData = testCases.get(0);
		System.out.println("Nombre del primer test: ");
		System.out.println(loginTestData.get("testName"));
		
		//Extrae la lista de datos del primer caso de pruebas
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> LoginTestDataData = (List<Map<String, Object>>) loginTestData.get("data");
		System.out.println("Datos dle primer test");
		System.out.println(loginTestData);
		
		
		
		
		
		

	}

}
