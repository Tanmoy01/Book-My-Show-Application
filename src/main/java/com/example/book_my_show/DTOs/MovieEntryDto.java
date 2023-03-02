package com.example.book_my_show.DTOs;


import com.example.book_my_show.Enum.Genre;
import com.example.book_my_show.Enum.Language;
import lombok.Data;

@Data
public class MovieEntryDto {

    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;

}
