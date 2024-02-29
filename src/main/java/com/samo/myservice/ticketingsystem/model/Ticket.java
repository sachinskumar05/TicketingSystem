// Ticket.java
package com.samo.myservice.ticketingsystem.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Ticket {
    @Id
    private String id;
    private String title;
    private String description;
    private String assignee;
    private String status;

}
