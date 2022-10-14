package com.example.project.main.Member

import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import javax.persistence.EmbeddedId
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType


@Table(name = "member")
data class Member(
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column("Id")
    var Id : String?,
    @Column("passwords")
    var passwords : String
)


