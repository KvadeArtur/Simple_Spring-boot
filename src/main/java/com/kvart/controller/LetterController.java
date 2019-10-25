package com.kvart.controller;

import com.kvart.letterrepo.LetterRepo;
import com.kvart.model.Letter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LetterController {

    @Autowired
    private LetterRepo letterRepo;

    @PostMapping
    public String addLetter(@RequestParam String title, @RequestParam String text, Map<String, Object> model) {
        Letter letter = new Letter(title, text);

        letterRepo.save(letter);

        Iterable<Letter> letters = letterRepo.findAll();

        model.put("letters", letters);

        return "main";
    }

    @GetMapping
    public String getAll(Map<String, Object> model) {
        Iterable<Letter> letters = letterRepo.findAll();

        model.put("letters", letters);

        return "main";
    }
}
