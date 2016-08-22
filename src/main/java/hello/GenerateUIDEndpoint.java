package hello;

import io.spring.guides.gs_producing_web_service.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class GenerateUIDEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    private GenerateUID generateUID = new GenerateUID();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "generateUIDRequest")
    @ResponsePayload
    public GenerateUIDResponse generateUID(@RequestPayload GenerateUIDRequest request) throws Exception {
        GenerateUIDResponse response = new GenerateUIDResponse();
        response.setUID(generateUID.generateNewUID());
        return response;
    }
}