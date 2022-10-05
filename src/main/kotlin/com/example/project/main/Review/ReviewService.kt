package com.example.project.main.Review

import org.springframework.stereotype.Service

@Service
class ReviewService(val db: ReviewRepository){
    fun findReviews(): List<Review> = db.findReviews()
    fun reviewpost(review: Review)
    {
        db.save(review)
    }
}