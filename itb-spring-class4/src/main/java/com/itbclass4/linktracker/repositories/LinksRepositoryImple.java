package com.itbclass4.linktracker.repositories;

import com.itbclass4.linktracker.dtos.LinkDTO;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class LinksRepositoryImple implements LinksRepository{

    private int id = 0;
    private HashMap<Integer, LinkDTO> repo;

    @Override
    public LinkDTO getLinkById(int linkId) {
        return repo.get(linkId);
    }

    @Override
    public int addLinkToRepository(LinkDTO link) {

        //Validar url y cambiar estado en isValid
        int ret = this.incrementId();
        repo.put(ret,link);
        return ret;
    }

    public void incrementMetric(int linkId){
        //Todo validar
        repo.get(linkId).incrementMetric();
    }

    public void invalidateLink(int linkId){
        repo.get(linkId).setValid(false);
    }

    public int incrementId(){
        this.id++;
        return this.id;
    }

}
