package com.leogen.hibernate.chapter01.pojo;

import java.util.Objects;

public class MessageEntity {
    private Long id;
    private String text;

    public MessageEntity() {
    }

    public MessageEntity(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public MessageEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public MessageEntity setText(String text) {
        this.text = text;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MessageEntity)) return false;
        MessageEntity that = (MessageEntity) o;
        return getId().equals(that.getId()) &&
                Objects.equals(getText(), that.getText());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getText());
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
