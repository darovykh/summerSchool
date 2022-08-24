package buem.darovykh.summerschool.repository.item;

import buem.darovykh.summerschool.model.InsuranceType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface InsuranceTypeMongoRepository extends MongoRepository<InsuranceType, String> {
    List<InsuranceType> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
