package com.example.project.main.Review

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface ReviewRepository: CrudRepository<Review, Review> {
    @Query("select reviews from member")
    fun findReviews(): List<Review>
}