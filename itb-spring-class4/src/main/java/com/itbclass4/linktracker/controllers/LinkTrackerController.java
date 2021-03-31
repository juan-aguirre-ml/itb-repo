package com.itbclass4.linktracker.controllers;

import com.itbclass4.linktracker.dtos.ErrorDTO;
import com.itbclass4.linktracker.dtos.LinkDTO;
import com.itbclass4.linktracker.exceptions.InvalidURLException;
import com.itbclass4.linktracker.services.LinkTrackerService;
import com.itbclass4.linktracker.utils.UrlValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class LinkTrackerController {

    private LinkTrackerService linkTrackerService;

    public LinkTrackerController(LinkTrackerService linkTrackerService) {
        this.linkTrackerService = linkTrackerService;
    }


    @PostMapping("/link")
    public int createLink(@RequestBody LinkDTO link) throws InvalidURLException{
        return linkTrackerService.createLink(link);
    }

    @PostMapping("/invalidate/{linkId}")
    public void invalidateLink(){}

    @GetMapping("/metrics/{linkId}")
    public void statistics(){}

    @GetMapping("/link/{linkId}")
    public RedirectView redirect(@RequestParam int linkId){
        String link = linkTrackerService.redirectLink(linkId);
        return new RedirectView(link);
    }

    @ExceptionHandler(value = {InvalidURLException.class})
    public ResponseEntity<ErrorDTO> handleException(InvalidURLException errorException){
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setName("Invalid URL format");
        errorDTO.setMessage("The URL " + errorException.getMessage() + " is invalid");
        return new ResponseEntity<>(errorDTO, HttpStatus.BAD_REQUEST);
    }
}
