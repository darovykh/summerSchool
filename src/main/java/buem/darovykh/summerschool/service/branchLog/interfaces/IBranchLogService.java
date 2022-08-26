package buem.darovykh.summerschool.service.branchLog.interfaces;

import buem.darovykh.summerschool.model.BranchLog;

import java.util.List;

public interface IBranchLogService {
    BranchLog create(BranchLog branch);
    BranchLog get(String id);
    BranchLog update(BranchLog branch);
    void delete(String id);
    List<BranchLog> getAll();

    List<BranchLog> saveAll(List<BranchLog> branchLogs);
}
