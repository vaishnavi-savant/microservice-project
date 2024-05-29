package com.microservice.comment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="comments")

public class Comment {

    @Id
    private String commentId;
    private String name;
    private String email;
    private String body;
    private String postId;





}
