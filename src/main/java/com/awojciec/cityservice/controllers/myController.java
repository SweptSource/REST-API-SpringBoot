package com.awojciec.cityservice.controllers;

import com.awojciec.cityservice.models.Address;
import com.awojciec.cityservice.models.Session;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.xml.ws.Response;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/my")
public class myController {

    private String myData;

    private Address address;

    public myController() {
    }


    @GetMapping
    @RequestMapping("/json")
    public String getJSON() throws IOException {

        address = new Address("83-110", "pln");
        address.setId(3L);

        //stworzenie json z objektu
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writer();
        //objectWriter.writeValue(System.out, address);
        String jsonStr = objectWriter.writeValueAsString (address);

        return jsonStr;
    }

    @GetMapping
    public String getData() {
        myData ="To sa moje dane";
        return myData;
    }

}
