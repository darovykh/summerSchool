package buem.darovykh.summerschool.service.contractLog.impls;

import buem.darovykh.summerschool.model.*;
import buem.darovykh.summerschool.repository.item.ContractLogMongoRepository;
import buem.darovykh.summerschool.service.contractLog.interfaces.IContractLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ContractLogServiceImpl implements IContractLog {
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
    private List<Contract> contracts = new ArrayList<>(
            Arrays.asList(
                    new Contract("1", "contract1", "descr 1", now, now, 500000, 50000),
                    new Contract("2", "contract2", "descr 2", now, now, 200000, 20000),
                    new Contract("3", "contract3", "descr 3", now, now, 300000, 30000)
            ));
    private List<Branch> branches = new ArrayList<>(
            Arrays.asList(
                    new Branch("1", "branch1", "descr 1", now, now, "Branch on Temza",
                            "UK, London, Papermill Wharf str., 37", "09565461949"),
                    new Branch("2", "branch2", "descr 2", now, now, "Branch under Bridge",
                            "US, San Francisco, Battery Cranston Rd, 94", "05616315631"),
                    new Branch("3", "branch3", "descr 3", now, now, "Branch in Paris",
                            "France, Paris, ter Avenue de Lowendal, 1", "561541687461")
            ));
    private List<InsuranceType> insuranceTypes = new ArrayList<>(
            Arrays.asList(
                    new InsuranceType("1", "item1", "descr 1", now, now, "car", 500),
                    new InsuranceType("2", "item2", "descr 2", now, now, "house", 300),
                    new InsuranceType("3", "item3", "descr 3", now, now, "life", 1000)
            ));

    private List<ContractLog> contractLogs = new ArrayList<>(
            Arrays.asList(
                    new ContractLog("1", "contractLog1", "descr 1", now, now, clients.get(0),
                            agents.get(0), contracts.get(0), branches.get(0), insuranceTypes.get(0)),
                    new ContractLog("2", "contractLog2", "descr 2", now, now, clients.get(1),
                            agents.get(1), contracts.get(1), branches.get(1), insuranceTypes.get(1)),
                    new ContractLog("3", "contractLog3", "descr 3", now, now, clients.get(2),
                            agents.get(2), contracts.get(2), branches.get(2), insuranceTypes.get(1))

            ));

    @Autowired
    ContractLogMongoRepository repository;

    @PostConstruct
    void init(){
        repository.saveAll(contractLogs);
    }

    @Override
    public ContractLog create(ContractLog contractLog) {
        LocalDateTime now = LocalDateTime.now();
        contractLog.setCreatedAt(now);
        contractLog.setUpdatedAt(now);
        return repository.save(contractLog);
    }

    @Override
    public ContractLog get(String id) {
        return repository.findById(id).get();
    }

    @Override
    public ContractLog update(ContractLog contractLog) {
        contractLog.setUpdatedAt(LocalDateTime.now());
        return repository.save(contractLog);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<ContractLog> getAll() {
        return repository.findAll();
    }

    @Override
    public List<ContractLog> saveAll(List<ContractLog> contractLog) {
        return repository.saveAll(contractLog);
    }
}
