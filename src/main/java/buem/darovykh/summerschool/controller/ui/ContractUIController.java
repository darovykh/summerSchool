package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.form.ContractForm;
import buem.darovykh.summerschool.model.Contract;
import buem.darovykh.summerschool.service.contract.interfaces.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/contracts/")
@Controller
public class ContractUIController {

    @Autowired
    IContractService service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("contracts", service.getAll());
        return "contracts";
    }

    @GetMapping("del/{id}")
    public String deleteById(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/v1/contracts/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addContract(Model model){
        ContractForm contractForm = new ContractForm();
        model.addAttribute("form", contractForm);
        return "addContract";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContract(@ModelAttribute("form") ContractForm form){
        Contract contract = new Contract();
        contract.setName(form.getName());
        contract.setDescription(form.getDescription());
        contract.setSumInsured(form.getSumInsured()*100);
        contract.setTariffRate(form.getTariffRate()*100);
        service.create(contract);
        return "redirect:/ui/v1/contracts/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateContract(Model model, @PathVariable("id") String id){
        Contract contractToUpdate = service.get(id);
        ContractForm contractForm = new ContractForm();
        contractForm.setId(contractToUpdate.getId());
        contractForm.setName(contractToUpdate.getName());
        contractForm.setDescription(contractToUpdate.getDescription());
        contractForm.setUpdatedAt(contractToUpdate.getUpdatedAt());
        contractForm.setCreatedAt(contractToUpdate.getCreatedAt());
        contractForm.setSumInsured(contractToUpdate.getSumInsured()/100);
        contractForm.setTariffRate(contractToUpdate.getTariffRate()/100);
        model.addAttribute("form", contractForm);
        return "updateContract";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateContract(@ModelAttribute("form") ContractForm form){
        Contract contractToUpdate = new Contract();
        contractToUpdate.setId(form.getId());
        contractToUpdate.setName(form.getName());
        contractToUpdate.setDescription(form.getDescription());
        contractToUpdate.setCreatedAt(LocalDateTime.now());
        contractToUpdate.setUpdatedAt(LocalDateTime.now());
        contractToUpdate.setSumInsured(form.getSumInsured());
        contractToUpdate.setTariffRate(form.getTariffRate());

        service.update(contractToUpdate);
        return "redirect:/ui/v1/contracts/";
    }
}
