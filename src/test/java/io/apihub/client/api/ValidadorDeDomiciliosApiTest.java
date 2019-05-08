package io.apihub.client.api;

import io.apihub.client.ApiClient;
import io.apihub.client.ApiException;
import io.apihub.client.model.Domicilio;
import io.apihub.client.model.Persona;
import io.apihub.client.model.Respuesta;
import io.apihub.client.model.Domicilio.EstadoEnum;
import io.apihub.interceptor.SignerInterceptor;
import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;

public class ValidadorDeDomiciliosApiTest {

    private final ValidadorDeDomiciliosApi api = new ValidadorDeDomiciliosApi();
    private ApiClient apiClient;

    @Before()
    public void setUp() {
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
              .readTimeout(30, TimeUnit.SECONDS)
              .addInterceptor(new SignerInterceptor())
              .build();
        apiClient.setHttpClient(okHttpClient);
    }

    @Test
    public void getValidadorTest() throws ApiException {
        String xApiKey = "XXXXXXXXXXX";
        String username = "XXXXXXXXXXX";
        String password = "XXXXXXXXXXX";
        Persona body = new Persona();
        Domicilio dom = new Domicilio();

        body.setPrimerNombre(null);
        body.setSegundoNombre(null);
        body.setApellidoPaterno("XXXXXXXXXXX");
        body.setApellidoMaterno("XXXXXXXXXXX");
        body.setApellidoAdicional(null);
        body.setFechaNacimiento("YYYY-MM-DD");
        body.setRfc("XXXXXXXXXXX");
        body.setCurp(null);
        dom.setDireccion("XXXXXXXXXXX");
        dom.setColonia("XXXXXXXXXXX");
        dom.setCiudad("XXXXXXXXXXX");
        dom.setCodigoPostal("XXXXXXXXXXX");
        dom.setMunicipio("XXXXXXXXXXX");
        dom.setEstado(EstadoEnum.DF);
        body.setDomicilio(dom);

        try {
            Respuesta response = api.getValidador(xApiKey, username, password, body);
            System.out.println(response.toString());
        } catch (ApiException e) {
            e.printStackTrace();
            System.out.println(e.getResponseBody());
        }
    }
}
