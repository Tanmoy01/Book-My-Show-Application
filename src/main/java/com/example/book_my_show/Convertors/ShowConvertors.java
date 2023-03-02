package com.example.book_my_show.Convertors;

import com.example.book_my_show.DTOs.ShowEntryDto;
import com.example.book_my_show.Entities.ShowEntity;

public class ShowConvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}
