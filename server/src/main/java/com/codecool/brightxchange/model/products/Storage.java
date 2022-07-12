package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.StorageProducer;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Storage extends BaseProduct {
    private int ssdId;
    private HDD hdd;
    private StorageProducer storageProducer;
    private SSD ssd;
    private int capacity;
    private String unit;


    public Storage(int ssdId, HDD hdd, StorageProducer storageProducer, SSD ssd, int capacity, String unit) {
        this.ssdId = ssdId;
        this.hdd = hdd;
        this.storageProducer = storageProducer;
        this.ssd = ssd;
        this.capacity = capacity;
        this.unit = unit;
    }


}
