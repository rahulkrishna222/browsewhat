package com.browsewhat.app.controllers.support;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.browsewhat.app.constant.messages.ApplicationMessages;
import com.browsewhat.app.db.entities.BwContactus;
import com.browsewhat.app.db.service.ContactUsService;
import com.browsewhat.app.entity.generator.EntityGenerator;
import com.browsewhat.app.factory.DBEntityGeneratorFactory;
import com.browsewhat.app.models.form.ContactUs;
import com.browsewhat.app.types.EntityType;
import com.browsewhat.app.utils.ReferenceIDGenerator;

@Controller
public class ContactUsController {

    @Autowired
    private ContactUsService             contactUsService;
    private EntityGenerator<BwContactus> entityGenerator = DBEntityGeneratorFactory.getEntityGenerator(EntityType.ContactUS);

    @RequestMapping(value = "/contactus.html", method = RequestMethod.GET)
    public String contactUs(Model model) {
        model.addAttribute("contactUsForm", new ContactUs());
        return "contact";

    }

    @RequestMapping(value = "/GetAnswer.html", method = RequestMethod.POST)
    public String contactUsSave(@Valid @ModelAttribute("contactUsForm") ContactUs contact, BindingResult result, Model model) {

        if (result.hasErrors()) {
            // result.
            return "contact";
        } else {
            BwContactus entityContactUs = contactUsService.insert(entityGenerator.convertServiceObjectToEntity(contact));
            if (entityContactUs != null) {
                model.addAttribute("Message",
                        ApplicationMessages.CONTACT_US_SAVE_SUCCESS + ReferenceIDGenerator.createContactUsTiket(entityContactUs.getId()));
            }
            return "thankyou";
        }

    }
    
    @RequestMapping(value = "/thankyou", method = RequestMethod.GET)
    public String sayThanks(Model model) {

        return "thankyou";

    }

    public void setContactUsService(ContactUsService contactUsService) {
        this.contactUsService = contactUsService;
    }

    public ContactUsService getContactUsService() {
        return contactUsService;
    }

}
