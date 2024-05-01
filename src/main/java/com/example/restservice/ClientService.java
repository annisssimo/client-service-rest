package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    public Client getClientById(long id) {
        return clientRepository.findById(id).orElse(null);
    }

    public Client updateClient(long id, Client client) {
        if (clientRepository.existsById(id)) {
            client.setId(id);
            return clientRepository.save(client);
        }
        return null;
    }

    public String deleteClient(long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
            return "Client deleted";
        }
        return "Client not found";
    }

    public List<Client> addClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
