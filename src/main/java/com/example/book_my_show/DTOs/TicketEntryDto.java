package com.example.book_my_show.DTOs;
import java.util.*;

import lombok.Data;

@Data
public class TicketEntryDto {

    private int showId;

    private List<String> requestedSeats = new ArrayList<>();

    private int userId;


}
