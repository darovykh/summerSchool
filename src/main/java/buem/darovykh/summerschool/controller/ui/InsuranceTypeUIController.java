package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.form.InsuranceTypeForm;
import buem.darovykh.summerschool.model.InsuranceType;
import buem.darovykh.summerschool.service.insuranceType.interfaces.IInsuranceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/insuranceTypes/")
@Controller
@CrossOrigin
public class InsuranceTypeUIController {

    @Autowired
    IInsuranceTypeService service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("insuranceTypes", service.getAll());
        return "insuranceTypes";
    }

    @GetMapping("del/{id}")
    public String deleteById(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/v1/insuranceTypes/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addInsuranceType(Model model){
        InsuranceTypeForm insuranceTypeForm = new InsuranceTypeForm();
        model.addAttribute("form", insuranceTypeForm);
        return "addInsuranceType";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addInsuranceType(@ModelAttribute("form") InsuranceTypeForm form){
        InsuranceType insuranceType = new InsuranceType();
        insuranceType.setName(form.getName());
        insuranceType.setDescription(form.getDescription());
        insuranceType.setTypeName(form.getTypeName());
        insuranceType.setAgentSalaryPercent(form.getAgentSalaryPercent()*100);
        service.create(insuranceType);
        return "redirect:/ui/v1/insuranceTypes/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateInsuranceType(Model model, @PathVariable("id") String id){
        InsuranceType insuranceTypeToUpdate = service.get(id);
        InsuranceTypeForm insuranceTypeForm = new InsuranceTypeForm();
        insuranceTypeForm.setId(insuranceTypeToUpdate.getId());
        insuranceTypeForm.setName(insuranceTypeToUpdate.getName());
        insuranceTypeForm.setDescription(insuranceTypeToUpdate.getDescription());
        insuranceTypeForm.setUpdatedAt(insuranceTypeToUpdate.getUpdatedAt());
        insuranceTypeForm.setCreatedAt(insuranceTypeToUpdate.getCreatedAt());
        insuranceTypeForm.setTypeName(insuranceTypeToUpdate.getTypeName());
        insuranceTypeForm.setAgentSalaryPercent(insuranceTypeToUpdate.getAgentSalaryPercent());
        model.addAttribute("form", insuranceTypeForm);
        return "updateInsuranceType";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateInsuranceType(@ModelAttribute("form") InsuranceTypeForm form){
        InsuranceType insuranceTypeToUpdate = new InsuranceType();
        insuranceTypeToUpdate.setId(form.getId());
        insuranceTypeToUpdate.setName(form.getName());
        insuranceTypeToUpdate.setDescription(form.getDescription());
        insuranceTypeToUpdate.setCreatedAt(LocalDateTime.now());
        insuranceTypeToUpdate.setUpdatedAt(LocalDateTime.now());
        insuranceTypeToUpdate.setTypeName(form.getTypeName());
        insuranceTypeToUpdate.setAgentSalaryPercent(form.getAgentSalaryPercent());

        service.update(insuranceTypeToUpdate);
        return "redirect:/ui/v1/insuranceTypes/";
    }
}
