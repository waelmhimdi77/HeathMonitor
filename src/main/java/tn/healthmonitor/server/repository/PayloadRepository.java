package tn.healthmonitor.server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import tn.healthmonitor.server.model.Payload;
import tn.healthmonitor.server.model.User;

import java.sql.Date;
import java.util.List;

public interface PayloadRepository extends MongoRepository<Payload,String> {
    public List<Payload> getAllByUser(User user);
    public void deleteAllByCreationDateBefore(Date date);
}
