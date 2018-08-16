package net.kalytta.osgi.webserver;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class WebserverActivator implements BundleActivator {

    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Webserver Bundle Started");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Webserver Bundle Stopped");
    }
}
