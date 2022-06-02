package com.scottample.songr.controllers;

import com.scottample.songr.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String HelloWorld() {
        return "hello";
    }
    @GetMapping("capitalize/{word}")
    @ResponseBody
    public String TheName(@PathVariable String word){
        return word.toUpperCase();
    }
    @GetMapping("album")
    public String getAlbums(Model model){

        Album Album1 = new Album("Title1", "artist1",20,3,"https://images.saymedia-content.com/.image/t_share/MTc0NDkxNzgyMzYzNDg5NjQw/vinyl-to-paper-how-to-write-an-album-review.jpg");
        Album Album2 = new Album("Title2", "artist2",20,3,"https://images.saymedia-content.com/.image/t_share/MTc0NDkxNzgyMzYzNDg5NjQw/vinyl-to-paper-how-to-write-an-album-review.jpg");
        Album Album3 = new Album("Title3", "artist3",20,3,"https://images.saymedia-content.com/.image/t_share/MTc0NDkxNzgyMzYzNDg5NjQw/vinyl-to-paper-how-to-write-an-album-review.jpg");

        List<Album> albums = new ArrayList<>();
        albums.add(Album1);
        albums.add(Album2);
        albums.add(Album3);
        System.out.println(albums);
        model.addAttribute("albums",Album1);

        return "album";
    }

}
