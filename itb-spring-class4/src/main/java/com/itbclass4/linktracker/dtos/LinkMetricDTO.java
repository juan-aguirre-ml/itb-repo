package com.itbclass4.linktracker.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LinkMetricDTO {
    private int metric;
    private String url;
    private int linkId;

}
