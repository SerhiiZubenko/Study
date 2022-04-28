import org.testng.annotations.DataProvider;

import java.io.IOException;

public class XlsxDataProvider {

    @DataProvider
    public Object [][] dataOfUsers() throws IOException {
        String path = "src/main/resources/dataUsers.xlsx";
        XlsxReader xlsxReader = new XlsxReader(path);
        return xlsxReader.dataOfUsers();
    }
}
