package com.example.book_my_show.Convertors;

import com.example.book_my_show.DTOs.UserEntryDto;
import com.example.book_my_show.Entities.UserEntity;

public class UserConvertor {

    //static is kept to avoid calling it via object/intances--- can call it directly using the class name
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
                .build();

        return userEntity;

    }
}
