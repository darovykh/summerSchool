package buem.darovykh.summerschool.service.salary.impls;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.model.Contract;
import buem.darovykh.summerschool.model.Salary;
import buem.darovykh.summerschool.repository.item.SalaryMongoRepository;
import buem.darovykh.summerschool.service.salary.interfaces.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SalaryServiceImpls implements ISalaryService {
    private LocalDateTime now = LocalDateTime.now();
    private Agent agent = new Agent("1", "agent1", "descr 1", now, now, "Sara","Johns",
            "-", "UK, London, Baker str., 221b", "0954458622", 30000);
    private List<Salary> salarys = new ArrayList<>(
            Arrays.asList(
                    new Salary("1", "salary1", "descr 1", now, now, agent,
                            0,0,LocalDateTime.now(), LocalDateTime.now()
            )));

    @Autowired
    SalaryMongoRepository repository;

    /*@PostConstruct
    void init(){
        repository.saveAll(salarys);
    }*/

    @Override
    public Salary create(Salary salary) {
        LocalDateTime now = LocalDateTime.now();
        salary.setCreatedAt(now);
        salary.setUpdatedAt(now);
        return repository.save(salary);
    }

    @Override
    public Salary get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Salary update(Salary salary) {
        salary.setUpdatedAt(LocalDateTime.now());
        return repository.save(salary);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Salary> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Salary> saveAll(List<Salary> salarys) {
        return repository.saveAll(salarys);
    }

}
