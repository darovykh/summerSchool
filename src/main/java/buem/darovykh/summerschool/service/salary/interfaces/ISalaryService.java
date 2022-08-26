package buem.darovykh.summerschool.service.salary.interfaces;

import buem.darovykh.summerschool.model.Salary;

import java.util.List;

public interface ISalaryService {
    Salary create(Salary salary);
    Salary get(String id);
    Salary update(Salary salary);
    void delete(String id);
    List<Salary> getAll();

    List<Salary> saveAll(List<Salary> salarys);
}
