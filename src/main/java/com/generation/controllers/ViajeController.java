package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Viaje;
import com.generation.service.ViajeService;

@Controller
@RequestMapping("/viajes")
public class ViajeController {

    @Autowired
    ViajeService viajeService;

    @RequestMapping("")
    public String enviarViaje(@ModelAttribute("viaje") Viaje viaje){

        return "agendarViaje.jsp";
    }

    @PostMapping("/registro")
    public String RegistrarViaje(@Valid @ModelAttribute("viaje") Viaje viaje,BindingResult resultado,Model model){

        if(resultado.hasErrors()){
            model.addAttribute("msgError","Debe llenar todos los campos,inténtelo nuevamente");

            return "agendarViaje.jsp";
        }

        else{
        
        viajeService.saveViaje(viaje);
        List<Viaje> listaViajes = viajeService.findAll();
			//pasamos la lista de autos al jsp
			model.addAttribute("viajesAgendados", listaViajes);
        return "viajesInfo.jsp";
        }
    }

}
