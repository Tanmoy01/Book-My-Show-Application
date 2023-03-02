package com.example.book_my_show.Convertors;

import com.example.book_my_show.DTOs.TicketEntryDto;
import com.example.book_my_show.Entities.TicketEntity;

public class TicketConvertors {
    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}
