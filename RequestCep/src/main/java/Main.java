import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class Main {
    public static void main(String[] args) {
        String url = "https://viacep.com.br/ws/01311200/json/";

        try {
            CloseableHttpClient httpClient = HttpClientBuilder.create().build();
            CloseableHttpResponse response = httpClient.execute(new HttpGet(url));
            String responseString = EntityUtils.toString(response.getEntity());
            System.out.println(responseString);
        } catch (Exception e) {
            System.out.println("Erro ao fazer requisição: " + e.getMessage());
        }

    }
}
