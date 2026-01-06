package win.babrakov.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import win.babrakov.limits_service.bean.Limits;
import win.babrakov.limits_service.configuration.LimitsConfiguration;

@RestController
public class LimitsController {

    @Autowired
    private LimitsConfiguration limitsConfiguration;

    @GetMapping("/limits")
    public Limits getLimits() {
//        return new Limits(1,1000);
        return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
    }

}
