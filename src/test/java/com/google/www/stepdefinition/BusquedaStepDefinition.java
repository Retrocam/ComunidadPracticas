package com.google.www.stepdefinition;

import com.google.www.steps.BuscarProductoStep;
import cucumber.api.java.es.*;
import net.thucydides.core.annotations.Steps;

public class BusquedaStepDefinition {
    @Steps
    BuscarProductoStep buscarProductoStep;

    @Dado("^que me encuentro en la pagina de Google https://www\\.google\\.com/$")
    public void que_me_encuentro_en_la_pagina_de_Google_https_www_google_com() {

        buscarProductoStep.abrirPagina();
    }

    @Cuando("^Busco un producto$")
    public void busco_un_producto() {

    }

    @Entonces("^Valido que me muestre productos relacionados$")
    public void valido_que_me_muestre_productos_relacionados() {

    }
}
