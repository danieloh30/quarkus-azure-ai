package org.acme;

import dev.langchain4j.agent.tool.Tool;
import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class EmailService {

    @Inject
    Mailer mailer;

    @Tool("send the details to email")
    public void send(String content) {
        mailer.send(Mail.withText("jdconf@quarkus.io","New Finance Infomation for you!!!",content).setFrom("noreply@quarkus.io"));
    }
}
