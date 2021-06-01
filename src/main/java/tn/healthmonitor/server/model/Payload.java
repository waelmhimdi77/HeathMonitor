package tn.healthmonitor.server.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;

@Document("Payload")
@TypeAlias("Payload")
@Data
public class Payload {
    @DBRef
    User user;
    @CreatedDate
    Date creationDate;

}
