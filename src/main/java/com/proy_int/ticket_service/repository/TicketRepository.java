package com.proy_int.ticket_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proy_int.ticket_service.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long>{

}
