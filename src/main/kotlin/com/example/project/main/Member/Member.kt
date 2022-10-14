package com.example.project.main.Member

import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType


@Entity
@Table(name = "member")
data class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("Id")
    var Id : String?,

    @Id
    @Column("passwords")
    var passwords : String
)


