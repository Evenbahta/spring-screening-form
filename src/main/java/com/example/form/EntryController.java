package com.example.form;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EntryController {

    private final List<Entry> entries = new ArrayList<>(); // in-memory

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("entry", new Entry());
        model.addAttribute("entries", entries);
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@Valid @ModelAttribute("entry") Entry entry,
                         BindingResult result,
                         Model model) {
        if (result.hasErrors()) {
            model.addAttribute("entries", entries);
            return "index";
        }
        entries.add(entry);
        model.addAttribute("entry", new Entry()); // clear the form
        model.addAttribute("entries", entries);
        return "index";
    }
}
