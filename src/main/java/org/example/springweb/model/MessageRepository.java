package org.example.springweb.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MessageRepository {
    private final Map<Long, Message> messages = new HashMap<>();

    public Message findById(Long id) {
        return messages.get(id);
    }

    public void save(Message message) {
        this.messages.put(message.getId(), message);
    }

    public Map<Long, Message> getMessages() {
        return messages;
    }

    public void delete(Long id) {
        this.messages.remove(id);
    }
}
