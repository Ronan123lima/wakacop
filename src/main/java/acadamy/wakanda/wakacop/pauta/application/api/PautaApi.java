package acadamy.wakanda.wakacop.pauta.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaApi {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public PautaCadastradaResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);
}
