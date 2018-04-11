package kz.tsn.jedoc2016;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class launchBrowser {

     launchBrowser(String uriStr) {
        // Запуск браузера
        Desktop desktop;
        if (Desktop.isDesktopSupported()) {
            desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                // launch browser
                URI uri;
                try {
                    uri = new URI(uriStr);
                    desktop.browse(uri);
                } catch (IOException | URISyntaxException ioe) {
                }
            }
        }
    }
}
