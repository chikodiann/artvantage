package com.artvantage.blockchain;

import com.artvantage.request.PaymentRequest;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface BlockchainService {
    boolean makePayment(PaymentRequest paymentRequest);

}
