package com.codeOn.ParkingManagementSystem.repository;

import com.codeOn.ParkingManagementSystem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

    Object findByUserId(int i);
}
