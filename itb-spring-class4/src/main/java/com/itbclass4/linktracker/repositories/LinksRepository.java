package com.itbclass4.linktracker.repositories;

import com.itbclass4.linktracker.dtos.LinkDTO;

public interface LinksRepository {
    public LinkDTO getLinkById(int linkId);

    public int addLinkToRepository(LinkDTO link);

    void invalidateLink(int linkId);

}
