/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.KlasManager;
import domain.Leerling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Jeroen
 */
@Controller
@RequestMapping("/resultaat.htm")
public class ResultaatController {

    @Autowired
    private KlasManager klasManager;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(@RequestParam("leerlingId") int id, Model model) {

        Leerling l = klasManager.getLeerling(id);
        model.addAttribute("leerling", l);
        return "resultaatView";
    }
}
