package com.github.funthomas424242.cucumber.stepdefs;

import com.github.funthomas424242.AwkApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AwkApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
