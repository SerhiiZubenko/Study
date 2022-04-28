import org.testng.annotations.DataProvider;

public class DataProviderObject {

    @DataProvider
    public Object [][] getEmailAndPassword(){
        Object [][] user = {{"user1", "password1"},
                {"user2", "password2"},
                {"user3", "password3"}};
        return user;
    }
}
