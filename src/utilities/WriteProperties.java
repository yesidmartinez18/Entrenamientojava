
package utilities;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		OutputStream writeFile=null;
		
		try {
			writeFile = new FileOutputStream("Config.properties");
			prop.setProperty("DBSServer", "Julian777");
			prop.setProperty("DBName", "DB_patiño");
			prop.setProperty("DBPass", "testpassword");
			prop.setProperty("username", "root");
			
			
			prop.store(writeFile, null);
			System.out.println("Create Proprties Sucessfully");
			
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			if(writeFile != null) {
				try {
					writeFile.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
