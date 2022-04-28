import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

    /**
    * The class for working with data files
    */

public class XlsxReader {

    private String path;
    private XSSFSheet sheet;
    private XSSFWorkbook book;

    /**
    * method for reading data from a file
    */
    public XlsxReader (String path) throws IOException {
        this.path = path;
        File file = new File(path);
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            book = new XSSFWorkbook(fileInputStream);
            sheet = book.getSheet("Лист1");

        } catch (IOException e) {
            throw new IOException("Invalid file format");
        }
    }

    public String cellToString(XSSFCell cell){
        Object result = null;
        CellType type = cell.getCellType();
        result = cell.getStringCellValue();
        return result.toString();
    }

    public int getXlsxCountColumns(){
        return sheet.getRow(0).getLastCellNum();
    }

    public int getXlsxCountRows(){
        return sheet.getLastRowNum() +1;
    }

    public String [][] dataOfUsers() throws IOException {
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        book = new XSSFWorkbook(fileInputStream);
        sheet = book.getSheet("Лист1");
        int numberOfColumns = getXlsxCountColumns();
        int numberOfRows = getXlsxCountRows()-1;
        String [][] data = new String[numberOfRows][numberOfColumns];
            for(int i = 1; i < numberOfRows+1; i++){
                for(int j = 0; j < numberOfColumns; j++){
                    XSSFRow row = sheet.getRow(i);
                    XSSFCell cell = row.getCell(j);
                    String value = cellToString(cell);
                    data[i-1][j] = value;
                    if(value == null){
                        System.out.println("Cell is empty");
                    }
                }
        }
        return data;
    }
}
