package buem.darovykh.summerschool.service.client.interfaces;

import buem.darovykh.summerschool.model.Client;
import buem.darovykh.summerschool.model.Item;

import java.util.List;

public interface IClientService {
    Client create(Client client);
    Client get(String id);
    Client update(Client client);
    void delete(String id);
    List<Client> getAll();

    List<Client> saveAll(List<Client> clients);
}
