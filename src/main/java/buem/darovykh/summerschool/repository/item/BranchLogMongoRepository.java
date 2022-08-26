package buem.darovykh.summerschool.repository.item;

import buem.darovykh.summerschool.model.BranchLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BranchLogMongoRepository extends MongoRepository<BranchLog, String> {
    List<BranchLog> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
