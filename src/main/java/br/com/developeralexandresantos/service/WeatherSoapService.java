package br.com.developeralexandresantos.service;

import br.com.developeralexandresantos.model.NumberToWordsResponseType;
import br.com.developeralexandresantos.wsclient.NumberConversionSoapType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class WeatherSoapService{

    @Autowired
    private NumberConversionSoapType numberConversionSoapType;

    public NumberToWordsResponseType obterConversao(Integer numero) {
        BigInteger ubiNum = BigInteger.valueOf(numero);
        String resultado = numberConversionSoapType.numberToWords(ubiNum);
        NumberToWordsResponseType response = new NumberToWordsResponseType();
        response.setResultado(resultado);
        return response;
    }
}
