package com.example.restservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/user")
    public Client addClient(@RequestBody Client client) {
        System.out.println("Received client data:");
        System.out.println("Last Name: " + client.getLastName());
        System.out.println("First Name: " + client.getFirstName());
        return clientService.addClient(client);
    }

    @GetMapping("/user/{id}")
    public Client getClientById(@PathVariable("id") long id) {
        return clientService.getClientById(id);
    }

    @PutMapping("/user/{id}")
    public Client updateClient(@PathVariable("id") long id, @RequestBody Client client) {
        return clientService.updateClient(id, client);
    }

    @DeleteMapping("/user/{id}")
    public String deleteClient(@PathVariable("id") long id) {
        return clientService.deleteClient(id);
    }

    @PostMapping("/users")
    public List<Client> addClients(@RequestBody List<Client> clients) {
        return clientService.addClients(clients);
    }

    @GetMapping("/users")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}
