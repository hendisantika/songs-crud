package com.hendisantika.songscrud.repository;

import com.hendisantika.songscrud.model.Song;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : songs-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/04/22
 * Time: 08.44
 */
@Slf4j
public class SongsRepository {
    private static final List<Song> songs = Arrays.asList(
            new Song("Gajah", "Tulus", 2015),
            new Song("Demi Waktu", "Ungu", 2010),
            new Song("Padi", "Mahadewi", 1998)
    );

    public Song addSong(Song song) {
        songs.add(song);
        log.info("New song has been added.");
        return song;
    }

    public List<Song> getAll() {
        log.info("Get All songs.");
        return songs;
    }

    public List<Song> getAllByYear(int iYear) {
        log.info("Get All songs by year.");
        return songs.stream().filter(song -> song.getReleaseYear() == iYear).collect(Collectors.toList());
    }
}
