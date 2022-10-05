package com.example.project.main.Member

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MemberRepository:CrudRepository<Member, Member> {

    @Query("select * from member")
    fun findMember(): List<Member>
}

