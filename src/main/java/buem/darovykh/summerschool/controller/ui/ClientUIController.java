package buem.darovykh.summerschool.controller.ui;

import buem.darovykh.summerschool.form.ClientForm;
import buem.darovykh.summerschool.model.Client;
import buem.darovykh.summerschool.service.client.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/ui/v1/clients/")
@Controller
public class ClientUIController {

    @Autowired
    IClientService service;

    @GetMapping("")
    public String showAll(Model model) {
        model.addAttribute("clients", service.getAll());
        return "clients";
    }

    @GetMapping("del/{id}")
    public String deleteById(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/ui/v1/clients/";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addClient(Model model){
        ClientForm clientForm = new ClientForm();
        model.addAttribute("form", clientForm);
        return "addClient";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addClient(@ModelAttribute("form") ClientForm form){
        Client client = new Client();
        client.setName(form.getName());
        client.setDescription(form.getDescription());
        client.setFirstName(form.getFirstName());
        client.setLastName(form.getLastName());
        client.setPatronymic(form.getPatronymic());
        client.setAddress(form.getAddress());
        client.setPhone(form.getPhone());
        service.create(client);
        return "redirect:/ui/v1/clients/";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String updateClient(Model model, @PathVariable("id") String id){
        Client clientToUpdate = service.get(id);
        ClientForm clientForm = new ClientForm();
        clientForm.setId(clientToUpdate.getId());
        clientForm.setName(clientToUpdate.getName());
        clientForm.setDescription(clientToUpdate.getDescription());
        clientForm.setUpdatedAt(clientToUpdate.getUpdatedAt());
        clientForm.setCreatedAt(clientToUpdate.getCreatedAt());
        clientForm.setFirstName(clientToUpdate.getFirstName());
        clientForm.setLastName(clientToUpdate.getLastName());
        clientForm.setPatronymic(clientToUpdate.getPatronymic());
        clientForm.setAddress(clientToUpdate.getAddress());
        clientForm.setPhone(clientToUpdate.getPhone());
        model.addAttribute("form", clientForm);
        return "updateClient";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String updateclient(@ModelAttribute("form") ClientForm form){
        Client clientToUpdate = new Client();
        clientToUpdate.setId(form.getId());
        clientToUpdate.setName(form.getName());
        clientToUpdate.setDescription(form.getDescription());
        clientToUpdate.setCreatedAt(LocalDateTime.now());
        clientToUpdate.setUpdatedAt(LocalDateTime.now());
        clientToUpdate.setFirstName(form.getFirstName());
        clientToUpdate.setLastName(form.getLastName());
        clientToUpdate.setPatronymic(form.getPatronymic());
        clientToUpdate.setAddress(form.getAddress());
        clientToUpdate.setPhone(form.getPhone());

        service.update(clientToUpdate);
        return "redirect:/ui/v1/clients/";
    }
}
