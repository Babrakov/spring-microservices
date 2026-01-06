package win.babrakov.limits_service.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {

    private int minimum;
    private int maximum;

}
