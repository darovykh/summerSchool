package buem.darovykh.summerschool.service.client.impls;

import buem.darovykh.summerschool.model.Client;
import buem.darovykh.summerschool.repository.item.ClientMongoRepository;
import buem.darovykh.summerschool.service.client.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Client> clients = new ArrayList<>(
            Arrays.asList(
                    new Client("1", "item1", "descr 1", now, now, "Bohdan", "Globo",
                            "Tarasovich", "Ukarine, Kyiv, Borshagovska str., 17, 21", "09516230461"),
                    new Client("2", "item2", "descr 2", now, now, "Liza", "Blaze",
                            "-", "US, San Francisko, 1647 43rd Ave", "2185463768544"),
                    new Client("3", "item3", "descr 3", now, now, "Antun", "Depreje",
                            "-", "France, Paris, Rue Pelleport, 75020", "14485616456")
            ));

    @Autowired
    ClientMongoRepository repository;

    /*@PostConstruct
    void init(){
        repository.saveAll(clients);
    }*/

    @Override
    public Client create(Client client) {
        LocalDateTime now = LocalDateTime.now();
        client.setCreatedAt(now);
        client.setUpdatedAt(now);
        return repository.save(client);
    }

    @Override
    public Client get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Client update(Client client) {
        client.setUpdatedAt(LocalDateTime.now());
        return repository.save(client);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Client> saveAll(List<Client> clients) {
        return repository.saveAll(clients);
    }
}
