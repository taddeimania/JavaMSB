package io.joel.controllers;

import io.joel.dao.AirplaneDao;
import io.joel.model.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by taddeimania on 9/8/17.
 */
@RestController
public class AirplaneController {

    @Autowired
    AirplaneDao airplaneDao;

    @RequestMapping("/api/airplanes")
    public List<Airplane> getAirplanes() {
        return airplaneDao.findAll();
    }
}
