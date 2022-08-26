package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.form.SalaryForm;
import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.model.Salary;
import buem.darovykh.summerschool.service.salary.interfaces.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/salarys/")
@Controller
@CrossOrigin
public class SalaryUIController {

    @Autowired
    ISalaryService service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("salarys", service.getAll());
        return "salarys";
    }

    @GetMapping("del/{id}")
    public String deleteById(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/v1/salarys/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addSalary(Model model){
        SalaryForm salaryForm = new SalaryForm();
        model.addAttribute("form", salaryForm);
        return "addSalary";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addSalary(@ModelAttribute("form") SalaryForm form){
        Salary salary = new Salary();
        salary.setName(form.getName());
        salary.setDescription(form.getDescription());
        Agent agent = new Agent(form.getAgentId(), null, null, null, null,
                null, null,null, null, null, null);
        salary.setAgent(agent);
        salary.setSalary(form.getSalary());
        salary.setContractBonus(form.getContractBonus());
        salary.setFrom(form.getFrom());
        salary.setTo(form.getTo());
        service.create(salary);
        return "redirect:/ui/v1/salarys/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateSalary(Model model, @PathVariable("id") String id){
        Salary salaryToUpdate = service.get(id);
        SalaryForm salaryForm = new SalaryForm();
        salaryForm.setId(salaryToUpdate.getId());
        salaryForm.setName(salaryToUpdate.getName());
        salaryForm.setDescription(salaryToUpdate.getDescription());
        salaryForm.setUpdatedAt(salaryToUpdate.getUpdatedAt());
        salaryForm.setCreatedAt(salaryToUpdate.getCreatedAt());
        model.addAttribute("form", salaryForm);
        return "updateSalary";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateSalary(@ModelAttribute("form") SalaryForm form){
        Salary salaryToUpdate = new Salary();
        salaryToUpdate.setId(form.getId());
        salaryToUpdate.setName(form.getName());
        salaryToUpdate.setDescription(form.getDescription());
        salaryToUpdate.setCreatedAt(LocalDateTime.now());
        salaryToUpdate.setUpdatedAt(LocalDateTime.now());

        service.update(salaryToUpdate);
        return "redirect:/ui/v1/salarys/";
    }
}
