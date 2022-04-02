package com.hendisantika.songscrud.repository;

import com.hendisantika.songscrud.model.Song;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : songs-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/04/22
 * Time: 08.44
 */
public class SongsRepository {
    private static final List<Song> songs = Arrays.asList(
            new Song("Gajah", "Tulus", 2015),
            new Song("Demi Waktu", "Ungu", 2010),
            new Song("Padi", "Mahadewi", 1998)
    );

    public List<Song> getAll() {
        return songs;
    }
}
