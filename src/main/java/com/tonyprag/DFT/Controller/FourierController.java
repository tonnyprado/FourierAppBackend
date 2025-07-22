package com.tonyprag.DFT.Controller;

import com.tonyprag.DFT.Services.FourierService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/fourier")
public class FourierController {

    @PostMapping
    public List<Double> calculate(@RequestBody List<Double> inputSignal){
        return FourierService.transform(inputSignal);
    }
}
