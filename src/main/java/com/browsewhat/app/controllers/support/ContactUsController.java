package com.browsewhat.app.controllers.support;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.browsewhat.app.models.form.ContactUs;

@Controller
public class ContactUsController {

	@RequestMapping(value = "/contactus.html", method = RequestMethod.GET)
	public String contactUs(Model model) {
		model.addAttribute("contactUsForm", new ContactUs());
		return "contact";

	}
	
	@RequestMapping(value = "/GetAnswer.html", method = RequestMethod.POST)
	public String contactUsSave(@Valid @ModelAttribute("contactUsForm") ContactUs contact, BindingResult result) {
		
		if (result.hasErrors()) {
			//result.
			return "contact";
		} else {
			return "redirect:/index.html";
		}

	}
}
