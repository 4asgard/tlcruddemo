package com.example.tlcruddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index(){
        return "Wyświetlam odpowiedź z kontrolera";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Endpoint: Hello";
    }

    @GetMapping("/rateCar")
    public String rateMyCar(String carName){
        if (Objects.equals(carName, "Ferrari")) {
            return "Zazdro";
        } else if (Objects.equals(carName, "Passat")){
            return "Prawdziwy Polak";
        } else {
            return "Co to za złom";
        }
    }

    @GetMapping("/passat")
    public String getPassat(){
        Car passat = new Car();
        passat.producer = "vw";
        passat.model = "passerati";
        passat.yearOfProduction = 2001;
        passat.millage = 87000.0;

        return passat.toString();
    }

    @GetMapping("/fiat")
    public Car getFiat(){
        Car fiat = new Car();
        fiat.producer = "Fiat";
        fiat.model = "Punto";
        fiat.yearOfProduction = 2011;
        fiat.millage = 287000.0;

        System.out.println(fiat);

        return fiat;
    }


    @GetMapping("/myCars")
    public List<String> getMyCars(){
        List<String> myCarsList = new ArrayList<String>();
        myCarsList.add("Kia");
        myCarsList.add("Volvo");
        myCarsList.add("Mercedes");

        for (String cars : myCarsList) {
            System.out.println(cars);
        }

        return myCarsList;
    }

//    @GetMapping("/myCar")
//    public String showMyCar(){
//        Car mycar = new Car("Kia", "Ceed", 2018);
//        System.out.println(mycar);
//        return String.valueOf(mycar);
//    }

}

