package com.pages;

import net.serenitybdd.core.pages.PageObject;

public abstract class AbstractPage extends PageObject {

    public void windowMaximize() {
        getDriver().manage().window().maximize();
    }
}