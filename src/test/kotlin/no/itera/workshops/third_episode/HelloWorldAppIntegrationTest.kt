package no.itera.workshops.third_episode

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = arrayOf(HelloWorldController::class))
@RunWith(SpringRunner::class)
class HelloWorldAppIntegrationTest {

    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun helloWorldEndpointShouldReturnHelloWorldMessage() {
        mockMvc
                .perform(get("/hello-world"))
                .andExpect(status().is2xxSuccessful)
                .andExpect(content().string("Hello World"))
    }


}