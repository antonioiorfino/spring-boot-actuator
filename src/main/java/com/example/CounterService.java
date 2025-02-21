package com.example;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    private int count = 0;

    public int increment() {
        System.out.println("Il valore è di "+ ++count);
        return count;
    }

    public void longRunningTask() throws InterruptedException {
        // Simula un'operazione a lungo termine
        System.out.println("Inizio operazione a lungo termine...");
        Thread.sleep(30000); // Simula un'attesa di 30 secondi
        System.out.println("Operazione a lungo termine completata.");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Esecuzione della logica di shutdown...");
        // Logica di pulizia, se necessaria
    }

}
