package com.db.Team2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortofolioPositionsController {
    @Autowired
    PortofolioPositionsService portofolioService;
}
