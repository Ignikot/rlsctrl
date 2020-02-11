package ru.rencredit.devops.rlsctrl;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

public class RlsCtrl {
    public static void main(String[] args) {
        Config config = ConfigProvider.getConfig();
        String solutionPath = config.getOptionalValue("solution_path", String.class).orElse("./");
        System.out.printf(" Solution path: %s", solutionPath);
    }
}
