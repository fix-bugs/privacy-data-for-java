# 隐私数据相关

## 数据加密解密
WIP

## 数据脱敏

### 测试用例

- SensitiveTest
```
1234567890 ------> 1**0
张三 ------> 张**
王麻子 ------> 王**子
一二三四 ------> 一**四
18000000001 ------> 180****0001
12122sdjlsd@example.com ------> 121****@example.com
110101199003072316 ------> 110101****2316
```

- SensitiveControllerTest
```
MockHttpServletResponse:
           Status = 200
    Error message = null
          Headers = [Content-Type:"application/json"]
     Content type = application/json
             Body = {"id":"123","name":"z**n","mobile":"180****2222","email":"123@example.com","idCard":"44010119900101001X","registerTime":"2025-01-01 00:00:00"}
    Forwarded URL = null
   Redirected URL = null
          Cookies = []
```
