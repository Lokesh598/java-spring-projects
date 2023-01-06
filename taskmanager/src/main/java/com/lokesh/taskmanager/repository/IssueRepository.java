package com.lokesh.taskmanager.repository;

import com.lokesh.taskmanager.model.Issue;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepository extends MongoRepository<Issue, String> { }
