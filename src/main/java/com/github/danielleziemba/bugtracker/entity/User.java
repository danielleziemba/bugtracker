package com.github.danielleziemba.bugtracker.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tracker_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    // will need to be encrypted

    /********************************************/

    // will be needed once mapped:
    // = projects
    // = tickets

}
