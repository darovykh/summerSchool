package buem.darovykh.summerschool.service.insuranceType.interfaces;

import buem.darovykh.summerschool.model.InsuranceType;

import java.util.List;

public interface IInsuranceTypeService {
    InsuranceType create(InsuranceType insuranceType);
    InsuranceType get(String id);
    InsuranceType update(InsuranceType insuranceType);
    void delete(String id);
    List<InsuranceType> getAll();

    List<InsuranceType> saveAll(List<InsuranceType> insuranceTypes);
}
