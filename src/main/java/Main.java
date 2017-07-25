
import com.google.gdata.client.*;
import com.google.gdata.client.photos.*;
import com.google.gdata.data.*;
import com.google.gdata.data.media.*;
import com.google.gdata.data.photos.*;
import com.google.gdata.util.AuthenticationException;

public class Main {

    public static void main(String[] args) throws AuthenticationException {

        PicasawebService myService = new PicasawebService("exampleCo-exampleApp-1");
        myService.setUserCredentials("menyhartabraham@gmail.com", "mypassword");
    }
}
