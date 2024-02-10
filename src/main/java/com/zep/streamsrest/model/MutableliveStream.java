package com.zep.streamsrest.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

@Data
public class MutableliveStream {
    private  String id;
    private  String title;
    private  String description;
    private String url;
    private LocalDate startDate;
    private LocalDate endDate;

    @Override
    public String toString() {
        return "MutableliveStream{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableliveStream that = (MutableliveStream) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(description, that.description) && Objects.equals(url, that.url) && Objects.equals(startDate, that.startDate) && Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, url, startDate, endDate);
    }
}
