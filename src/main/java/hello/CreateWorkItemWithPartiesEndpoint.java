package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.CreateWorkItemWithPartiesRequest;
import io.spring.guides.gs_producing_web_service.CreateWorkItemWithPartiesResponse;

@Endpoint
public class CreateWorkItemWithPartiesEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    private CreateWorkItemWIthParties createWorkItemWithParties;

    public CreateWorkItemWithPartiesEndpoint() {
       createWorkItemWithParties = new CreateWorkItemWIthParties();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createWorkItemWithPartiesRequest")
    @ResponsePayload
    public CreateWorkItemWithPartiesResponse createWorkItemWithParties(@RequestPayload CreateWorkItemWithPartiesRequest request) throws Exception {
        CreateWorkItemWithPartiesResponse response = new CreateWorkItemWithPartiesResponse();
        response.setWorkItemNumber(createWorkItemWithParties.createWorkItemWithParties());
        return response;
    }
}