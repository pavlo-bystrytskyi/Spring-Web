package org.example.springweb.model;

import lombok.Data;

@Data
public class Message {
    private final long id;
    private final String name;
    private final String content;
}
