package com.example.book_my_show.Service;

import com.example.book_my_show.Convertors.MovieConvertors;
import com.example.book_my_show.DTOs.MovieEntryDto;
import com.example.book_my_show.Entities.MovieEntity;
import com.example.book_my_show.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

}
