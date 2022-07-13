package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.ProcessorProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Processor extends BaseProduct {
    @JsonProperty("processorId")
    private int id;
    @JsonProperty("processorProducer")
    private ProcessorProducer producer;
    @JsonProperty("processorSocket")
    private int socket;
    @JsonProperty("processorCore")
    private String core;
    @JsonProperty("processorNumberOfCores")
    private int numberOfCores;
    @JsonProperty("processorThreads")
    private int threads;
    @JsonProperty("processorFrequency")
    private int frequency;
    @JsonProperty("processorFrequencyTurboMax")
    private int frequencyTurboMax;
    @JsonProperty("processorProductionFactory")
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
