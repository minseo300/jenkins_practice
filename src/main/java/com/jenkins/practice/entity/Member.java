package com.jenkins.practice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;

    private String email;
    private String password;
    private String name;
    private String phone;
}
