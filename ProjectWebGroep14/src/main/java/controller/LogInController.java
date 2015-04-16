/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Jeroen
 */
@Controller
@RequestMapping("/login.htm")
public class LogInController {
//    
//    @Autowired
//    private UserManager userManager;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout) {

        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Ongeldige gebruikersnaam en paswoord combinatie!");
        }

        if (logout != null) {
            model.addObject("msg", "Succesvol uigelogd.");
        }
        model.setViewName("login");

        return model;

    }
}
