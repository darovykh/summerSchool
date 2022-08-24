package buem.darovykh.summerschool.service.insuranceType.impls;

import buem.darovykh.summerschool.model.InsuranceType;
import buem.darovykh.summerschool.repository.item.InsuranceTypeMongoRepository;;
import buem.darovykh.summerschool.service.insuranceType.interfaces.IInsuranceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InsuranceTypeServiceImpl implements IInsuranceTypeService {
    private LocalDateTime now = LocalDateTime.now();
    private List<InsuranceType> insuranceTypes = new ArrayList<>(
            Arrays.asList(
                    new InsuranceType("1", "item1", "descr 1", now, now, "car", 500),
                    new InsuranceType("2", "item2", "descr 2", now, now, "house", 300),
                    new InsuranceType("3", "item3", "descr 3", now, now, "life", 1000)
            ));

    @Autowired
    InsuranceTypeMongoRepository repository;

    /*@PostConstruct
    void init(){
        repository.saveAll(insuranceTypes);
    }*/

    @Override
    public InsuranceType create(InsuranceType insuranceType) {
        LocalDateTime now = LocalDateTime.now();
        insuranceType.setCreatedAt(now);
        insuranceType.setUpdatedAt(now);
        return repository.save(insuranceType);
    }

    @Override
    public InsuranceType get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public InsuranceType update(InsuranceType insuranceType) {
        insuranceType.setUpdatedAt(LocalDateTime.now());
        return repository.save(insuranceType);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<InsuranceType> getAll() {
        return repository.findAll();
    }

    @Override
    public List<InsuranceType> saveAll(List<InsuranceType> insuranceTypes) {
        return repository.saveAll(insuranceTypes);
    }
}
