package buem.darovykh.summerschool.service.branch.impls;

import buem.darovykh.summerschool.model.Branch;
import buem.darovykh.summerschool.repository.BranchFakeRepository;
import buem.darovykh.summerschool.service.branch.interfaces.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements IBranchService {
    @Autowired
    private BranchFakeRepository repository;

    @Override
    public Branch create(Branch branch) {
        return repository.save(branch);
    }

    @Override
    public Branch get(String id) {
        return repository.findById(id);
    }

    @Override
    public Branch update(Branch branch) {
        return repository.update(branch);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Branch> getAll() {
        return repository.findAll();
    }
}
