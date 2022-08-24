package buem.darovykh.summerschool.service.contract.impls;

import buem.darovykh.summerschool.model.Contract;
import buem.darovykh.summerschool.repository.item.ContractMongoRepository;
import buem.darovykh.summerschool.service.contract.interfaces.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ContractServiceImpl implements IContractService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Contract> contracts = new ArrayList<>(
            Arrays.asList(
                    new Contract("1", "contract1", "descr 1", now, now, 500000, 50000),
                    new Contract("2", "contract2", "descr 2", now, now, 200000, 20000),
                    new Contract("3", "contract3", "descr 3", now, now, 300000, 30000)
            ));

    @Autowired
    ContractMongoRepository repository;

    /*@PostConstruct
    void init(){
        repository.saveAll(contracts);
    }*/

    @Override
    public Contract create(Contract contract) {
        LocalDateTime now = LocalDateTime.now();
        contract.setCreatedAt(now);
        contract.setUpdatedAt(now);
        return repository.save(contract);
    }

    @Override
    public Contract get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Contract update(Contract contract) {
        contract.setUpdatedAt(LocalDateTime.now());
        return repository.save(contract);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Contract> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Contract> saveAll(List<Contract> contracts) {
        return repository.saveAll(contracts);
    }
}
