package com.codeOn.ParkingManagementSystem.parking;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(schema = "users")
public class parkingDetailsDTO {

    @Column(name = "user_id")
    int userId;
    @Column(name = "user_name")
    int userName;
    @Column(name = "user_role")
    int userRole;
}
