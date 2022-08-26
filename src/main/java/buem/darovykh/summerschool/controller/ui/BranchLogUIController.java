package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.form.BranchLogForm;
import buem.darovykh.summerschool.model.BranchLog;
import buem.darovykh.summerschool.service.agent.interfaces.IAgentService;
import buem.darovykh.summerschool.service.branch.interfaces.IBranchService;
import buem.darovykh.summerschool.service.branchLog.interfaces.IBranchLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RequestMapping("/ui/v1/branchLogs/")
@Controller
@CrossOrigin
public class BranchLogUIController {
    @Autowired
    IBranchLogService service;

    @Autowired
    IAgentService agentService;

    @Autowired
    IBranchService branchService;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("branchLogs", service.getAll());
        return "branchLogs";
    }

    @GetMapping("del/{id}")
    public String deleteById(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/v1/branchLogs/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addBranchLog(Model model){
        BranchLogForm branchLogForm = new BranchLogForm();
        var agents = agentService.getAll().stream().map(agent -> agent.getId()).collect(Collectors.toList());
        var branches = branchService.getAll().stream().map(branch -> branch.getId()).collect(Collectors.toList());
        model.addAttribute("form", branchLogForm);
        model.addAttribute("agents", agents);
        model.addAttribute("branches", branches);
        return "addBranchLog";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addBranchLog(@ModelAttribute("form") BranchLogForm form){
        BranchLog branchLog = new BranchLog();
        branchLog.setName(form.getName());
        branchLog.setDescription(form.getDescription());
        branchLog.setAgent(form.getAgent());
        branchLog.setWhereAgentWorks(form.getWhereAgentWorks());
        service.create(branchLog);
        return "redirect:/ui/v1/branchLogs/";
    }
}
