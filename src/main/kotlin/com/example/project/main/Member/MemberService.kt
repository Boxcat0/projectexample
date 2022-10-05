package com.example.project.main.Member

import org.springframework.stereotype.Service


@Service
class MemberService(val db: MemberRepository) {

    fun findMember(): List<Member> = db.findMember()
    fun post(member: Member)
    {
        db.save(member)
    }
}
