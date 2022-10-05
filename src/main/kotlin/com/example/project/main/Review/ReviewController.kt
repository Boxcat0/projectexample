package com.example.project.main.Review

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


@Controller
class ReviewController(val service: ReviewService) {
    @GetMapping("/allreview")
    /*fun re(): List<Review> = service.findReviews()*/
    fun review(model: Model): String{
        model.addAttribute("re", service.findReviews())
        return "reviewer"
    }
    @PostMapping("/allreview")
    fun  reviewpost(@RequestBody review: Review)
    {
        service.reviewpost(review)
    }
}

@Table("member")
data class Review(@Id val reviews:String?, val id : String?)