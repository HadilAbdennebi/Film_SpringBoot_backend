package com.hadil.films.restcontrollers;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.domain.Page;
	import org.springframework.stereotype.Controller;
	import java.text.ParseException;
	import java.util.List;
	import javax.validation.Valid;
	import org.springframework.ui.ModelMap;
	import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hadil.films.entities.Film;
import com.hadil.films.entities.Genre;
import com.hadil.films.service.FilmService;
import com.hadil.films.service.GenreService;

@RestController
@RequestMapping("/api/genre")
@CrossOrigin
public class GenreController {

	@Autowired
	GenreService genreService;
	
	//@CrossOrigin(origins="http://localhost:4200")
	//@RequestMapping(path = "all",method = RequestMethod.GET)
	@RequestMapping(method = RequestMethod.GET)
	public List<Genre> getAllGenres() {
	   return genreService.getAllGenres();
	}
	

	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Genre getGenreById(@PathVariable("id") Long id) {
	  return genreService.getGenre(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Genre createGenre(@RequestBody Genre genre) {
	return genreService.saveGenre(genre);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Genre updateGenre(@RequestBody Genre genre) {
	return genreService.updateGenre(genre);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteGenre(@PathVariable("id") Long id)
	{
	genreService.deleteGenreById(id);
	}
	

}
