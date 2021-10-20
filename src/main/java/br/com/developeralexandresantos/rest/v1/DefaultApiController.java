package br.com.developeralexandresantos.rest.v1;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-10-20T02:26:42.096-03:00[America/Sao_Paulo]")
@Controller
public class DefaultApiController implements DefaultApi {

    private final DefaultApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public DefaultApiController(DefaultApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public DefaultApiDelegate getDelegate() {
        return delegate;
    }
}
