package com.leogen.hibernate.chapter01.pojo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Message() {
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Message)) return false;
        Message message = (Message) o;
        return Objects.equals(getText(), message.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getText());
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + getText() + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }
}
