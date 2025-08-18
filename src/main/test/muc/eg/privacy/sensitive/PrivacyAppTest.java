package muc.eg.privacy.sensitive;

import muc.eg.privacy.PrivacyApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest(classes = PrivacyApplication.class)
@AutoConfigureMockMvc
public class PrivacyAppTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSensitive() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/sensitive/getUserInfo?id=123"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("z**n"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.mobile").value("180****2222"));
    }
}
