package buem.darovykh.summerschool.repository.item;

import buem.darovykh.summerschool.model.Contract;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContractMongoRepository extends MongoRepository<Contract, String> {
    List<Contract> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
