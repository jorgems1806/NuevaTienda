package com.tienda.controller;


import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j

public class IndexController
{
   @Autowired 
   private ArticuloService articuloService;
           
   @GetMapping("/")
   public String inicio(Model model)
   {
         
       var articulos=articuloService.getArticulos(true);                               //se crea la lista
       model.addAttribute("articulos",articulos);
       return "Index";
   }
   
   
}
