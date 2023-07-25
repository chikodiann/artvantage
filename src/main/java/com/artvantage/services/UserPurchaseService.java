package com.artvantage.services;

//import com.artvantage.entity.UserPurchase;
import com.artvantage.repositories.UserPurchaseRepository;
import org.springframework.stereotype.Service;

@Service
public class UserPurchaseService {
    private final UserPurchaseRepository userPurchaseRepository;

    public UserPurchaseService(UserPurchaseRepository userPurchaseRepository) {
        this.userPurchaseRepository = userPurchaseRepository;
    }

}


