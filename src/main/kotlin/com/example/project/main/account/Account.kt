package com.example.project.main.account

import javax.persistence.FetchType
import org.hibernate.annotations.CreationTimestamp
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.data.annotation.Id
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import java.time.LocalDateTime
import java.util.stream.Collectors
import javax.persistence.*

@Entity
data class Account(
        @Id @GeneratedValue
        var id: String? =null,
        var password: String,

        @Enumerated(EnumType.STRING)
        @ElementCollection(fetch = FetchType.EAGER)
        var roles: Set<AccountRole>,

        @CreationTimestamp
        var createDt: LocalDateTime = LocalDateTime.now()
)
{
        fun getAuthorities(): User {
                return User(
                        this.password,
                        this.roles.stream().map{ role -> SimpleGrantedAuthority("ROLE_$role") }
                                .collect(Collectors.toSet())
                )
        }
}