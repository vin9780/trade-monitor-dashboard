package com.vineel.trademonitor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final TradeRepository tradeRepository;

    public DataLoader(TradeRepository tradeRepository) {
        this.tradeRepository = tradeRepository;
    }

    @Override
    public void run(String... args) {
        if (tradeRepository.count() == 0) {
            tradeRepository.save(new TradeEntity("6501", "Alice", "FX Forward", "NEW"));
            tradeRepository.save(new TradeEntity("6230", "Bob", "Swap", "PENDING"));
            tradeRepository.save(new TradeEntity("6847", "Carol", "Bond", "SETTLED"));
            tradeRepository.save(new TradeEntity("6223", "David", "Option", "CANCELLED"));
        }
    }
}
