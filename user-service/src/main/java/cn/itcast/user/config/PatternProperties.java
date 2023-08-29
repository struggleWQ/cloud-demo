package cn.itcast.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: wangqi
 * @Date: 2023/08/10/15:55
 * @Description:
 */
@Data
@Component
@ConfigurationProperties(prefix = "pattern") //nacos配置热更新
public class PatternProperties {
    private String dateformat;
}
