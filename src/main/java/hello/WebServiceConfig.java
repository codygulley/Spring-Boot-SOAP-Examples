package hello;

import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.soap.server.endpoint.SoapFaultDefinition;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {
    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean(name = "countries")
    public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema countriesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CountriesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(countriesSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema countriesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("countries.xsd"));
    }


    @Bean(name = "createWorkItemWithParties")
    public DefaultWsdl11Definition defaultWsdl14Definition(XsdSchema createWorkItemWithPartiesSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("CreateWorkItemWithPartiesPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(createWorkItemWithPartiesSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema createWorkItemWithPartiesSchema() {
        return new SimpleXsdSchema(new ClassPathResource("parties.xsd"));
    }




    @Bean(name = "stringTransform")
    public DefaultWsdl11Definition defaultWsdl12Definition(XsdSchema stringTransformSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("StringTransformPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(stringTransformSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema stringTransformSchema() {
        return new SimpleXsdSchema(new ClassPathResource("stringTransform.xsd"));
    }

    @Bean(name = "randomGenerator")
    public DefaultWsdl11Definition defaultWsdl13Definition(XsdSchema randomGeneratorSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("randomGeneratorPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(randomGeneratorSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema randomGeneratorSchema() {
        return new SimpleXsdSchema(new ClassPathResource("randomGenerator.xsd"));
    }

    @Bean(name = "generateUID")
    public DefaultWsdl11Definition defaultWsdl15Definition(XsdSchema generateUIDSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("generateUIDPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://spring.io/guides/gs-producing-web-service");
        wsdl11Definition.setSchema(generateUIDSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema generateUIDSchema() {
        return new SimpleXsdSchema(new ClassPathResource("generateUID.xsd"));
    }
}