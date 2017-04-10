import org.junit.Test;

/**
 * Created by LIYU on 2017/4/10.
 */
public class HttpRequestTest {
    @Test
    public void sendPost() throws Exception {
        HttpRequest httpRequest = new HttpRequest();
        String backdata2 = httpRequest.sendPost("http://127.0.0.1:9090/users/customers","user=1");
        System.out.println("String backdata2 = "+backdata2);
    }

    @Test
    public void sendGet() throws Exception {
        HttpRequest httpRequest = new HttpRequest();
        String backdata = httpRequest.sendGet("http://127.0.0.1:9090/users/1","");
        System.out.println(backdata);

    }


}