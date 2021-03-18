package com.cristian;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.cristian.ExemploService")
public class ExemploServiceImpl implements ExemploService {

    @WebMethod
    public String returnName() {
        return "Cristian Passos da Silva";
    }
}