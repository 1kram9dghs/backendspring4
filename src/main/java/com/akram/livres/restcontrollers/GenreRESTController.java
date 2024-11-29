package com.akram.livres.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akram.livres.entities.Genre;
import com.akram.livres.repositories.GenreRepository;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin("http://localhost:4200/rechercheParGenre")
public class GenreRESTController {
	
	@Autowired
	GenreRepository genreRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Genre> getAllGenres(){
		return genreRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Genre getGenreById(@PathVariable("id") Long id) {
		return genreRepository.findById(id).get();
	}

}
