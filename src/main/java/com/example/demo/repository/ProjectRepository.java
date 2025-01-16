package com.example.demo.repository;

import com.example.demo.model.Project;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProjectRepository extends ReactiveMongoRepository<Project, String> {
}