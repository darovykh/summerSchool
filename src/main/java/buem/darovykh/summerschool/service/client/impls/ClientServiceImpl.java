package buem.darovykh.summerschool.service.client.impls;

import buem.darovykh.summerschool.model.Client;
import buem.darovykh.summerschool.repository.item.ClientMongoRepository;
import buem.darovykh.summerschool.repository.item.ItemMongoRepository;
import buem.darovykh.summerschool.service.client.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {



    @Autowired
    ClientMongoRepository repository;

     /*@PostConstruct
    void init(){
        repository.saveAll(clients);
    }*/

    @Override
    public Client create(Client client) {
        return null;
    }

    @Override
    public Client get(String id) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public List<Client> saveAll(List<Client> clients) {
        return null;
    }
}
