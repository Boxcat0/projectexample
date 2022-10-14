package com.example.project.main.account

import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository:JpaRepository<Account, Long> {
    fun findById(Id: String):Account?
}