package com.example.project.main.Review

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class ReviewController(val service: ReviewService) {
    @GetMapping("/allreview")
    fun re(): List<Review> = service.findReviews()
    /*fun review(model : Model): String{
        val re: List<Review> = service.findReviews()
        model.addAttribute("re", re)
        return "reviewer"
    }*/

    @PostMapping("/allreview")
    fun  reviewpost(@RequestBody review: Review)
    {
        service.reviewpost(review)
    }
}

@Table("member")
data class Review(@Id val reviews:String?, val id : String?)