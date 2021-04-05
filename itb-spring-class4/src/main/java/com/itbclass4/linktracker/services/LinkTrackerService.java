package com.itbclass4.linktracker.services;

import com.itbclass4.linktracker.dtos.LinkDTO;
import com.itbclass4.linktracker.dtos.LinkMetricDTO;
import com.itbclass4.linktracker.exceptions.InvalidURLException;

public interface LinkTrackerService {

    public int createLink(LinkDTO link) throws InvalidURLException;

    public String redirectLink(int linkId);
    public String redirectLink(int linkId, String password) throws InvalidURLException;


    public LinkMetricDTO metricsLink(int linkId);

    public void invalidateLink(int linkId);


}
