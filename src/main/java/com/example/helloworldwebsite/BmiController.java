package com.example.helloworldwebsite;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BmiController
{
    @GetMapping("/bmi")
    public String Bmi(Model model)
    {
        model.addAttribute("bmiInformationDto", new BmiInformationDto());
        return "Bmi";
    }

    @PostMapping("/calculate")
    public String Calculate(BmiInformationDto bmiInformationDto, Model model)
    {
        double result = bmiInformationDto.getWeight() / (bmiInformationDto.getHeight() * bmiInformationDto.getHeight());
        model.addAttribute("result", result);
        return "Result";
    }
}