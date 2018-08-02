package org.google.tez;

import org.google.tez.repository.UserRepository;
import org.google.tez.service.MailService;
import org.google.tez.service.UserService;
import org.google.tez.service.dto.UserDTO;
import org.google.tez.web.rest.util.PaginationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/tez")
public class TezResource {

    private final Logger log = LoggerFactory.getLogger(TezResource.class);

    private final UserService userService;

    private final UserRepository userRepository;

    private final MailService mailService;

    public TezResource(UserService userService, UserRepository userRepository, MailService mailService) {

        this.userService = userService;
        this.userRepository = userRepository;
        this.mailService = mailService;
    }

    @RequestMapping("/pay")
    public String hello() {
        return "index";
    }
}
