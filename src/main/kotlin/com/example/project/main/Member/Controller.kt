package com.example.project.main.Member

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class Controller(val service: MemberService) {
    @GetMapping("/allusers")
    fun index(): List<Member> = service.findMember()

    @PostMapping("/allusers")
    fun post(@RequestBody member: Member){
        service.post(member)
    }
}

@Table("member")
data class Member(@Id val id: String?, val passwords: String?, val reviews: String?)