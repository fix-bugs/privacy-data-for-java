package muc.eg.privacy.sensitive;

import org.junit.jupiter.api.Test;

import static muc.eg.privacy.sensitive.SensitiveUtil.*;

public class SensitiveTest {

    /**
     * 测试用例
     */
    @Test
    public void test() {
        System.out.println("1234567890 ------> " + replace("1234567890")); // 1**0
        System.out.println("张三 ------> " + replace("张三")); // 张*三
        System.out.println("王麻子 ------> " + replace("王麻子")); // 王**子
        System.out.println("一二三四 ------> " + replace("一二三四")); // 一**四
        System.out.println("18000000001 ------> " + replaceMobile("18000000001")); // 180****0001
        System.out.println("12122sdjlsd@example.com ------> " + replaceEmail("12122sdjlsd@example.com")); // 121****@example.com
        System.out.println("110101199003072316 ------> " + replaceIdCard("110101199003072316")); // 110101****072316
    }
}
