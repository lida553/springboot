package com.zimug.bootlaunch.model.yaml;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Data
@Component
@Validated//配合ConfigurationProperties属性装载时验证数据
@ConfigurationProperties(prefix = "family")
public class Family {

    //yml注入 配合Component
    //@Value("${family.family-name}")
    @NotEmpty
    private String familyName;

    private Father father;

    private Mother mother;

    private Child child;
}
