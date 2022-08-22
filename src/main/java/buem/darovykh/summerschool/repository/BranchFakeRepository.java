package buem.darovykh.summerschool.repository;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.model.Branch;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class BranchFakeRepository {
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

    public List<Branch> findAll(){
        return this.branches;
    }

    public Branch findById(String id) {
        return this.branches.stream().filter(branch -> branch.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Branch update(Branch branch) {
        this.deleteById(branch.getId());
        branch.setUpdatedAt(LocalDateTime.now());
        this.branches.add(branch);
        return branch;
    }


    public void deleteById(String id) {
        Branch branch = this.findById(id);
        this.branches.remove(branch);
    }

    public Branch save(Branch branch) {
        LocalDateTime saveAt = LocalDateTime.now();
        branch.setId(UUID.randomUUID().toString());
        branch.setCreatedAt(saveAt);
        branch.setUpdatedAt(saveAt);
        this.branches.add(branch);
        return branch;
    }
}