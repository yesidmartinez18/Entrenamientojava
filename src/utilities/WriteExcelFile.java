package utilities;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {

	public static void main(String[] args) {
		try(XSSFWorkbook workbook = new XSSFWorkbook()){
			XSSFSheet samplesheet = workbook.createSheet("SampleSheet");
			
			//Se define un conjunto de datos usando TreeMap
			Map<String,Object[]> dataSet = new TreeMap<String, Object[]>();
			
			//Se agregan los datos al mapa(Cada fila es un arreglo de objetos
			dataSet.put("1", new Object[] {"ID", "NOMBRE", "CIUDAD"});
			dataSet.put("2", new Object[] {"1", "Julian", "Bogota"});
			dataSet.put("3", new Object[] {"2", "Edwin", "Medellin"});
			dataSet.put("4", new Object[] {"3", "Laura", "Pereira"});
			dataSet.put("5", new Object[] {"4", "Maria", "Cali"});
			dataSet.put("6", new Object[] {"5", "Jose", "Cartagena"});
			dataSet.put("7", new Object[] {"6", "John", "Villavicencio"});
			
			//Se obtiene el conjunto de claves del mapa
			Set<String> set = dataSet.keySet();
			int rownum = 0; //Contador de filas
			
			//Se itera sobre cada fila de datps
			for(String key : set) {
				//Se crea una nueva fila en la hoja
				Row row = samplesheet.createRow(rownum++);
				//Se obtiene los datos correspondientes a esa fila 
				Object[]data = dataSet.get(key);
				int cellNum = 0; //contador de celdas
				
				//se itera sobre los valores de la fila para crear celdas
				for(Object value:data) {
					//Se crea una nueva celda
					Cell cell = row.createCell(cellNum++);
					
					//Se verifica el tipo de datos y se asigna el valor de la celda
					if(value instanceof String) {
						cell.setCellValue((String)value);
					}else if(value instanceof Integer) {
						cell.setCellValue((Integer)value);
						
					}
				}
			}
			
			//Se escribe el archivo Excel en el disco duro
			try {
				//Define la ruta y nombre del archvo de salida
				FileOutputStream writeFile = new FileOutputStream("sampleTest.xlsx");
				
				//Escribe el contenido del workbook en el archivo
				
				workbook.write(writeFile);
				//Cierra el flujo del archivo
				
				writeFile.close();
				
				//Mensaje de exito en consola
				System.out.println("Archivo se creo exitosamente");
				
			}catch(FileNotFoundException e) {
			e.printStackTrace();
			//Manejo de error si el archivo no se puede crear o encontrar
			}catch(IOException e) {
				//Manejo de error de entrada/salida general
				e.printStackTrace();
			}
			
		}catch(IOException e) {
			//Manejo de error si el workbook no puede ser creado o cerrado
			e.printStackTrace();
		}
	}
}
