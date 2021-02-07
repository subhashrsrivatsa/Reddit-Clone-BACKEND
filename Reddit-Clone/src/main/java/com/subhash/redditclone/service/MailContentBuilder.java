/**
 * 
 */
package com.subhash.redditclone.service;

import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import lombok.AllArgsConstructor;

/**
 * @author Subhash
 *
 */

@Service
@AllArgsConstructor
public class MailContentBuilder {

    private final TemplateEngine templateEngine = new TemplateEngine();

    public String build(String message) {
        Context context = new Context();
        context.setVariable("message", message);
        return templateEngine.process("mailTemplate", context);
    }
}
