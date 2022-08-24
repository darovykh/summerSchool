package buem.darovykh.summerschool.service.branch.impls;

import buem.darovykh.summerschool.model.Branch;
import buem.darovykh.summerschool.repository.item.BranchMongoRepository;
import buem.darovykh.summerschool.service.branch.interfaces.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BranchServiceImpl implements IBranchService {
    private LocalDateTime now = LocalDateTime.now();
    private List<Branch> branches = new ArrayList<>(
            Arrays.asList(
                    new Branch("1", "branch1", "descr 1", now, now, "Branch on Temza",
                            "UK, London, Papermill Wharf str., 37", "09565461949"),
                    new Branch("2", "branch2", "descr 2", now, now, "Branch under Bridge",
                            "US, San Francisco, Battery Cranston Rd, 94", "05616315631"),
                    new Branch("3", "branch3", "descr 3", now, now, "Branch in Paris",
                            "France, Paris, ter Avenue de Lowendal, 1", "561541687461")
            ));

    @Autowired
    BranchMongoRepository repository;

    /*@PostConstruct
    void init(){
        repository.saveAll(branches);
    }*/

    @Override
    public Branch create(Branch branch) {
        LocalDateTime now = LocalDateTime.now();
        branch.setCreatedAt(now);
        branch.setUpdatedAt(now);
        return repository.save(branch);
    }

    @Override
    public Branch get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Branch update(Branch branch) {
        branch.setUpdatedAt(LocalDateTime.now());
        return repository.save(branch);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Branch> getAll() {
        return repository.findAll();
    }

    @Override
    public List<Branch> saveAll(List<Branch> branches) {
        return repository.saveAll(branches);
    }
}
