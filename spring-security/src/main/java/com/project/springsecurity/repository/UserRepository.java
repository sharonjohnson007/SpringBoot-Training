package com.project.springsecurity.repository;

import com.project.springsecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {

    @Query("select u FROM Users u WHERE u.userName= :userName")
    public Users getUsersByUserName(@Param("userName") String userName);
}
