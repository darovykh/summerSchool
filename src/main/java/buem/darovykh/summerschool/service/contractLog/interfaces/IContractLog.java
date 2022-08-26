package buem.darovykh.summerschool.service.contractLog.interfaces;

import buem.darovykh.summerschool.model.ContractLog;

import java.util.List;

public interface IContractLog {
    ContractLog create(ContractLog contractLog);
    ContractLog get(String id);
    ContractLog update(ContractLog contractLog);
    void delete(String id);
    List<ContractLog> getAll();

    List<ContractLog> saveAll(List<ContractLog> contractLog);
}
