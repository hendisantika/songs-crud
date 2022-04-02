package com.hendisantika.songscrud.controller;

import com.hendisantika.songscrud.repository.SongsRepository;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class SongsController {

    private SongsRepository songsRepository;
}
