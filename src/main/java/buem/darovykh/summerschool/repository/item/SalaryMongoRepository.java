package buem.darovykh.summerschool.repository.item;

import buem.darovykh.summerschool.model.Salary;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SalaryMongoRepository extends MongoRepository<Salary, String> {
    List<Salary> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
