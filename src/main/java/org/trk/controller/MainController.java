package org.trk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.trk.entity.Position;
import org.trk.repository.PositionRepository;

import java.util.List;
@Slf4j
@RestController
public class MainController {
    @Autowired
    private  PositionRepository positionRepository;

    public MainController(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    //        http://localhost:8080/qr/
    @GetMapping("/all")
    public List<Position> getAll() {
        return  positionRepository.findAll();
    }

    //        http://localhost:8080/qr/
    @GetMapping("/id/{id}")
    public Position getCode(@PathVariable String id) {
        return positionRepository.findById(Integer.valueOf(id)).get();
    }


    //    http://localhost:8080/qr/1380882
//    http://localhost:8080/qr/24204201200001
//    http://localhost:8080/qr/9395171 (3440321400001)
    @GetMapping("/code/{code}")
    public Position getById(@PathVariable String code) {

        return positionRepository.findByCode(code).get();
    };




    //    http://localhost:8080/create
    @PostMapping("/create")
    public Position create(@RequestBody Position newPosition) {


        return positionRepository.save(newPosition);
    }


    //    http://localhost:8080/create
    @DeleteMapping("/id/{id}")
    public void delete (@PathVariable Integer id) {
         positionRepository.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public Position update(@PathVariable Integer id, @RequestBody Position correctedPosition){
        Position position = positionRepository.findById(id).get();
        position.setCode(correctedPosition.getCode());
        position.setDescription(correctedPosition.getDescription());
        position.setLocation(correctedPosition.getLocation());
        position.setTag(correctedPosition.getTag());
        log.info("------------ {}", position);
        return positionRepository.save(position);
    }

    @GetMapping("/addComponent/{id}/in/{mainId}")
    public Position updateComponent(@PathVariable Integer id, @PathVariable Integer mainId){
        Position position = positionRepository.findById(mainId).get();
        Position component =  positionRepository.findById(id).get();
        Position mainCmponent =  position;
        mainCmponent.getComponents().add(component);
        log.info("------------ {}", mainCmponent);
        BeanUtils.copyProperties(mainCmponent, position, "id");
        return positionRepository.save(position);
    }


}
