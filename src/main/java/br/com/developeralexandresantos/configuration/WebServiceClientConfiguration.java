package br.com.developeralexandresantos.configuration;

import br.com.developeralexandresantos.wsclient.NumberConversionSoapType;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class WebServiceClientConfiguration {
    @Value("${service.endpoint.conversaoWS}")
    private String conversaoWS;

    @Bean(name = "envelopeProxyConversaoWS")
    public NumberConversionSoapType envelopeProxyConversaoWS() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(NumberConversionSoapType.class);
        jaxWsProxyFactoryBean.setAddress(conversaoWS);
        return (NumberConversionSoapType) jaxWsProxyFactoryBean.create();
    }

}
