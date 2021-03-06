package com.hendisantika.songscrud.controller;

import com.hendisantika.songscrud.repository.SongsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : songs-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/04/22
 * Time: 08.46
 */
@RestController
@RequestMapping("/api/songs")
public class SongsController {

    private final SongsRepository songsRepository;


    public SongsController() {
        this.songsRepository = new SongsRepository();
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(songsRepository.getAll(), HttpStatus.OK);
    }

    @GetMapping("/year/{year}")
    public ResponseEntity<?> getAllByYear(@PathVariable("year") Integer year) {
        return new ResponseEntity<>(songsRepository.getAllByYear(year), HttpStatus.OK);
    }
}
