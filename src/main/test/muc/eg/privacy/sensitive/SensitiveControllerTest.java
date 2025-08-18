package muc.eg.privacy.sensitive;

import muc.eg.privacy.sensitive.controller.SensitiveController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

 @WebMvcTest(SensitiveController.class)
public class SensitiveControllerTest {

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
