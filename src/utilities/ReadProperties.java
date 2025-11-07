package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadProperties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		InputStream readFile = null;
		try {
			//Se abre el archivo "config.properties" para su lectura.
			readFile = new FileInputStream("Config.properties");
			
			//Se carga las pripedades desde el archivo hacia el objeto prop
			prop.load(readFile);
			
			//se recuperan y muestran las propiedades especificas por su clave
			System.out.println(prop.getProperty("DBSServer"));
			System.out.println(prop.getProperty("DBName"));
			System.out.println(prop.getProperty("DBPass"));
			System.out.println(prop.getProperty("username"));

		}catch(IOException io) {
			
			//Mensaje creado para exponer la excepcion
		System.err.println("Ojo, ponga cuidado: ocurrio un error al leer el archivo");
		io.printStackTrace();
			
		}finally{
			if(readFile !=null) {
				try {
					readFile.close();//cierra el flijo de entrada
				}catch(IOException e) {
					e.printStackTrace();//Muestra cualquier error al cerrar el archivo.
					
				}
			}
		}

	}

}
