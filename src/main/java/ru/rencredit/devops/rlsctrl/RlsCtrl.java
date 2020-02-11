package ru.rencredit.devops.rlsctrl;

import javax.inject.Inject;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import ru.rencredit.devops.rlsctrl.model.Solution;

public class RlsCtrl {
    public static RlsCtrl instance = new RlsCtrl();
    public static void main(String[] args) {
        RlsCtrl.instance.getSolution();
    }

    @Inject
    @ConfigProperty(name="solution.path", defaultValue="./")
    protected String solutionPath;

    public Solution getSolution() {

        /*
        Config config = ConfigProvider.getConfig();
        String solutionPath = config.getOptionalValue("solution.path", String.class).orElse("./");
        */
        System.out.printf(" Solution path: %s", solutionPath);
        return new Solution();
    }

}
