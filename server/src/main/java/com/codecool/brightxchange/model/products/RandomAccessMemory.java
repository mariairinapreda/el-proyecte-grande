package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class RandomAccessMemory extends BaseProduct{
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
