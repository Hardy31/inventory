package org.trk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trk.entity.Position;
import org.trk.repository.PositionRepository;

@RestController
public class MainController {
    @Autowired
    private  PositionRepository positionRepository;

    public MainController(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }


    //        http://localhost:8080/qr/
    @GetMapping("/qr")
    public String getCode() {
        String res = "QR cude " ;
        Position tmc = positionRepository.findById(1).get();
        System.out.println(tmc.toString());
        return tmc.toString();
    }


    //    http://localhost:8080/qr/1380882
//    http://localhost:8080/qr/24204201200001
//    http://localhost:8080/qr/9395171 (3440321400001)
    @GetMapping("/qr/{code}")
    public String getById(@PathVariable String code) {
        Position tmc = positionRepository.findByCode(code).get();
        System.out.println(tmc);

        return tmc.toString();
    };

    //    http://localhost:8080/id/1
    @GetMapping("/id/{id}")
    public String getById(@PathVariable int id) {

        System.out.println("Id : " + id);

        Position tmc = positionRepository.getById(id);

        System.out.println(tmc.toString());

        return tmc.toString();
    }




    //    http://localhost:8080/create
    @GetMapping("/create")
    public String create() {

        Position createTMC = new Position(650, "888888888", "Описание на русском", "Локация", "Баланс");
//        Position createTMC = new Position(null, "888888888", "Описание на русском", "Локация", "Баланс");
//        Position createTMC = new Position( "888888888", "Описание на русском", "Локация", "Баланс");

        System.out.println("---" + createTMC.toString());


        Position save = positionRepository.save(createTMC);
//
        System.out.println(save.toString());

        return save.toString();
    }

}
