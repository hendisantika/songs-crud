package com.hendisantika.songscrud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * Project : songs-crud
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/04/22
 * Time: 08.43
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Song {
    private String title;
    private String author;
    private Integer releaseYear;
}
