package com.example.project.main

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MemberRepository:CrudRepository<Member, String> {

    @Query("select * from member")
    fun findMember(): List<Member>

    @Query("select * from member where reviews")
    fun findReviews(): List<Member>
}