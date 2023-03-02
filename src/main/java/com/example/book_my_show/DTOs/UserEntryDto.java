package com.example.book_my_show.DTOs;
import lombok.*;

import javax.persistence.Column;

@Data
public class UserEntryDto {


    private String name;

    private int age;

    private String email;

    private String mobNo;

    private String address;
}