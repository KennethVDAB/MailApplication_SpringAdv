package be.vdab.mail;

import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class LidController {
    private final LidService lidService;

    public LidController(LidService lidService) {
        this.lidService = lidService;
    }
    @PostMapping("leden")
    void registreer (@RequestBody @Valid NieuwLid nieuwLid) throws MessagingException {
        lidService.registreer(nieuwLid);
    }
}
