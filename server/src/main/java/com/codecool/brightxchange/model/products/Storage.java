package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.StorageProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Storage extends BaseProduct {
    @JsonProperty("storageId")
    private int id;
    @JsonProperty("storageHDD")
    private HDD hdd;
    @JsonProperty("storageProducer")
    private StorageProducer storageProducer;
    @JsonProperty("storageSSD")
    private SSD ssd;
    @JsonProperty("storageCapacity")
    private int capacity;
    @JsonProperty("storageUnit")
    private String unit;


    public Storage(int id, HDD hdd, StorageProducer storageProducer, SSD ssd, int capacity, String unit) {
        this.id = id;
        this.hdd = hdd;
        this.storageProducer = storageProducer;
        this.ssd = ssd;
        this.capacity = capacity;
        this.unit = unit;
    }


}
