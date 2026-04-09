package com.vineel.trademonitor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TradeService {

    private final TradeRepository tradeRepository;

    public TradeService(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    public List<Trade> getTrades(String status, String product) {

        List<TradeEntity> entities = tradeRepository.findAll();

        return entities.stream()
                .filter(t -> status == null || status.isBlank() || t.getStatus().equalsIgnoreCase(status))
                .filter(t -> product == null || product.isBlank() || t.getProduct().equalsIgnoreCase(product))
                .map(t -> new Trade(
                        t.getId(),
                        t.getTrader(),
                        t.getProduct(),
                        t.getStatus()
                ))
                .collect(Collectors.toList());
    }
}