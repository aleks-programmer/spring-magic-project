package com.spring.springlearning;

import com.spring.springlearning.magic.configurations.MagicConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = MagicConfiguration.class, loader = AnnotationConfigContextLoader.class)
@SpringBootTest
public class SpringLearningApplicationTests {

	@Test
	public void contextLoads() {

	}

}
