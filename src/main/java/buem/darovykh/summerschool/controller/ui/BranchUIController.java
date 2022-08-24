package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.form.BranchForm;
import buem.darovykh.summerschool.form.ItemForm;
import buem.darovykh.summerschool.model.Branch;
import buem.darovykh.summerschool.model.Item;
import buem.darovykh.summerschool.service.branch.interfaces.IBranchService;
import buem.darovykh.summerschool.service.item.interfaces.IItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/branches/")
@Controller
public class BranchUIController {

    @Autowired
    IBranchService service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("branches", service.getAll());
        return "branches";
    }

    @GetMapping("del/{id}")
    public String deleteById(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/v1/branches/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addBranch(Model model){
        BranchForm branchForm = new BranchForm();
        model.addAttribute("form", branchForm);
        return "addBranch";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addBranch(@ModelAttribute("form") BranchForm form){
        Branch branch = new Branch();
        branch.setName(form.getName());
        branch.setDescription(form.getDescription());
        branch.setTitle(form.getTitle());
        branch.setAddress(form.getAddress());
        branch.setPhone(form.getPhone());
        service.create(branch);
        return "redirect:/ui/v1/branches/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateBranch(Model model, @PathVariable("id") String id){
        Branch branchToUpdate = service.get(id);
        BranchForm branchForm = new BranchForm();
        branchForm.setId(branchToUpdate.getId());
        branchForm.setName(branchToUpdate.getName());
        branchForm.setDescription(branchToUpdate.getDescription());
        branchForm.setUpdatedAt(branchToUpdate.getUpdatedAt());
        branchForm.setCreatedAt(branchToUpdate.getCreatedAt());
        branchForm.setTitle(branchToUpdate.getTitle());
        branchForm.setAddress(branchToUpdate.getAddress());
        branchForm.setPhone(branchToUpdate.getPhone());
        model.addAttribute("form", branchForm);
        return "updateBranch";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateBranch(@ModelAttribute("form") BranchForm form){
        Branch branchToUpdate = new Branch();
        branchToUpdate.setId(form.getId());
        branchToUpdate.setName(form.getName());
        branchToUpdate.setDescription(form.getDescription());
        branchToUpdate.setCreatedAt(LocalDateTime.now());
        branchToUpdate.setUpdatedAt(LocalDateTime.now());
        branchToUpdate.setTitle(form.getTitle());
        branchToUpdate.setAddress(form.getAddress());
        branchToUpdate.setPhone(form.getPhone());

        service.update(branchToUpdate);
        return "redirect:/ui/v1/branches/";
    }
}
