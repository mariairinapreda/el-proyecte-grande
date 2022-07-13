package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class RandomAccessMemory extends BaseProduct{
    @JsonProperty("ramId")
    private int id;
    @JsonProperty("ramProducer")
    private RAMProducer ramProducer;
    @JsonProperty("memoryType")
    private RandomAccessMemoryType memoryType;
    @JsonProperty("ramCapacity")
    private int capacity;
    @JsonProperty("ramFrequency")
    private int frequency;

    public RandomAccessMemory(int id, RAMProducer ramProducer, RandomAccessMemoryType memoryType, int capacity, int frequency) {
        this.id = id;
        this.ramProducer = ramProducer;
        this.memoryType = memoryType;
        this.capacity = capacity;
        this.frequency = frequency;
    }
}
