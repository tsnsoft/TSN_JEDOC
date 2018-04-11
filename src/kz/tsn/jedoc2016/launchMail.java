package kz.tsn.jedoc2016;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class launchMail {
     launchMail(String mailTo) {
        // Отправка письма
        Desktop desktop;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.MAIL)) {
                URI uriMailTo;
                try {
                    if (mailTo.length() > 0) {
                        uriMailTo = new URI("mailto", mailTo, null);
                        desktop.mail(uriMailTo);
                    } else {
                        desktop.mail();
                    }
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                } catch (URISyntaxException use) {
                    use.printStackTrace();
                }
            }
        }
    }
}
