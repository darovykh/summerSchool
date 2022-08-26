package buem.darovykh.summerschool.service.branchLog.impls;

import buem.darovykh.summerschool.model.Agent;
import buem.darovykh.summerschool.model.Branch;
import buem.darovykh.summerschool.model.BranchLog;
import buem.darovykh.summerschool.repository.item.BranchLogMongoRepository;
import buem.darovykh.summerschool.service.branchLog.interfaces.IBranchLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BranchLogServiceImpl implements IBranchLogService {

    private LocalDateTime now = LocalDateTime.now();
    private List<Agent> agents = new ArrayList<>(
            Arrays.asList(
                    new Agent("1", "agent1", "descr 1", now, now, "Sara","Johns",
                            "-", "UK, London, Baker str., 221b", "0954458622", 30000),
                    new Agent("2", "agent2", "descr 2", now, now, "Tonald","Drump",
                            "-", "1421A 28th St, North Bergen, NJ 07047, USA", "06678164883", 30000),
                    new Agent("3", "agent3", "descr 3", now, now, "Vasil","Chemresh",
                            "Tarasovich", "Ukraine, Kyiv, Stepana Bandery str., 16, 31",
                            "0951063430", 30000),
                    new Agent("4", "agent4", "descr 4", now, now, "Richard","Brendson",
                            "-", "UK, Birmingham, 14 Denby Cl", "01482264852", 30000),
                    new Agent("5", "agent5", "descr 5", now, now, "Patricia","Kaas",
                            "-", "France, Parish, 19 Rue Octave Feuillet", "498732194861", 30000)
            ));

    private List<Branch> branches = new ArrayList<>(
            Arrays.asList(
                    new Branch("1", "branch1", "descr 1", now, now, "Branch on Temza",
                            "UK, London, Papermill Wharf str., 37", "09565461949"),
                    new Branch("2", "branch2", "descr 2", now, now, "Branch under Bridge",
                            "US, San Francisco, Battery Cranston Rd, 94", "05616315631"),
                    new Branch("3", "branch3", "descr 3", now, now, "Branch in Paris",
                            "France, Paris, ter Avenue de Lowendal, 1", "561541687461"),
                    new Branch("4", "branch4", "descr 4", now, now, "Branch in Ukraine",
                            "Ukraine, Kyiv, Geroiv str., 25", "0951056327")
            ));

    private List<BranchLog> branchLogs = new ArrayList<>(
            Arrays.asList(
                    new BranchLog("1", "branchLog1", "descr 1", now, now, branches.get(0), agents.get(0)),
                    new BranchLog("2", "branchLog2", "descr 2", now, now, branches.get(1), agents.get(1)),
                    new BranchLog("3", "branchLog3", "descr 3", now, now, branches.get(3), agents.get(2)),
                    new BranchLog("3", "branchLog3", "descr 3", now, now, branches.get(0), agents.get(3)),
                    new BranchLog("3", "branchLog3", "descr 3", now, now, branches.get(2), agents.get(4))
            ));

    @Autowired
    BranchLogMongoRepository repository;

    /*@PostConstruct
    void init(){
        repository.saveAll(branchLogs);
    }*/

    @Override
    public BranchLog create(BranchLog branchLog) {
        LocalDateTime now = LocalDateTime.now();
        branchLog.setCreatedAt(now);
        branchLog.setUpdatedAt(now);
        return repository.save(branchLog);
    }

    @Override
    public BranchLog get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public BranchLog update(BranchLog branchLog) {
        branchLog.setUpdatedAt(LocalDateTime.now());
        return repository.save(branchLog);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<BranchLog> getAll() {
        return repository.findAll();
    }

    @Override
    public List<BranchLog> saveAll(List<BranchLog> branchLogs) {
        return repository.saveAll(branchLogs);
    }
}
