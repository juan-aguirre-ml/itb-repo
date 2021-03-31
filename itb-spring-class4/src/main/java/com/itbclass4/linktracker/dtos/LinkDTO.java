package com.itbclass4.linktracker.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;


@Data
@AllArgsConstructor
public class LinkDTO {

    private String url;
    private int linkId;
    private AtomicInteger metrics;
    private String password;
    private boolean isValid;

    public void incrementMetric(){
        metrics.incrementAndGet();
    }



}
