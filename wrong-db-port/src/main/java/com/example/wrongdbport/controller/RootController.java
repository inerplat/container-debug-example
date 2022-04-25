package com.example.wrongdbport.controller;

import com.example.wrongdbport.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/v1")
public class RootController {
    private final MessageService messageService;

    public RootController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/select/all")
    public String getAllMessage() {
        return messageService.getAllMessage().stream()
                .map(msg -> "<p>" + msg + "</p>")
                .collect(Collectors.joining());
    }

    @GetMapping("/insert")
    public String putMessage(@RequestParam String msg) {
        messageService.saveMessage(msg);
        return "OK";
    }
}
