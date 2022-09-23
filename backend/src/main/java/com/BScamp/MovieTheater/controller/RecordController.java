package com.BScamp.MovieTheater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BScamp.MovieTheater.entity.Movie;
import com.BScamp.MovieTheater.entity.Record;
import com.BScamp.MovieTheater.entity.User;
import com.BScamp.MovieTheater.service.RecordService;

@RestController
public class RecordController {

	@Autowired
	RecordService recordService;

	@GetMapping("/record")
	public List<Record> getRecords(@RequestParam("userID") int userID) {
		return recordService.getAllByUserID(userID);
	}

	@GetMapping("/record/add")
	public Record addRecord(
			@RequestParam("userID") int userID,
			@RequestParam("movieID") int movieID
	) {
		User user = new User();
		user.setId(userID);

		Movie movie = new Movie();
		movie.setId(movieID);

		Record record = new Record();
		record.setUser(user);
		record.setMovie(movie);
		return recordService.create(record);
	}

}
