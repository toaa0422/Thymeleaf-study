package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {

        TemplateEngine engine = new TemplateEngine();
        ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
        engine.setTemplateResolver(resolver);
        Context context = new Context();
        context.setVariable("name","lisi");
        String html= engine.process("main.html", context);
        System.out.println(html);

    }
}
