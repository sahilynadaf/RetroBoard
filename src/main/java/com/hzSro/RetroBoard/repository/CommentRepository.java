package com.hzSro.RetroBoard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hzSro.RetroBoard.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query("SELECT c FROM Comment c WHERE year(c.createdDate)=?1 AND month(c.createdDate)=?2 AND day(c.createdDate)=?3")
    List<Comment> findByCreatedYearAndMonthAndDay(int year, int month, int day);
}
