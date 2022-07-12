package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.ProcessorProducer;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Processor extends BaseProduct {
    private int id;

    private ProcessorProducer producer;

    private int socket;

    private String core;

    private int numberOfCores;

    private int threads;

    private int frequency;

    private int frequencyTurboMax;

    private int productionFactory;

    public Processor(int id, ProcessorProducer producer, int socket, String core, int numberOfCores, int threads, int frequency, int frequencyTurboMax, int productionFactory) {
        this.id = id;
        this.producer = producer;
        this.socket = socket;
        this.core = core;
        this.numberOfCores = numberOfCores;
        this.threads = threads;
        this.frequency = frequency;
        this.frequencyTurboMax = frequencyTurboMax;
        this.productionFactory = productionFactory;
    }
}
