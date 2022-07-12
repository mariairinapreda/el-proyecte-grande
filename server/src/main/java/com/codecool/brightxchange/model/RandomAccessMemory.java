package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class RandomAccessMemory {
    private int id;

    private RAMProducer ramProducer;

    private RandomAccessMemoryType memoryType;

    private int capacity;

    private int frequency;

    public RandomAccessMemory(int id, RAMProducer ramProducer, RandomAccessMemoryType memoryType, int capacity, int frequency) {
        this.id = id;
        this.ramProducer = ramProducer;
        this.memoryType = memoryType;
        this.capacity = capacity;
        this.frequency = frequency;
    }
}
