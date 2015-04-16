/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Klas;
import domain.KlasManager;
import domain.Leerling;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Jeroen
 */
@Controller
@RequestMapping("/leerling.htm")
public class LeerlingController {

    @Autowired
    private KlasManager klasManager;

    @RequestMapping(method = RequestMethod.GET)
    public String doGet(@RequestParam("klasNaam") String klasNaam, Model model) {
        final String klNaam = klasNaam;
        Optional<Klas> klas = klasManager.getItems().stream().filter(k -> k.getNaam().equals(klNaam)).findFirst();
        if (klas.isPresent()) {
            Klas k = klas.get();
            List<Leerling> leerlingen = k.getLeerlingen();
            model.addAttribute("klasNaam", k.getNaam());
            model.addAttribute("leerlingen", leerlingen);
            return "leerlingOverview";
        } else {
            return "redirect:/klas";
        }

    }

}
