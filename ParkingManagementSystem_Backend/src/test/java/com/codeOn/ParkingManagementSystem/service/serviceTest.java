package com.codeOn.ParkingManagementSystem.service;

import com.codeOn.ParkingManagementSystem.manager.ManagerServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class serviceTest {
    @Autowired
    private ManagerServiceImpl manager;

    @Test
    public void managerTest(){
        Assertions.assertNotNull(manager.getManagers());
    }
}
