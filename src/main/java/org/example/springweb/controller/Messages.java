package org.example.springweb.controller;

import lombok.RequiredArgsConstructor;
import org.example.springweb.model.Message;
import org.example.springweb.model.MessageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequiredArgsConstructor
@RestController()
@RequestMapping("/api/messages")
public class Messages {
    private final MessageRepository messageRepository;

    @GetMapping
    public Map<Long, Message> getAll() {
        return messageRepository.getMessages();
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable("id") Long id) {
        return messageRepository.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Message message) {
        messageRepository.save(message);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        messageRepository.delete(id);
    }
}
