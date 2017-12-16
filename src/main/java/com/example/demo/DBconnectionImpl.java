package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by Artur.harutyunyan on 12/14/2017.
 */
@Component
public class DBconnectionImpl implements DBconnection{


    @Override
    public void connect(String url) {
        System.out.println(url);
    }

    @PreDestroy
    void Destror (){System.out.println("Destroyed");}
}
