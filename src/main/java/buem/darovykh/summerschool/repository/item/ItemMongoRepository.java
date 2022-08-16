package buem.darovykh.summerschool.repository.item;

import buem.darovykh.summerschool.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ItemMongoRepository extends MongoRepository<Item, String> {
    List<Item> findAllByCreatedAtAfterAndName(LocalDateTime date, String name);
}