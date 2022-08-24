package buem.darovykh.summerschool.repository.item;

import buem.darovykh.summerschool.model.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BranchMongoRepository extends MongoRepository<Branch, String> {
    List<Branch> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}
