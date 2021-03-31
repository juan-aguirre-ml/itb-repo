package com.itbclass4.linktracker.services;

import com.itbclass4.linktracker.dtos.LinkDTO;
import com.itbclass4.linktracker.dtos.LinkMetricDTO;
import com.itbclass4.linktracker.exceptions.InvalidURLException;
import com.itbclass4.linktracker.repositories.LinksRepository;
import com.itbclass4.linktracker.utils.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.MalformedURLException;

@Service
public class LinkTrackerServiceImple implements LinkTrackerService {

    @Autowired
    private LinksRepository linksRepository;

    @Override
    public int createLink(LinkDTO link) throws InvalidURLException{

        if (UrlValidator.urlValidator(link.getUrl())) {
            return linksRepository.addLinkToRepository(link);

        }else
            throw new InvalidURLException();
    }

    @Override
    public String redirectLink(int linkId) {
        //Busqueda en el repo
        //Si lo tenes, redireccionas
        LinkDTO link = linksRepository.getLinkById(linkId);


        return link.getUrl();

    }

    @Override
    public LinkMetricDTO metricsLink(int linkId) {
        LinkDTO link = linksRepository.getLinkById(linkId);
        return new LinkMetricDTO(link.getMetrics().get(), link.getUrl(), link.getLinkId());
    }

    @Override
    public void invalidateLink(int linkId) {
        //Todo validar crear excepcion NotValid
        linksRepository.invalidateLink(linkId);
    }
}
