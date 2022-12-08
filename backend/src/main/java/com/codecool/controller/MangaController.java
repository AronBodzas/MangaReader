package com.codecool.controller;

import com.codecool.model.Chapter;
import com.codecool.model.Manga;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MangaController {


    @GetMapping(value = "all-manga")
    public List<Manga> getAllManga(){
        return null;
    }

    @GetMapping(value = "{currentManga}")
    public Manga getCurrentManga(@PathVariable String currentManga){
        return null;
    }

    @GetMapping(value = "{currentManga}/{chapterNumber}")
    public Chapter getMangaChapter(@PathVariable String chapterNumber, @PathVariable String currentManga){
        return null;
    }


    @GetMapping(value = "{currentManga}/{chapterNumber}/{currentPage}")
    public String getCurrentPage(@PathVariable String chapterNumber, @PathVariable String currentManga, @PathVariable String currentPage){
        return null;
    }

}
