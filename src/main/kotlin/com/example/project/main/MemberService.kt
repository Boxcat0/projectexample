package com.example.project.main

import org.springframework.stereotype.Service


@Service
class MemberService(val db: MemberRepository) {

    fun findMember(): List<Member> = db.findMember()
    fun post(member: Member)
    {
        db.save(member)
    }

    fun findReviews(): List<Member> = db.findReviews()
    fun reviewpost(review: Member)
    {
        db.save(review)
    }
}