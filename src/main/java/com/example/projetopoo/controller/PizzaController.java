package com.example.projetopoo.controller;

import com.example.projetopoo.builder.ConcretePizzaBuilder;
import com.example.projetopoo.model.Pizza;
import com.example.projetopoo.model.Queijo;
import com.example.projetopoo.model.Sabor;
import com.example.projetopoo.model.Tamanho;
import com.example.projetopoo.repository.CondimentoRepository;
import com.example.projetopoo.repository.QueijoRepository;
import com.example.projetopoo.repository.SaborRepository;
import com.example.projetopoo.repository.TamanhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PizzaController {

    @Autowired
    private ConcretePizzaBuilder pizzaBuilder;

    @Autowired
    private CondimentoRepository condimentoRepo;

    @Autowired
    private QueijoRepository queijoRepo;

    @Autowired
    private TamanhoRepository tamanhoRepo;

    @Autowired
    private SaborRepository saborRepo;


    @GetMapping("/mainPage")
    public String mainPage(Model model) {

        tamanhoRepo.inicializar();
        saborRepo.inicializar();
        model.addAttribute("listaTamanho", tamanhoRepo.lerTudo());
        model.addAttribute("listaQueijos", queijoRepo.lerTudo());
        model.addAttribute("listaSabor", saborRepo.lerTudo());

        return "index";
    }

    @PostMapping("armazenarPizza")
    public String armazenarPizza(@RequestParam(value = "tamanhoSelect", required = false) Tamanho tamanho,
                                 @RequestParam(value = "queijoSelect", required = false) int idQueijo,
                                 @RequestParam(value = "saborSelect", required = false) Sabor sabor,
                                 Model model) {

        System.out.println("TESTEE : " + tamanho.getTexto() + " " + " " + sabor.getNome() + " " + sabor.getValorFatia());

        tamanhoRepo.inicializar();
        saborRepo.inicializar();

        Queijo queijoSelecionado = queijoRepo.ler(idQueijo);

        model.addAttribute("listaTamanho", tamanhoRepo.lerTudo());

        model.addAttribute("tamanhoSelecionado", tamanho);
        model.addAttribute("queijoSelecionado", queijoSelecionado);

        model.addAttribute("saborSelecionado", sabor);

        model.addAttribute("listaQueijos", queijoRepo.lerTudo());
        model.addAttribute("listaSabor", saborRepo.lerTudo());

        pizzaBuilder.reset();
        pizzaBuilder.setTamanho(tamanho);
        pizzaBuilder.setQueijo(queijoSelecionado);
        pizzaBuilder.setSabor(sabor);
        pizzaBuilder.setPreco();
        Pizza pizza = pizzaBuilder.getProduct();

        System.out.println("pizza: " + pizza.getSabor().getNome() + " " + pizza.getQueijo().getNome() +  "" + pizza.getTamanho().getTexto());

        model.addAttribute("pizza", pizza);

        String texto =  "Pizza: "
                        + pizza.getTamanho().getTexto()
                        + " " + pizza.getQueijo().getNome()
                        + " " + pizza.getSabor().getNome()
                        + " " + pizza.getPreco();

        model.addAttribute("textoPizza", texto);

        return "index";
    }

    @GetMapping("/pagamento/oi") public String confirmarPagamento() {
        return "pagamento";
    }
}
