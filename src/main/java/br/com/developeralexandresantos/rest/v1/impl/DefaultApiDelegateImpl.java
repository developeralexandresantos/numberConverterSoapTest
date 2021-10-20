package br.com.developeralexandresantos.rest.v1.impl;

import br.com.developeralexandresantos.model.NumberToWordsResponseType;
import br.com.developeralexandresantos.rest.v1.DefaultApiDelegate;
import br.com.developeralexandresantos.service.WeatherSoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class DefaultApiDelegateImpl implements DefaultApiDelegate {

    @Autowired
    public WeatherSoapService service;

    @Override
    public CompletableFuture<ResponseEntity<NumberToWordsResponseType>> obterConversao(Integer numero) {
        HttpStatus status = HttpStatus.OK;
        return CompletableFuture.completedFuture(new ResponseEntity<>(service.obterConversao(numero), status));
    }
}
