package com.google.www.steps;

import com.google.www.pageObject.GogglePageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebdriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BuscarProductoStep {
    GogglePageObject gogglePageObject = new GogglePageObject();
    @Step
    public void abrirPagina(){
        gogglePageObject.open();
    }
}
