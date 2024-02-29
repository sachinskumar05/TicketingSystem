// TicketRepository.java
package com.samo.myservice.ticketingsystem.repository;

import com.samo.myservice.ticketingsystem.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends MongoRepository<Ticket, String> {
}
