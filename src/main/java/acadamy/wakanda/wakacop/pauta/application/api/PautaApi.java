package acadamy.wakanda.wakacop.pauta.application.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pauta")
public interface PautaApi {
    @PostMapping
    public PautaCadastradaResponse cadastraPauta(@RequestBody NovaPautaRequest novaPauta);
}
