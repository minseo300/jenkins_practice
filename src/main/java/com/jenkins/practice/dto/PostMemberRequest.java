package com.jenkins.practice.dto;

import lombok.Data;

@Data
public class PostMemberRequest {
    private String email;
    private String password;
    private String name;
    private String phone;
}
