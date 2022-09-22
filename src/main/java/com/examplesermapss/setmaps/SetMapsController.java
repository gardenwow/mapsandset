package com.examplesermapss.setmaps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class SetMapsController {
    private final SetMapService setMapService;

    public SetMapsController(SetMapService setMapService) {
        this.setMapService = setMapService;
    }


    @GetMapping(path = "/omg")
    public String hello(){
        return "hello man, u can use this program";
    }

    @GetMapping(path = "/oddnumber")
    public List <Integer> oddnumber(){
        return setMapService.oddNumber();
    }
    @GetMapping(path = "/evennumber")
    public SortedSet<Integer> evennumber(){
        return setMapService.evenNumber();
    }
    @GetMapping(path = "/dublicate")
    public Set<String> dublicate(){
        return setMapService.dublicate();
    }
    @GetMapping(path = "/count")
    public Integer count() {
        return setMapService.numberDubl();
    }

}
