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
            model.addObject("error", "Invalid username and password!");
        }

        if (logout != null) {
            model.addObject("msg", "You've been logged out successfully.");
        }
        model.setViewName("login");

        return model;

    }

//    @RequestMapping(method = RequestMethod.POST)
//    public ModelAndView post(
//            @RequestParam(value = "error", required = false) String error,
//            @RequestParam(value = "logout", required = false) String logout) {
//
//        ModelAndView model = new ModelAndView();
//        if (error != null) {
//            model.addObject("error", "Invalid username and password!");
//            model.setViewName("login");
//        }
//
//        if (logout != null) {
//            model.addObject("msg", "You've been logged out successfully.");
//            model.setViewName("login");
//        }
//        if (error != null && logout != null) {
//            model.setViewName("klas");
//        }
//
//        return model;
//
//    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String showFormPage(Model model) {
//        User u = new User();
//        u.setPassword("");
//        u.setUsername("");
//        model.addAttribute("user", u);
//        return "logInForm";
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public String processRegistration(@Valid User user, BindingResult result) {
//       
//        if (result.hasErrors()) {
//            return "logInForm";
//        } else {
//
////            return "overviewView";
//            return "redirect:/klas.htm";
//        }
//    }
}
