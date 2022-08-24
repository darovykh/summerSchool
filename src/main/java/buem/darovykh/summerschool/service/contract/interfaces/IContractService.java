package buem.darovykh.summerschool.service.contract.interfaces;

import buem.darovykh.summerschool.model.Contract;

import java.util.List;

public interface IContractService {
    Contract create(Contract contract);
    Contract get(String id);
    Contract update(Contract contract);
    void delete(String id);
    List<Contract> getAll();

    List<Contract> saveAll(List<Contract> contracts);
}
