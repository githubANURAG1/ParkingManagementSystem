package com.codeOn.ParkingManagementSystem.manager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codeOn.ParkingManagementSystem.repository.UserRepo;

@Service
public class ManagerServiceImpl {
    @Autowired
    private UserRepo userRepo;

    public String getManagers(){
        String data= userRepo.findByUserId(1).toString();
        System.out.println("managerData"+data);
        return data;
    }
}
