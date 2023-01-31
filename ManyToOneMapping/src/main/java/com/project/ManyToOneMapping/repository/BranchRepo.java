package com.project.ManyToOneMapping.repository;

import com.project.ManyToOneMapping.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepo extends JpaRepository<Branch,Long> {




}
