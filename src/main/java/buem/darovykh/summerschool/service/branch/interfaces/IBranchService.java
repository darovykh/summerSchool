package buem.darovykh.summerschool.service.branch.interfaces;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.model.Branch;

import java.util.List;

public interface IBranchService {
    Branch create(Branch branch);
    Branch get(String id);
    Branch update(Branch branch);
    void delete(String id);
    List<Branch> getAll();
}
