package com.example.portefolio.Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PortController {
    @GetMapping("/")
    @ResponseBody
    public void portfolio(){ }
    @GetMapping("portfolio1/edu")
    @ResponseBody
    public void portfolioJobs(){}
    @GetMapping("portfolio1/job")
    @ResponseBody
    public void portfolioGit(){}
    @GetMapping("/git")
    @ResponseBody
    public void portfolioInfo(){}
    @GetMapping("/info")
    @ResponseBody
    public void portfolioEdu(){}




}
