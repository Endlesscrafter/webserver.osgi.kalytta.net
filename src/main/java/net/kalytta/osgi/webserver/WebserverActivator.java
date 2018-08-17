package net.kalytta.osgi.webserver;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import net.kalytta.osgi.logging.LoggingService;
import org.osgi.framework.ServiceReference;

public class WebserverActivator implements BundleActivator {

    private LoggingService loggingService;

    public void start(BundleContext bundleContext) throws Exception {
        //LoggingService heranholen
        ServiceReference[] refs = bundleContext.getServiceReferences("net.kalytta.osgi.logging.LoggingService", null);
        if (refs != null) {
            System.out.println(refs[0].getBundle());
            loggingService = (LoggingService) bundleContext.getService(refs[0]);
        }
        if(loggingService == null){
            System.out.println("[Core] FATAL No Logging Service found!");
            throw new IllegalStateException();
        }

        loggingService.info("Webserver","module started.");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("Webserver Bundle Stopped");
    }
}
