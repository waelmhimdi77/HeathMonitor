package tn.healthmonitor.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.healthmonitor.server.model.Payload;
import tn.healthmonitor.server.model.User;
import tn.healthmonitor.server.repository.PayloadRepository;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/Payload")
public class PayloadController {
    @Autowired
    private PayloadRepository payloadRepository;
   @GetMapping
    public List<Payload> getAll() {
        return payloadRepository.findAll();
    }

    @PostMapping
    public Payload create(Payload payload)
    {
        return payloadRepository.save(payload);
    }
    @GetMapping("/{cin}")
    public List<Payload> getByUser(@PathVariable int cin)
    {
        User user = new User(cin);
        return payloadRepository.getAllByUser(user);
    }
    @DeleteMapping("/{date}")
    public void deleteBefore(@PathVariable Date date)
    {
        payloadRepository.deleteAllByCreationDateBefore(date);
    }
}