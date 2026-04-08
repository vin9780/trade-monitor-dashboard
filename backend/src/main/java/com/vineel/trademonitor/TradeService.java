package com.vineel.trademonitor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TradeService {

    public List<Trade> getTrades(String status, String product) {
        List<Trade> trades = List.of(
                new Trade("TRD1", "Alice", "FX Forward", "NEW"),
                new Trade("TRD2", "Bob", "Swap", "PENDING"),
                new Trade("TRD3", "Carol", "Bond", "SETTLED"),
                new Trade("TRD4", "David", "Option", "CANCELLED")
        );

        return trades.stream()
                .filter(t -> status == null || status.isBlank() || t.getStatus().equalsIgnoreCase(status))
                .filter(t -> product == null || product.isBlank() || t.getProduct().equalsIgnoreCase(product))
                .collect(Collectors.toList());
    }
}