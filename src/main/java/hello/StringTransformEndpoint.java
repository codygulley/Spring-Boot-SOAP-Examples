package hello;

import io.spring.guides.gs_producing_web_service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
//
//import io.spring.guides.gs_producing_web_service.GetStringTransformResponse;
//import io.spring.guides.gs_producing_web_service.GetStringTransformRequest;


@Endpoint
public class StringTransformEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    private StringTransform stringTransform = new StringTransform();

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "reverseStringRequest")
    @ResponsePayload
    public ReverseStringResponse reverseString(@RequestPayload ReverseStringRequest request) throws Exception {
        ReverseStringResponse response = new ReverseStringResponse();
        response.setTransformedString(stringTransform.reverseString(request.getString()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "toUppercaseRequest")
    @ResponsePayload
    public ToUppercaseResponse toUppercase(@RequestPayload ToUppercaseRequest request) throws Exception {
        ToUppercaseResponse response = new ToUppercaseResponse();
        response.setTransformedString(stringTransform.toUppercase(request.getString()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "toLowercaseRequest")
    @ResponsePayload
    public ToLowercaseResponse toLowercase(@RequestPayload ToLowercaseRequest request) throws Exception {
        ToLowercaseResponse response = new ToLowercaseResponse();
        response.setTransformedString(stringTransform.toLowercase(request.getString()));
        return response;
    }
}