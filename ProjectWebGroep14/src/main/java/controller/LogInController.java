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

/**
 *
 * @author Jeroen
 */
@Controller
public class LogInController {

    @RequestMapping(method = RequestMethod.GET)
    public String showFormPage(Model model) {
        return "logInForm";
    }

//        @RequestMapping(method = RequestMethod.GET)
//    public String showFormPage(Model model) {
//        Price price = new Price();
//        price.setPercentDecrease(20);
//        price.setPercentIncrease(10);
//        model.addAttribute("price", price);
//        return "priceChange";
//    }
//    @RequestMapping(method = RequestMethod.POST)
//    public String processRegistration(@Valid Price price, BindingResult result) {
//        percentageValidator.validate(price, result);
//        if (result.hasErrors()) {
//            return "priceChange";
//        } else {
//            productManager.increasePrice(price.getPercentIncrease());
//            productManager.decreasePrice(price.getPercentDecrease());
//            return "redirect:/inventory.htm";
//        }
//    }
}
