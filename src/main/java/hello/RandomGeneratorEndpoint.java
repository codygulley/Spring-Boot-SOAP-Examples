package hello;

import io.spring.guides.gs_producing_web_service.*;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class RandomGeneratorEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    private RandomGenerator randomGenerator = new RandomGenerator();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "randomNumberRequest")
    @ResponsePayload
    public RandomNumberResponse reverseString(@RequestPayload RandomNumberRequest request) throws Exception {
        RandomNumberResponse response = new RandomNumberResponse();
        response.setRandomNumber(randomGenerator.setRandomNumber());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "randomStringRequest")
    @ResponsePayload
    public RandomStringResponse reverseString(@RequestPayload RandomStringRequest request) throws Exception {
        RandomStringResponse response = new RandomStringResponse();
        response.setRandomString(randomGenerator.setRandomString());
        return response;
    }

}