package com.superb.EcomStore;

import com.superb.EcomStore.model.Inquiry;
import com.superb.EcomStore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {


    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("inquiry", new Inquiry());
        return "index";

            }


    @GetMapping("/trainer")
    public String trainer(Model model){

        model.addAttribute("trainers", homeService.getTrainers());

        return "trainer";

    }

    @PostMapping("/trainer")
    public String searchTrainer(Model model, @ModelAttribute Inquiry inquiry){


        String trainerName = inquiry.getSearchString();
        model.addAttribute("trainers", homeService.searchedTrainers(trainerName));

        return "trainer";

    }

    @GetMapping("/why")
    public String why(){
        return "why";

    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";

    }
}
