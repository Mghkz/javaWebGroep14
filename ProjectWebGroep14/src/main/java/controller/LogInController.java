/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.User;
import domain.UserManager;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Jeroen
 */
@Controller
@RequestMapping("/logIn.htm")
public class LogInController {
    
    @Autowired
    private UserManager userManager;

    @RequestMapping(method = RequestMethod.GET)
    public String showFormPage(Model model) {
        User u = new User();
        u.setPassword("");
        u.setUsername("");
        model.addAttribute("user", u);
        return "logInForm";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@Valid User user, BindingResult result) {
       
        if (result.hasErrors()) {
            return "logInForm";
        } else {

            return "overviewView";
            //return "redirect:/inventory.htm";
        }
    }
}
