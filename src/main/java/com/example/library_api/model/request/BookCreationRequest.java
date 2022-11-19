package com.example.library_api.model.request;

import lombok.Data;

@Data
public class BookCreationRequest {
    private String name;
    private String isbn;
    private Long authorId;
}
