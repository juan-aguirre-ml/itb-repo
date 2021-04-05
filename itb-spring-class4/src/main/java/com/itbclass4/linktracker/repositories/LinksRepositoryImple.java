package com.itbclass4.linktracker.repositories;

import com.itbclass4.linktracker.dtos.LinkDTO;
import com.itbclass4.linktracker.exceptions.LinkNotFoundException;
import com.itbclass4.linktracker.utils.UrlValidator;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class LinksRepositoryImple implements LinksRepository{

    private int id = 0;
    private HashMap<Integer, LinkDTO> repo = new HashMap<>();

    @Override
    public LinkDTO getLinkById(int linkId) {
        return repo.getOrDefault(linkId, null);
    }

    @Override
    public int addLinkToRepository(LinkDTO link) {

        if(UrlValidator.urlValidator(link.getUrl())) {
            int ret = this.incrementId();
            repo.put(ret, link);
            return ret;
        }else
            return -1;
    }

    public void incrementMetric(int linkId){
        //Todo validar
        if (repo.containsKey(linkId))
            repo.get(linkId).incrementMetric();
    }

    public void invalidateLink(int linkId){
        if (repo.containsKey(linkId))
            repo.get(linkId).setValid(false);
    }

    public int incrementId(){
        this.id++;
        return this.id;
    }

}
