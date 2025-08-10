package com.hospital.hospitalmanagement.controllller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.hospitalmanagement.enntitiy.Patient;
import com.hospital.hospitalmanagement.seerviice.DataService;

@Controller
@RequestMapping("/hospital")
public class DataControlller {

    @Autowired
    private DataService dataService;
    @GetMapping("/")
    public String index() {
        return "home";
    }
    @GetMapping("/home")
    public String homePage() {
        return "form";
    }

    @PostMapping("/save")
    public String savePatient(@ModelAttribute Patient patient) {
        dataService.savePatients(patient);
        return "redirect:/hospital/details";
    }

    @GetMapping("/details")
    public String showDetailsPage(Model model) {
        model.addAttribute("data", dataService.allDetails());
        return "details";
    }

    @GetMapping("/form")
    public String showPatientForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "form";
    }

    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model) {
        Patient patient = dataService.getBySno(id);
        model.addAttribute("patient", patient);
        return "edit";
    }

    @PostMapping("/update")
    public String updatePatient(@ModelAttribute Patient patient) {
        dataService.savePatients(patient);
        return "redirect:/hospital/details";
    }

    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        dataService.delete(id);
        return "redirect:/hospital/details";
    }
}
