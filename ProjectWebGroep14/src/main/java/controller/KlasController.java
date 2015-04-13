/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Klas;
import domain.KlasManager;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Jeroen
 */
@Controller
@RequestMapping("/klas.htm")
public class KlasController {

    @Autowired
    private KlasManager klasManager;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(Model model) {
        List<Klas> klassen = klasManager.getItems();
        model.addAttribute("klassen", klassen);
        return "klasOverview";

    }

}
