package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    private double balance = 0;

    @Value("${DOMAIN_NAME}")
    private String domainName;

    @GetMapping
    public ResponseEntity<String> getBalance() {
        return ResponseEntity.ok("account balance is " + balance);
    }

    @PostMapping
    public ResponseEntity<String> updateBalance(@RequestBody BalanceUpdateRequest request) {
        balance += request.getCredit();
        balance -= request.getDebit();
        return ResponseEntity.ok("Balance updated");
    }

    public static class BalanceUpdateRequest {
        private double credit;
        private double debit;

        public double getCredit() {
            return credit;
        }

        public void setCredit(double credit) {
            this.credit = credit;
        }

        public double getDebit() {
            return debit;
        }

        public void setDebit(double debit) {
            this.debit = debit;
        }
    }
}