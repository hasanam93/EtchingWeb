package com.etchingweb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.etchingweb.model.EtchingIT;
import com.etchingweb.model.EtchingITCredentials;
import com.etchingweb.model.Experience;
import com.etchingweb.service.EtchingITService;

@Controller
public class MyController {
	
	
	
	@Autowired
	private EtchingITService etchingitservice;

	public EtchingITService getEtchingitservice() {
		return etchingitservice;
	}

	public void setEtchingitservice(EtchingITService etchingitservice) {
		this.etchingitservice = etchingitservice;
	}


	

	
	@RequestMapping(value = { "/", "/home" },method=RequestMethod.GET)
	public String homePage(){
		return "home";
	}
	@RequestMapping(value ="/login" ,method=RequestMethod.GET)
	public String loginPage(Model model){
		model.addAttribute("etchingitcredentials", new EtchingITCredentials());
		return "login";
	}

	@RequestMapping(value ="/register" ,method=RequestMethod.GET)
	public String registerPage(Model model){
		model.addAttribute("etchingit", new EtchingIT());
		return "register";
	}

	@RequestMapping(value ="/registerSuccess" ,method=RequestMethod.POST)
	public ModelAndView registerSuccess(@Valid @ModelAttribute("etchingit") EtchingIT etchingit,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("register");
		}
		getEtchingitservice().registerEtchingIT(etchingit);
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("etchingit", etchingit);
		return modelAndView;
	}
	@RequestMapping(value ="/loginSuccess" ,method=RequestMethod.POST)
	public ModelAndView loginSuccess(@Valid @ModelAttribute("etchingitcredentials") EtchingITCredentials etchingitcredentials,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return new ModelAndView("login");
		}
		
		ModelAndView modelAndView = new ModelAndView("welcome");
		EtchingIT etchingit = getEtchingitservice().validateEtchingITCredential(etchingitcredentials.getEmail(), etchingitcredentials.getPassword());
		if(etchingit!= null){
			modelAndView.addObject("etchingit", etchingit);
			return modelAndView;
		}else{
			 modelAndView = new ModelAndView("notFound");
		}
		return modelAndView;
	}
	
	@ModelAttribute
	public void headerMessage(Model model){

		
		
		
		List<String> stateList = new ArrayList<>();
	
stateList.add("Alabama"); 
stateList.add("Alaska");
stateList.add("Arizona"); 
stateList.add("Arkansas");
stateList.add("California"); 
stateList.add("Colorado"); 
stateList.add("Connecticut"); 
stateList.add("Delaware"); 
stateList.add("Florida"); 
stateList.add("Georgia"); 
stateList.add("Hawaii"); 
stateList.add("Idaho"); 
stateList.add("Illinois Indiana"); 
stateList.add("Iowa"); 
stateList.add("Kansas"); 
stateList.add("Kentucky"); 
stateList.add("Louisiana"); 
stateList.add("Maine"); 
stateList.add("Maryland"); 
stateList.add("Massachusetts"); 
stateList.add("Michigan"); 
stateList.add("Minnesota"); 
stateList.add("Mississippi"); 
stateList.add("Missouri"); 
stateList.add("Montana Nebraska"); 
stateList.add("Nevada"); 
stateList.add("New Hampshire"); 
stateList.add("New Jersey"); 
stateList.add("New Mexico"); 
stateList.add("New York"); 
stateList.add("North Carolina"); 
stateList.add("North Dakota"); 
stateList.add("Ohio"); 
stateList.add("Oklahoma"); 
stateList.add("Oregon"); 
stateList.add("Pennsylvania Rhode Island"); 
stateList.add("South Carolina"); 
stateList.add("South Dakota"); 
stateList.add("Tennessee"); 
stateList.add("Texas"); 
stateList.add("Utah"); 
stateList.add("Vermont"); 
stateList.add("Virginia"); 
stateList.add("Washington"); 
stateList.add("West Virginia"); 
stateList.add("Wisconsin"); 
stateList.add("Wyoming");
		
	
		model.addAttribute("stateList", stateList);
	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(Model model) {
        return "home";
    }
	
	@RequestMapping(value = "/experience", method = RequestMethod.GET)
	public String experiencePage(Model model){
		model.addAttribute("experience", new Experience());
		return "experience";
	}
	
	@RequestMapping(value="/etchingitt", method=RequestMethod.POST)
	public ModelAndView create(@Valid @ModelAttribute("experience")Experience experience, BindingResult bindingResult)
	 {
		if(bindingResult.hasErrors()){
			return new ModelAndView("experience");
		}
	  
		getEtchingitservice().registerExperience(experience);
		ModelAndView modelAndView = new ModelAndView("experience");
		modelAndView.addObject("experience", experience);
		return modelAndView;
	 }
}
