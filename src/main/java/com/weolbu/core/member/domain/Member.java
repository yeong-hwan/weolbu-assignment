package com.weolbu.core.member.domain;

import com.weolbu.core.enums.MemberType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
    @Id @GeneratedValue
    private Long id;

    private String name;
    private String email;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private MemberType memberType; // STUDENT, INSTRUCTOR
}
