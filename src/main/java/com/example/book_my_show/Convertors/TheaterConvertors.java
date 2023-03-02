package com.example.book_my_show.Convertors;

import com.example.book_my_show.DTOs.TheaterEntryDto;
import com.example.book_my_show.Entities.TheaterEntity;

public class TheaterConvertors {
    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }
}
