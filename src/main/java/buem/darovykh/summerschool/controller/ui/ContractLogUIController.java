package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.service.contractLog.interfaces.IContractLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ui/v1/contractLogs/")
@Controller
@CrossOrigin
public class ContractLogUIController {

    @Autowired
    IContractLog service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("contractLogs", service.getAll());
        return "contractLogs";
    }
}
