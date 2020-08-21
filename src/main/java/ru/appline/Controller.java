package ru.appline;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public Map<String, String> map = new HashMap<String, String>();
    {
        map.put("North", "");
        map.put("Northeast", "");
        map.put("East", "");
        map.put("Southeast", "");
        map.put("South", "");
        map.put("Southwest", "");
        map.put("West", "");
        map.put("Northwest", "");
    }

    @PostMapping(value = "/insertSides", consumes = "application/json")
    public void insertSides(@RequestBody Map<String, String> sides) {
        map.put("North", sides.get("North"));
        map.put("Northeast", sides.get("Northeast"));
        map.put("East", sides.get("East"));
        map.put("Southeast", sides.get("Southeast"));
        map.put("South", sides.get("South"));
        map.put("Southwest", sides.get("Southwest"));
        map.put("West", sides.get("West"));
        map.put("Northwest", sides.get("Northwest"));
    }

    @GetMapping(value = "/getAll", produces = "application/json")
    public Map<String, String> getAll() {
        return map;
    }

    @GetMapping(value = "/defineSide", produces = "application/json")
    public Map<String, String> defineSide (@RequestBody Map<String, String> model) {

        Map<String, String> result = new HashMap<String, String>();
        result.put("Side", "");

        int point = Integer.parseInt(model.get("Degree"));
        String text = "";
        int a = 0;
        int b = 0;


        //North
        text = map.get("North");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "North");
        }

        //Northeast
        text = map.get("Northeast");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "Northeast");
        }

        //East
        text = map.get("East");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "East");
        }

        //Southeast
        text = map.get("Southeast");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "Southeast");
        }

        //South
        text = map.get("South");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "South");
        }

        //Southwest
        text = map.get("Southwest");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "Southwest");
        }

        //West
        text = map.get("West");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "West");
        }

        //Northwest
        text = map.get("Northwest");
        a = Integer.parseInt(text.split("-")[0]);
        b = Integer.parseInt(text.split("-")[1]);
        if(point > a && point < b) {
            result.put("Side", "Northwest");
        }

        return result;
    }




}
