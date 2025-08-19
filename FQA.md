# 常见问题

## webflux

```
Error creating bean with name 'muc.eg.privacy.sensitive.PrivacyAppTest': Unsatisfied dependency expressed through field 'mockMvc': 
No qualifying bean of type 'org.springframework.test.web.servlet.MockMvc' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
```

> 使用 `spring-boot-starter-webflux` 会出现上面问题，更换为 `spring-boot-starter-web`