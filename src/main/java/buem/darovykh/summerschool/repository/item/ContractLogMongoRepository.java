package buem.darovykh.summerschool.repository.item;

import buem.darovykh.summerschool.model.ContractLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContractLogMongoRepository extends MongoRepository<ContractLog, String> {
    List<ContractLog> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
