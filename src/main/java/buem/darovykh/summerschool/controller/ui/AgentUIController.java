package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.form.AgentForm;
import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.model.BranchLog;
import buem.darovykh.summerschool.service.agent.interfaces.IAgentService;
import buem.darovykh.summerschool.service.branchLog.interfaces.IBranchLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/agents/")
@Controller
@CrossOrigin
public class AgentUIController {
    @Autowired
    IAgentService service;

    @Autowired
    IBranchLogService branchLogService;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("agents", service.getAll());
        return "agents";
    }

    @GetMapping("del/{id}")
    public String deleteById(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/v1/agents/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addAgent(Model model){
        AgentForm agentForm = new AgentForm();
        model.addAttribute("form", agentForm);
        return "addAgent";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addAgent(@ModelAttribute("form") AgentForm form){
        Agent agent = new Agent();
        agent.setName(form.getName());
        agent.setDescription(form.getDescription());
        agent.setFirstName(form.getFirstName());
        agent.setLastName(form.getLastName());
        agent.setPatronymic(form.getPatronymic());
        agent.setAddress(form.getAddress());
        agent.setPhone(form.getPhone());
        agent.setFixSalary(form.getFixSalary() * 100);
        service.create(agent);
        return "redirect:/ui/v1/agents/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateAgent(Model model, @PathVariable("id") String id){
        Agent agentToUpdate = service.get(id);
        AgentForm agentForm = new AgentForm();
        agentForm.setId(agentToUpdate.getId());
        agentForm.setName(agentToUpdate.getName());
        agentForm.setDescription(agentToUpdate.getDescription());
        agentForm.setUpdatedAt(agentToUpdate.getUpdatedAt());
        agentForm.setCreatedAt(agentToUpdate.getCreatedAt());
        agentForm.setFirstName(agentToUpdate.getFirstName());
        agentForm.setLastName(agentToUpdate.getLastName());
        agentForm.setPatronymic(agentToUpdate.getPatronymic());
        agentForm.setAddress(agentToUpdate.getAddress());
        agentForm.setPhone(agentToUpdate.getPhone());
        agentForm.setFixSalary(agentToUpdate.getFixSalary()/100);
        model.addAttribute("form", agentForm);
        return "updateAgent";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateAgent(@ModelAttribute("form") AgentForm form){
        Agent agentToUpdate = new Agent();
        agentToUpdate.setId(form.getId());
        agentToUpdate.setName(form.getName());
        agentToUpdate.setDescription(form.getDescription());
        agentToUpdate.setCreatedAt(LocalDateTime.now());
        agentToUpdate.setUpdatedAt(LocalDateTime.now());
        agentToUpdate.setFirstName(form.getFirstName());
        agentToUpdate.setLastName(form.getLastName());
        agentToUpdate.setPatronymic(form.getPatronymic());
        agentToUpdate.setAddress(form.getAddress());
        agentToUpdate.setPhone(form.getPhone());
        agentToUpdate.setFixSalary(form.getFixSalary());
        service.update(agentToUpdate);
        return "redirect:/ui/v1/agents/";
    }
}
